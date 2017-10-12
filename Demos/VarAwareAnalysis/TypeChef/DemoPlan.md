
<p style="border:1px; border-style:solid; border-color:black; padding: 1em;">
CMPUT 663 - Fall 2017<br/>
TypeChef Demo Plan<br/>
Dr. Sarah Nadi -- University of Alberta
</p>


#TypeChef

* The TypeChef jar file is already in this repo. It has been downloaded from the TypeChef [GitHub Repo](https://github.com/ckaestne/typechef).
* The `systems` directory is needed, but due to its size, I have not included it here. You can download it from the [link](http://www.cs.cmu.edu/~ckaestne/tmp/includes-redhat.tar.bz2) provided by Christian Kästner. Make sure that `systems` directory is directly in this folder.


Here is what we will see:

* Run 

```
java -jar TypeChef-0.3.7.jar -c redhat.properties --openFeat=features --typecheck --writePI world.c
``` 
to show the world/bye example discussed in the slides. You can look at the produced `.pi` file to see the preprocessor's output. You should get 3 type errors here (for some reason that I didn't debug, the second two are actually repeated errors).

* Run 
``` 
java -jar TypeChef-0.3.7.jar -c redhat.properties --typecheck  --writePI test.c
``` 

to see the detailed lexing and parsing example discussed in the slides. Do you expect any errors here?

* Run 

```
java -jar TypeChef-0.3.7.jar -c redhat.properties --openFeat=features_calculate --typecheck --writePI calculate.c
```

This is an example not seen in the slides. Do you expect any errors here?