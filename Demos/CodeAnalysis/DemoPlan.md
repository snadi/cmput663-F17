
<p style="border:1px; border-style:solid; border-color:black; padding: 1em;">
CMPUT 663 - Fall 2017<br/>
Demo plan for various code analysis tools plus mining other repositories<br/>
Dr. Sarah Nadi -- University of Alberta
</p>


#Eclipse JDT Demo

This is based on the tutorial [https://www.programcreek.com/2011/01/a-complete-standalone-example-of-astparser/](https://www.programcreek.com/2011/01/a-complete-standalone-example-of-astparser/)

1. Clone the course repo `git clone https://github.com/snadi/cmput663-F17.git`
2. Open project from `Demos/CodeAnalysis/ASTDemos` -- you can import as a mvn project from your favorite IDE or directly open the IntelliJ project
3. Show and run `VarDeclCounter.java`
4. Show and run `MethodInvPrinter.java`
5. Show and run `MethodInvocationCounter.java`


#Spoon Demo

This is based on the examples here [https://github.com/SpoonLabs/spoon-examples](https://github.com/SpoonLabs/spoon-examples)

1. Clone the spoon-examples repo `git clone https://github.com/SpoonLabs/spoon-examples.git`
2. Import the mvn project into your favorite IDE or run mvn commands on the command line (Follow ReadMe file)
3. Show `src/main/java/fr/inria/gforge/spoon/analysis/CatchProcessor.java` and run corresponding test `src/test/java/fr/inria/gforge/spoon/analysis/CatchProcessorTest.java`
4. Analyze the catch blocks under `src/test/resources` to see that there are really two empty catch blocks
5. Add another empty catch block in one of the java test files under `src/test/resources` and show that the test would fail, since number of empty catch blocks is now 3


# SrcML Demo

This is based on [http://www.srcml.org/tutorials/creating-srcml.html](http://www.srcml.org/tutorials/creating-srcml.html)

1. Download srcML from  [http://www.srcml.org/#download](http://www.srcml.org/#download) 
2. Create a file called `rotate.cpp` in your srcML directory with the following code

```
#include "rotate.h"
// rotate three values
void rotate(int& n1, int& n2, int& n3)
{
 // copy original values
 int tn1 = n1, tn2 = n2, tn3 = n3;
 // move
 n1 = tn3;
 n2 = tn1;
 n3 = tn2;
}
```

3. Run `./srcML/bin/srcml rotate.cpp -o rotate.xml` -- This will create the rotate.xml file
4. Display `rotate.xml`. If your editor does not properly format the xml, you can use [https://www.freeformatter.com/xml-formatter.html](https://www.freeformatter.com/xml-formatter.html)
5. Let's start querying!
	* `./srcML/bin/srcml --xpath "//src:function/src:name" rotate.xml` -- lists the names of all functions
	* `./srcML/bin/srcml --xpath "//src:function[src:parameter_list[count(src:parameter) = 2]]/src:name" rotate.xml` -- lists the functions with exactly 2 parameters. Should not have any output in current example

#BOA Demo

Boa homepage is [http://boa.cs.iastate.edu](http://boa.cs.iastate.edu) and contains all necessary documentation. You need an account to run queries.

1. View the example at [http://boa.cs.iastate.edu/examples/index.php#null-check](http://boa.cs.iastate.edu/examples/index.php#null-check)
2. Run the example on the small dataset (so it finishes quickly)
3. Go to your list of jobs to view the result
4. For modified code to list file and null check: See Job id 45225 in my jobs (applicable for Sarah). Here, the output is modified to print the repository and commit hash

#ChangeDistiller Demo

Homepage for this line of work is [http://www.ifi.uzh.ch/en/seal/research/tools/changeDistiller.html](http://www.ifi.uzh.ch/en/seal/research/tools/changeDistiller.html) and source code repository is here: [https://bitbucket.org/sealuzh/tools-changedistiller/wiki/Home](https://bitbucket.org/sealuzh/tools-changedistiller/wiki/Home). You can follow the instructions in the repository wiki page to create the necessary jar files. To save time, I have created a project with the created jar file as a dependency and a small code example taken from their page as an example.

1. From the cloned course demo, go to `Demos/CodeAnalysis/ChangeDistiller/ChangeDistillerDemo`. You can directly import it as an IntelliJ project, compile it directly, or import it into another IDE
2. Run `ChangeDistillerDemo` and see the reported changes

#StackOverflow Demo

I will use query example from my ICSE '16 paper. See the artifact page here [http://www.st.informatik.tu-darmstadt.de/artifacts/crypto-api-misuse/](http://www.st.informatik.tu-darmstadt.de/artifacts/crypto-api-misuse/)

1. Go to [https://data.stackexchange.com/stackoverflow/queries](https://data.stackexchange.com/stackoverflow/queries)
2. Go to Users and search for `sarah.nadi`
3. Go to favorite queries and select `Top 100 questions matching given tags`
4. Enter tags "java", "cryptography" and excluding "javascript" and run query
5. Download the csv file (a similar csv file has already been saved in the course repo so we can use it for the LDA demo later) 

#Bugzilla Demo

Demo is based on [https://github.com/ansymo/msr2013-bug_dataset](https://github.com/ansymo/msr2013-bug_dataset)

1. Clone the repository `git clone https://github.com/ansymo/msr2013-bug_dataset.git`
2. Follow the example for finding swear words in the ReadMe, mainly running `ruby swearing.rb`


#LDA Tutorial

1. Show `Demos/LDA/lda_demo.R` and run using `Rscript lda_demo.R`. You can also execute things bit by bit to allow yourself to examine the data etc.
2. Show `Demos/LDA/so_lda_demo.R` and and run using `Rscript so_lda_demo.R`. You can also execute things bit by bit to allow yourself to examine the data etc. Check out the produced graph. What does it tell you? How can it be improved?