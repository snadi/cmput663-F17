<p style="border:1px; border-style:solid; border-color:black; padding: 1em;">
CMPUT 663 - Fall 2017<br/>
Assignment 2<br/>
Dr. Sarah Nadi -- University of Alberta
</p>

##Goal

The goal of this assignment is to give you hands-on training into how #ifdefs are used to implement variability and the statistics you can gather about them. To make the task easier, you will again do a replication study, but with a "twist" this time.

##The Details

In groups of two, choose one of the forty systems described in ["An analysis of the variability in forty preprocessor-based software product lines" by Liebig et al., ICSE '10](http://dx.doi.org.login.ezproxy.library.ualberta.ca/10.1109/ICSME.2014.61). You have two tasks for your chosen system:

* First, run cppstats on the version used in the paper and compare your results with those in the paper. 
* Second, run cppstats on the latest 5 versions of the same system you chose and report the evolution. Create the appropriate graph to show the evolution of each metric.  


For both tasks, please report the following metrics:

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

##Deliverables

* **Public Repository:** Create a public GitHub repository that contains all the scripts/code needed to accomplish the above two tasks, as well as the results. Your repository should also contain any R or python scripts you used to create your graphs. Your repository's ReadMe page should explain what is in the repo, how to replicate your results, and any differences in Task 1 from the oroginal study. 
* Presentation: You will give a 10min presentation on the results of your assignment. Your presentation should:
	* Report the system you picked. What does this system do?
	* Report and interpret the results for Task 1. Were any of the results different than those in the paper?
	* State the five versions used in the analysis of Task 2. What are the dates of these versions?
	* Report and interpret the results for Task 2. How did these metrics evolve over these five versions? Are there any interesting trends you observed?
	* Describe any difficulties you faced or lessons your learned in the process.
	* Include your GitHub repository URL on your title slide

##Resources

The following are related resources you will need, in addition to reading the ICSE' 10 paper above.

* [http://fosd.net/cppstats](http://fosd.net/cppstats) -- from original ICSE '10 paper
* [http://www.fosd.de/oss_vs_is/](http://www.fosd.de/oss_vs_is/) -- from an [extended version](https://link.springer.com/article/10.1007/s10664-015-9360-1) of the original paper
* [https://github.com/joliebig/cppstats](https://github.com/joliebig/cppstats)

##Due Date

**Your presentation slides must be uploaded on eClass by Tuesday October 31, 2017 at 9am.** Your presentation slides should include the URL of your GitHub repo.

##Grading

The assignment will be graded according to the following criteria:

* My ability to follow your ReadMe file and reproduce your results, including generating your graphs. If your instructions are not clear, or I cannot reproduce your results, you will loose marks.
* I should be able to see commits from all members of the team. **Your repository should not contain a single commit of uploading everything on the day before the deadline**
* The clarity of your presentation.

##Advise

* You will quickly realize that there are always some missing details or steps that make it hard to replicate certain results. Try your best to figure these out from the paper or the authors' online resources. If you absolutely cannot figure it out, make an educated decision about how to proceed and report your assumptions. Of course, you can also always contact the authors to clarify things! However, please do your homework first and make sure this is really a problem. 