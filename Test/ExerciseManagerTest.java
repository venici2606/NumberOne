import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

public class ExerciseManagerTest {

    //tODO clean up

    ArrayList<Exercise>exercises=new ArrayList<>();
    Exercise BalanceExerciseTestAnotherClass=new BalanceExercise(1,3,4,5,"balance trainer");
    Exercise StrengthExerciseTestAnotherClass=new StrengthExercise(3,5,6,3,10,"dumbell");
    Exercise FlexibilityExerciseTestAnotherClass=new FlexibilityExercise(1,3,5,6,"nothing");
    Exercise EnduranceExerciseTestAnotherClass=new EnduranceExercise(2,3,4,6,"barbell");

    Program programTestAnotherClass=new Program();

    int intensityLevel;
    int duration;

    //Checking the communication between classes
    @org.junit.Test
    public void IntegrationTest () {

        programTestAnotherClass.setDuration(3);
        assertEquals(programTestAnotherClass.duration,3);

        exercises.add(BalanceExerciseTestAnotherClass);
        exercises.add(EnduranceExerciseTestAnotherClass);
        programTestAnotherClass.addExercises(exercises);
        assertTrue(programTestAnotherClass.exercises.contains(BalanceExerciseTestAnotherClass));
        assertTrue(programTestAnotherClass.exercises.contains(EnduranceExerciseTestAnotherClass));
        assertEquals(programTestAnotherClass.intensitylevel, 0);

        assertFalse(programTestAnotherClass.isProgramBalanced());

        exercises.add(BalanceExerciseTestAnotherClass);
        exercises.add(StrengthExerciseTestAnotherClass);
        exercises.add(FlexibilityExerciseTestAnotherClass);
        exercises.add(EnduranceExerciseTestAnotherClass);

        programTestAnotherClass.addExercises(exercises);
        assertTrue(programTestAnotherClass.isProgramBalanced());
        System.out.println("Testing if the Program is balanced");

        Exercise e1=new BalanceExercise(1,2,3,4,"nothing");
        Exercise e2=new BalanceExercise(4,3,2,3,"nothing");
        Exercise e3=new BalanceExercise(3,4,5,6, "nothing");
        Exercise e4=new BalanceExercise(2,3,4,5,"nothing");

        List <Exercise> workouts =new ArrayList<Exercise>(Arrays.asList(e1,e2,e3,e4));
        Collections.sort(workouts);
        System.out.println(workouts.toString());

            Program programTest2 = new Program();
            Person personTest2 = new Person("balance", 1, programTestAnotherClass);
            exercises.add(FlexibilityExerciseTestAnotherClass);
            exercises.add(EnduranceExerciseTestAnotherClass);
            exercises.add(StrengthExerciseTestAnotherClass);
            exercises.add(BalanceExerciseTestAnotherClass);
            programTest2.addExercises(exercises);
            programTest2.makeProgram(exercises, programTestAnotherClass);

            assertTrue(personTest2.currentProgram.exercises.contains(FlexibilityExerciseTestAnotherClass));
            assertTrue(personTest2.currentProgram.exercises.contains(EnduranceExerciseTestAnotherClass));
            assertTrue(personTest2.currentProgram.exercises.contains(StrengthExerciseTestAnotherClass));
            assertTrue(personTest2.currentProgram.exercises.contains(BalanceExerciseTestAnotherClass));
            System.out.println("Test to see if the correct Exercise is included");


            Program programTest3 = new Program();
            exercises.add(FlexibilityExerciseTestAnotherClass);
            exercises.add(EnduranceExerciseTestAnotherClass);
            exercises.add(StrengthExerciseTestAnotherClass);
            exercises.add(BalanceExerciseTestAnotherClass);
            programTest3.addExercises(exercises);
            programTest3.makeProgram(exercises, programTestAnotherClass);


            Program programTesting =new Program();
            Person personTesting=new Person ("balance",50, programTestAnotherClass);
            exercises.add(FlexibilityExerciseTestAnotherClass);
            exercises.add(StrengthExerciseTestAnotherClass);
            exercises.add(BalanceExerciseTestAnotherClass);
            programTesting.addExercises(exercises);
            programTesting.makeProgram(exercises,programTesting);

            assertTrue(personTesting.currentProgram.exercises.contains(BalanceExerciseTestAnotherClass));
            assertTrue(personTesting.currentProgram.exercises.contains(StrengthExerciseTestAnotherClass));
            assertTrue(personTesting.currentProgram.exercises.contains(BalanceExerciseTestAnotherClass));
            System.out.println("Testing if Making program works");


            Person personTesting2 =new Person ("balance",5, programTesting);
            programTesting.giveProgram(personTesting2);
            assertEquals( programTesting.giveProgram(personTesting2), "We have assigned this program to you:  "+ '\n' + "The programs overall intensity is "+ personTesting2.currentProgram.overallIntensity() + " and this is your preferred intensity " + personTesting2.acceptableIntensity + '\n'+
                    personTest2.currentProgram.exercises);

            exercises.add(BalanceExerciseTestAnotherClass);
            exercises.add(EnduranceExerciseTestAnotherClass);
            programTest3.addExercises(exercises);
            System.out.println(programTest3.overallIntensity());
            Person personTest = new Person("endurance", 2, programTest3);
            assertTrue(programTest3.doesProgramFit(personTest, programTestAnotherClass));


            Exercise eTest = new StrengthExercise(11, 2, 3, 4, 5, "shoes");
            assertTrue(eTest.toString().contains("s"));
            assertTrue(eTest.toString().contains("strength"));

            assertEquals(eTest.getIntensity(), 11);
            assertTrue(eTest.compareTo(eTest) == 0);

            Exercise exerciseTest2 = new EnduranceExercise(60, 30, 0, 0, "cycle");
            exercises.add(exerciseTest2);
            Exercise exerciseTest3 = new FlexibilityExercise(50, 30, 12, 2, "nothing");
            exercises.add(exerciseTest3);

            Program testProgram2 = new Program();
            testProgram2.exercises.add(exerciseTest2);
            testProgram2.exercises.add(exerciseTest3);

            Person testPerson2 = new Person("flexibility", 60, testProgram2);
            assertTrue(testProgram2.exercises.toString().contains("flexibility") && testPerson2.preferredExercise == "flexibility");


            if (testProgram2.exercises.toString().contains("flexibility") && testPerson2.preferredExercise == "flexibility") {
                System.out.println("Testing if program contains the preferred exercise");
                assertTrue(true);

                if ((testProgram2.overallIntensity() <= (testPerson2.acceptableIntensity = 70)) &&
                        (testProgram2.overallIntensity() >= (testPerson2.acceptableIntensity = 60))) {
                    System.out.println("Testing if overall intensity of program is equal to acceptable intensity");
                    assertTrue(true);
                } else {
                    System.out.println("Incorrect intensity level!");
                    assertTrue(false);
                }
            } else {
                System.out.println("Preferred exercise is not included!");
                assertTrue(false);













            }

        }
    }











