# NumberOne
#####Introduction to Software Testing



##Table of contents


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
####1.About
* This is an Exam Assignment and we were 6 persons collaborating on this Exam.
* The program is Java based.
* The program demonstrates system managing of different exercises of different types. The exercise types that have been used in this project are: Strength,Endurance, Flexibility and Balance.
* The system have the ability to give the person a pre-made program as well as the person can tailor their own.Each program has an overall duration and the sum of all the exercises is equal to the software duration divided in two.
* The program is accompanied by a couple of Unit Tests, Integration Tests, SUT-System under Test and Acceptance Test, to check that the main program works as expected. 

<a name="requirements"></a>
####2.Requirements
* JAVA JDK(8+)
* Intellij IDEA(recommended) or Eclipse
* GIT
* Junit Testing



<a name="install"></a>
####3.Installation 
<ins>To compile and run this project, first you need to install it from Github</ins>,
 you can either <ins>*clone*</ins> this repo to your local machine using [Github](https://github.com/venici2606/NumberOne)<br/> and clone it into a folder; or you can
<ins>*download*</ins> the whole project as a zip file and then unpack the file.

NOTE: The program is tested both on Mac OSX and Windows.

<a name="rac"></a>
####4.Run and Compile 
Once the program is installed, open the Command Prompt(terminal on Mac), and use the CD command to go to bin folder of installation directory.Then trigger javac(used to compile any java files) command, and add .java extension to the file name.The syntax of our program is checked, and  program doesn't contain any compile time errors,so the compilation should be successful and will not throw any exception. If it says that the program is not recognized, that means that java haven't been installed, or it is not proper. If that happens, reinstall the program, and then run the command "dir".


<a name="desc"></a>
####4.Class description

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
####5.Technology/Framework used
* JAVA
* SDK
* Junit (Unit Testing Framework)
* Array List
* Collections 
* OOP Concepts
* Packages 
* GIT 



<a name="code"></a>
####6.Code Style <br/>
* Standard
* CamelCase
* No trailing white space




<a name="codeC"></a>
####7.Code Coverage
her skal vi ha badge

<a name="usage"></a>
####8.Usage
-   


<a name="tests"></a>
####4.Tests


