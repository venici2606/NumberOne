# NumberOne
Introduction to Software Testing



## Table of contents


1. [About. ](#about)
2. [Requirements. ](#requirements)
3. [Installation. ](#install)
4. [Run and compile. ](#rac)
5. [Class description. ](#desc)
6. [Technology/Framework used. ](#tech)
7. [Code Style](#code)
8. [Code Coverage](#codeC)
9. [Usage. ](#usage)
10. [Running the tests. ](#test)




<a name="about"></a>
## About

* This is an Exam Assignment and we were 6 persons collaborating on this Exam.
* The program is Java based.
* The program demonstrates system managing of different exercises of different types. The exercise types that have been used in this project are: Strength,Endurance, Flexibility and Balance.
* Our program enables people to feel a sense of belonging to a community of "home gym", and making people do the exercises that they believe are best for their health/body.
* The system have the ability to give the person a pre-made program as well as the person can tailor their own.Each program has an overall duration and the sum of all the exercises is equal to the software duration divided in two.
* The program is accompanied by a couple of Unit Tests, Integration Tests, SUT-System under Test and Acceptance Test, to check that the main program works as expected. 


<a name="requirements"></a>
## Requirements

* JAVA JDK(8+)
* Intellij IDEA(recommended) or Eclipse
* GIT
* Junit Testing


<a name="install"></a>
## Installation

First of all, the JDK should be installed in your system. 
Then,<ins>to compile and run this project, first you need to clone/download it from Github</ins>,
 you can either <ins>*clone*</ins> this repo to your local machine using [Github](https://github.com/venici2606/NumberOne)<br/> and clone it into a folder; or you can
<ins>*download*</ins> the whole project as a zip file and then unpack the file. You can also clone and install our program by using SSH instead of https. 
All you have to do is to go to  [Github](https://github.com/venici2606/NumberOne), <br/> clone/download and use SSH.
Then open Intellij and select **"Check out from Version Control**, and select **GIT**. Once **Git** is selected, paste the Git repository URL, and select the directory where you want to clone it into.
It will ask you if you want to connect to Github, and you click yes. Now, intelliJ will tell you that there is an Unlinked project,so click on import Gradle project;use the auto-import and unselect the "create Separate module per source set"-then ok.
The next step is to right click the project,and open Module settings,select SDK's, and there you have to select the JDK that is installed on your system and click ok; and the project is installed and ready to run.



NOTE: The program is tested both on Mac OSX and Windows.


<a name="rac"></a>
## Run and Compile

Once the program is installed,and the file is unpacked; open the project in **IntelliJ**. 
IntelliJ uses a compiler that works according to Java specification.
To compile the program you can use the keyboard shortcuts <ins>Shift + Ctrl + F9</ins> at the same time, or you can go in <ins>Settings/Preference dialog,</ins> then <ins> **Build-Execution-Deployment-Compiler**.</ins>
On the Compiler page, select Build project automatically.
In case you don't want to compile the full project, you can compile some of the classes, by right-clicking on the class that you want to compile, and from the context menu, select <ins> "Recompile", "class name".</ins>
To run the project you can use the keyboard shortcut **SHIFT +F10, or click on "Run"** from main toolbar(-the green triangle).
Then, go to <ins>"Edit Configurations"</ins> and set it up to **"ExerciseManager"**- that is class that contains our main method.
**To run all the Junit Tests** at once; from <ins> Settings/Preference dialog </ins>,select menu **""Run""**- **Edit Configurations**; 
click green plus in the left top corner and select **JUnit**.
Then, when configuring the "Run Configuration", go to <ins>"Test Kind",</ins> and select <ins>"all classes in directory".</ins>
Select the root directory, and module from where picking up the classpath. Or to make it simple, select all modules and right-click them; then click on "Run all tests";This will create a configuration for whole project.


<a name="desc"></a>
## Class description

* **Exercise** <br/>
  - Creating method for Exercise, using String toString Method. The method is overriding the parent class (@**Override**)

* **BalanceExercise** <br/>
  - Creating method for BalanceExercise, that extends Exercise. Also using String toString method.(@**Override**)

* **EnduranceExercise** <br/>
  - Creating method for EnduranceExercise, extending Exercise, while using String toString method. (@**Override**)

* **FlexibilityExercise** <br/>
  - Creating method for FlexibilityExercise, calling the superclass methods and accessing the superclass constructor.Using @**Override** String toString method.

* **StrengthExercise** <br/>
  - Creating method for StrengthExercise, that extends Exercise. Also using String toString method. (@**Override**)

* **Person** <br/>
  - Creating methods for suggesting an exercise program that is appropriate for given person.The methods have +-10% of the persons intensity level,and the current program. This class is also using String toString method. (@**Override**)

* **Program** <br/>
  - Creating methods for exercises that are grouped into programs.Each program has the exercises sorted in order of increasing intensity, and overall duration. The duration of an Program is twice the sum of the durations of all exercises.Creating methods for checking if the program is balanced or not.(**public static boolean**)

* **ExerciseManager** <br/>
  - Creating methods for deciding if a program is appropriated for a given person, methods for building new programs and a method for recommending from a given collection.


<a name="tech"></a>
## Technology/Framework used

* JAVA
* SDK
* Junit (Unit Testing Framework)
* Array List
* Collections 
* OOP Concepts
* Packages 
* GIT 


<a name="code"></a>
## Code Style <br/>

* Standard
* CamelCase
* No trailing white space


<a name="codeC"></a>
## Code Coverage

* Test Coverage is important is an important technique in Software Testing, 
which determines whether our test cases are actually covering the application code, 
and how much code is exercised when we run those test cases. 
! [] (ScCodeCoverage.jpg) . 


The code shows the percentage of the code that has been covered by tests. So, you can see the coverage result for our classess, methods and lines. 


her skal vi ha badge


<a name="usage"></a>
## Usage
 




<a name="tests"></a>
## Tests


