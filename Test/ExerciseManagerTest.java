import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ExerciseManagerTest {

    //tODO clean up


    @org.junit.jupiter.api.Test
    void doesProgramFit() {
        //  if(program.exercises.contains(person.preferredExercise);
    }

    @org.junit.jupiter.api.Test
    void main() {
    }


    @org.junit.Test
    public void testDoesProgramFit() {
        ArrayList<Exercise> exercises = new ArrayList<>();

        Exercise exercise_e2 = new EnduranceExercise(60, 30, 0, 0, "cycle");
        exercises.add(exercise_e2);
        Exercise exercise_f2 = new FlexibilityExercise(50, 30, 12, 2, "nothing");
        exercises.add(exercise_f2);

        Program program2 = new Program();
        program2.exercises.add(exercise_e2);
        program2.exercises.add(exercise_f2);

        Person person2 = new Person("flexibility", 60, program2);
/*
        assertTrue(program2.exercises.toString().contains("flexibility") && person2.preferredExercise == "flexibility");
        System.out.println("Testing if program contains the preferred exercise");
        assertTrue(program2.exercises.toString().contains("60") && person2.acceptableIntensity == 60);
        System.out.println("Testing if overall intensity of program is equal to acceptable intensity");
 */

        if (program2.exercises.toString().contains("flexibility") && person2.preferredExercise == "flexibility") {
            System.out.println("Testing if program contains the preferred exercise");
            assertTrue(true);

            if ((program2.overallIntensity() <= (person2.acceptableIntensity = 70)) &&
                    (program2.overallIntensity() >= (person2.acceptableIntensity = 60))) {
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


    ArrayList<Exercise>exercises=new ArrayList<>();
    Exercise BalanceExerciseTestAnotherClass=new BalanceExercise(1,3,4,5,"balance trainer");
    Exercise StrengthExerciseTestAnotherClass=new StrengthExercise(3,5,6,3,10,"dumbell");
    Exercise FlexibilityExerciseTestAnotherClass=new FlexibilityExercise(1,3,5,6,"nothing");
    Exercise EnduranceExerciseTestAnotherClass=new EnduranceExercise(2,3,4,6,"barbell");

    Program programTestAnotherClass=new Program();


    //Checking the communication between classes
    @org.junit.Test
    public void IntegrationTest () {

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

        programTestAnotherClass.makeProgram(exercises,programTestAnotherClass);
        assertTrue(programTestAnotherClass.isProgramBalanced());
        System.out.println("Testing if the Program works well together with the other classes");
        System.out.println( "Testing");

        programTestAnotherClass.addExercises(exercises);
        Person personTestAnotherClass = new Person("flexibility", 60, programTestAnotherClass);
        if (programTestAnotherClass.exercises.toString().contains("flexibility") && personTestAnotherClass.preferredExercise == "flexibility") {
            System.out.println("Testing if the Program contains preferred Exercise for given person");
            assertTrue(true);

            if ((programTestAnotherClass.overallIntensity() <= (personTestAnotherClass.acceptableIntensity = 70)) &&
                    (programTestAnotherClass.overallIntensity() >= (personTestAnotherClass.acceptableIntensity=60)) ) {
                System.out.println("Testing if the Program contains acceptable intensity.");
                assertTrue(true);
            }


            Program programTest2=new Program();
            Person personTest2=new Person("balance",1,programTestAnotherClass);
            exercises.add(FlexibilityExerciseTestAnotherClass);
            exercises.add(EnduranceExerciseTestAnotherClass);
            exercises.add(StrengthExerciseTestAnotherClass);
            exercises.add(BalanceExerciseTestAnotherClass);
            programTest2.addExercises(exercises);
            programTest2.makeProgram(exercises,programTestAnotherClass);
            assertTrue(personTest2.currentProgram.exercises.contains(FlexibilityExerciseTestAnotherClass));
            assertTrue(personTest2.currentProgram.exercises.contains(EnduranceExerciseTestAnotherClass));
            assertTrue(personTest2.currentProgram.exercises.contains(StrengthExerciseTestAnotherClass));
            assertTrue(personTest2.currentProgram.exercises.contains(BalanceExerciseTestAnotherClass));
            System.out.println("Test to see if the correct Exercise is included");


            Program programTest3=new Program();
            exercises.add(FlexibilityExerciseTestAnotherClass);
            exercises.add(EnduranceExerciseTestAnotherClass);
            exercises.add(StrengthExerciseTestAnotherClass);
            exercises.add(BalanceExerciseTestAnotherClass);
            programTest3.addExercises(exercises);
            programTest3.makeProgram(exercises,programTestAnotherClass);

            Person personTest3=new Person ("yoga", 5, programTest3);
            programTest3.giveProgram(personTest3);
            assertEquals( programTest3.giveProgram(personTest3), "We have assigned this program to you:  "+ '\n' +
                    "The programs overall intensity is "+ personTest3.currentProgram.overallIntensity() +
                    " and this is your preferred intensity " + personTest3.acceptableIntensity + '\n'+
                    personTest3.currentProgram.exercises);
            System.out.println("Test to see if Assumed Program is Assigned");


            exercises.add(BalanceExerciseTestAnotherClass);
            exercises.add(EnduranceExerciseTestAnotherClass);
            programTestAnotherClass.addExercises(exercises);
            System.out.println(programTestAnotherClass.overallIntensity());
            Person personTest=new Person("endurance",2, programTest3);
            assertTrue(programTest3.doesProgramFit(personTest,programTestAnotherClass));
            Person personTest4=new Person("running",30,programTest2);
            assertFalse(programTest2.doesProgramFit(personTest4,programTestAnotherClass));
            System.out.println("Does program fit check");


            Exercise eTest =new StrengthExercise(11,2,3,4,5,"shoes");
            assertTrue(eTest.toString().contains("s"));
            assertTrue(eTest.toString().contains("strength"));

            assertEquals(eTest.getIntensity(),11);
            assertTrue(eTest.compareTo(eTest)==0);



        }




    } }








