#CMPUT 663: Software Maintenance and Reuse


##Course Overview

Software has become an essential component in all our daily services and products. Good software engineering practices are essential to develop resuable and reliable software. Researchers and practitioners are constantly developing innovative techniques and tooling to improve software maintenance and reuse. Goals include earlier detection of bugs, faster and more correct use of Application Programming Interfaces (APIs), and smoother refactoring of code for better reuse. 

Credits: Many of the advise offered by Ahmed Hassan in his [paper on raising MSR researchers](http://dl.acm.org/citation.cfm?id=2901780) has been integrated in the design of this course.

##Course Objectives

This seminar course explores seminal and state-of-the-art research on software maintenance, evolution, and reuse. While a variety of problems related to maintenance and reuse are explored in this course, the common methodology used for studying these problems is mining software repositories. *Mining software repositories* involves mining and analyzing software engineering data from various repositories such as version control repositories, bug repositories, developer forums, etc. At the end of the course, students will acquire the knowledge needed to perform quantitative and qualitative studies using SE data, which they can later integrate into their own research. Additionally, students will learn how to read and critique research papers.

The course instructor will provide some background lectures during the first two weeks of the course. During the remainder of the course, students will present and discuss papers related to the course topics.

##Course Topics

* Software evolution
* Bug prediction and bug detection
* Code duplication
* Code reuse
* API usage patterns
* Highly configurable systems and software product lines
* Code recommender systems

##Course Work

###<span style="color:red">1. Paper presentation and discussion (20%)</span>

We will discuss one paper per class. Each class, one student will be responsible for presenting and discussing the paper. The presentation should last **at most** 25 min + 5min for summarizing the discussion.

While each person's presentation style is different, your presentation should include the following information:

* Introduce the authors of the paper. Who are they? What are they doing now? What line of work are they particularly famous for? Did they continue working on this topic?
* Background: What is the paper about ? — give some background about the topic
* Motivation: What is the problem being addressed? Why is this problem important?
* Methodology: How did the authors address this problem?
* Evaluation: How did the authors evaluate their solution (if applicable)? What were the results?
* Limitations/threats: Are there any limitations/threats to the techniques followed? This can include additional points that you see.
* Summary: Summarize what the paper did by stating what the take-home message of the paper is + 3 points you liked + 3 points that can be improved.
* You should also relate this paper to other papers we covered in the course. This can, for example, include methodology/tools discussed in lectures or other papers, common techniques or data sources used, or a common problem being addressed.

To make it more concrete, I will look for the following in your talk (Again the style and order can match your personal taste):

* one slide that lists the main contributions of the paper.
* one slide that places the paper relative to any recent work done by the authors. E.g., did they follow up on this work later on? Did they improve it? 
* one slide that links the paper relative to other papers/techniques discussed in the course
* one slide that summarizes the key points from the easychair discussions about your paper (i.e., the strengths and concerns raised by your colleagues)
* as the **final** slide, a take-home message + 3 technical points that you liked + 3 areas that should be improved. This would kick-start the discussion.

###<span style="color:red">2. Weekly Paper Critiques (10%)</span>

Every class, each student who is not presenting that day should submit a critique of the paper being presented. Please submit your critique 48hrs before the start of class using easychair. Additional advise for critiquing papers is [here](http://cs.queensu.ca/~ahmed/home/teaching/CISC880/F16/papers/reviewing-smith.pdf). 

Please structure your critique as follows:

* A maximum of 6 sentences summarizing the paper.
* Three bullet points that state the strengths of the paper. For each bullet point, you can add a maximum of 3 sentences elaborating your point.
* Three bullet points that state technical weaknesses of the paper. For each bullet point, you can add a maximum of 3 sentences to elaborate your point. Think about weaknesses in motivation, assumptions, methodology, or evaluation techniques.

###<span style="color:red">3. Class Participation (10%)</span>

You are expected to come prepared to class by reading each assigned paper and actively participating in the discussion. 

###<span style="color:red">4. Assignments (20%)</span>

####Assignment 1 (10%)

*Assignment 1 is due on September 28, 2017 and its presentation is due on October 3, 2017*

The goal of this assignment is to give you hands-on training into some of the MSR techniques used. To make the task easier, you will do a replication study, which is often harder than it seems. 

In groups of 2, you will replicate one of the MSR challenge reports from [MSR '12](http://2012.msrconf.org/challenge.php) (Android Data), [MSR '13](http://2013.msrconf.org/challenge.php) (StackOverflow Data), [MSR '14](http://2014.msrconf.org/challenge.php) (GitHub Data), or [MSR '16](http://2017.msrconf.org/#/challenge) (Travis CI Data). Choose one of the published challenge papers and try to replicate their result. For each conference edition, you will find the challenge reports in the program tab under the Challenge session. Create a public GitHub repository that contains all the scripts/code you used to replicate the study, as well as your results. Your repository's ReadMe page should explain what is in the repo, how to replicate your results, and any differences from the original study (whether things you had to assume in the setup or things 

You will give a 15min presentation on the results of your assignment. Your presentation should:

* State the challenge paper being replicated
* What is the problem being solved?
* Describe the data set and methodology used
* Describe the results you obtained
* How did your results compare to the originally published results?
* Describe any difficulties you faced or lessons you learned in the process
* Include your GitHub repository URL on your title or conclusion slides

Submit your GitHub repositories on September 28 and make sure you upload your slides before your presentation on October 3.

####Assignment 2 (10%)

*Assignment 2 is due on October 26, 2017 and its presentation is due on October 31, 2017*

Choose one of the forty systems described in "An analysis of the variability in forty preprocessor-based software product lines" by Liebig et al., ICSE '10. First, run cppstats on the version used in the paper and compare your results with those in the paper. Second, run cppstats on the latest 5 versions of the same system you chose and report the evolution. Create the appropriate graph to show the evolution of each metric. For both parts, please report the following metrics:

* LOC: Lines of normalized code
* LOF: Lines of normalized CPP-annotated code
* PLOF: Relative fraction of CPP-annotated code (LOF/LOC)
* VP: Number of variation points (#ifdef blocks)
* CC: Number of configruation options/constants
* LOF#IFDEF: average number of LOF within each VP
* SD#ifdef: average number of #ifdefs per CC
* SDfile: average number of files per CC
* TD#ifdef: average number of CCs per #ifdef
* TDfile: average number of CCs per file
* NDavg: average nesting depth of #ifdefs
* TDfile: maximum nesting depth of #ifdefs

Useful resources to look at:

* [http://fosd.net/cppstats](http://fosd.net/cppstats) -- from original ICSE '10 paper
* [http://www.fosd.de/oss_vs_is/](http://www.fosd.de/oss_vs_is/) -- from an extended [paper](https://link.springer.com/article/10.1007/s10664-015-9360-1)
* [https://github.com/joliebig/cppstats](https://github.com/joliebig/cppstats)


###<span style="color:red">5. Course Project (40%)</span> 

####Project Proposal (No grade)

You should email me a 1 page project proposal by Oct. 3. Projects should be done on an individual basis. You may propose your own topic related to the theme of the course or choose one of the [suggested topics](???). While there is no grade on the project proposal, I **must approve** your project in order for you to continue with the course. Additional advise for project proposals can be found [here](http://cs.queensu.ca/~ahmed/home/teaching/CISC880/F16/papers/HPProjectProposalTemplate.pdf). Your project proposal should cite at least 3 papers.

####Project Update Presentation (5%)

To ensure that you are on the right track for your project, you will give a short 10min project update presentation on November 7, 2017.

Your presentation should:

* Explain the problem you are tackling
* What are your goals? What are the concrete RQs you plan to answer?
* What is the methodology you will use to address these RQs?
	* Explain the data you will use and your subject systems, as applicable
	* Explain how you plan to analyze this data. What tools/techniques will you use?
* Explain the progress you have made so far. Remember that your final presentation would be in less than a month from that day so you should have made some progress towards your goals by now.

####Project Presentation (15%)

Project presentations will be held on December 5, 2017 and December 7, 2017. The exact schedule will be posted later.

####Project Report (20%)

Your project report should be 10pages maximum, including references, and should be in the IEEE format. Your report will be graded according to the originaility and interestingness of your project, the depth of your work, the correctness of your analysis, and the presentation quality of your written report. Advise on writing technical papers can be found [here](http://www.cs.columbia.edu/~hgs/etc/writing-style.html) and [here](https://homes.cs.washington.edu/~mernst/advice/write-technical-paper.html).

