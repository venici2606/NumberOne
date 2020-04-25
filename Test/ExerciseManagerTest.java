import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ExerciseManagerTest {
    ArrayList<Exercise>exercises=new ArrayList<>();
    ArrayList<Exercise>exercises2=new ArrayList<>();

    Exercise BalanceExerciseTestAnotherClass=new BalanceExercise(50,3,4,5,"balance trainer");
    Exercise StrengthExerciseTestAnotherClass=new StrengthExercise(48,5,6,3,10,"dumbell");
    Exercise FlexibilityExerciseTestAnotherClass=new FlexibilityExercise(49,3,5,6,"nothing");
    Exercise EnduranceExerciseTestAnotherClass=new EnduranceExercise(47,3,4,6,"barbell");

    Exercise e1=new BalanceExercise(10,2,3,4,"test Balance");
    Exercise e2=new BalanceExercise(10,3,2,3,"test Balance");
    Exercise e3=new BalanceExercise(10,4,5,6, "test Balance");
    Exercise e4=new BalanceExercise(10,3,4,5,"test Balance");

    Program p = new Program();
    Program programTestAnotherClass=new Program();
    Program programTest2 = new Program();

    Person personTest2 = new Person("balance", 15, p);
    Person personTesting2 =new Person ("balance",5, p);

    //Checking the communication between classes and that every method is behaving as we want it to
    @org.junit.Test
    public void IntegrationTest () {
        programTestAnotherClass.setDuration(3);
        assertEquals(programTestAnotherClass.duration,3);

        assertFalse(programTestAnotherClass.isProgramBalanced());
        System.out.println("Testing if the Program is not balanced");

        exercises.add(BalanceExerciseTestAnotherClass);
        exercises.add(StrengthExerciseTestAnotherClass);
        exercises.add(FlexibilityExerciseTestAnotherClass);
        exercises.add(EnduranceExerciseTestAnotherClass);

        exercises2.add(e1);
        exercises2.add(e2);
        exercises2.add(e3);
        exercises2.add(e4);

        p.makeProgram(exercises2, programTest2);
        p.makeProgram(exercises, programTestAnotherClass);

        assertTrue(programTestAnotherClass.isProgramBalanced());
        System.out.println("Testing if the Program is balanced");
        assertFalse(programTest2.isProgramBalanced());
        System.out.println("Testing if the Program is unbalanced");
        assertEquals(programTestAnotherClass.overallIntensity(), 50);
        assertTrue(programTestAnotherClass.exercises.contains(BalanceExerciseTestAnotherClass));
        assertTrue(programTestAnotherClass.exercises.contains(StrengthExerciseTestAnotherClass));

        assertEquals(programTestAnotherClass.exercises.get(0).intensity,50 );
        assertEquals(programTestAnotherClass.exercises.get(1).intensity,48 );
        assertEquals(programTestAnotherClass.exercises.get(2).intensity,49 );
        assertEquals(programTestAnotherClass.exercises.get(3).intensity,47 );
        System.out.println("Testing to se if exercises is unsorted");

        p.sortExercise(programTestAnotherClass.exercises);

        assertEquals(programTestAnotherClass.exercises.get(0).intensity,47 );
        assertEquals(programTestAnotherClass.exercises.get(1).intensity,48 );
        assertEquals(programTestAnotherClass.exercises.get(2).intensity,49 );
        assertEquals(programTestAnotherClass.exercises.get(3).intensity,50 );
        System.out.println("Testing to se if exercises is sorted");

        assertTrue(programTest2.exercises.contains(e1));
        assertTrue(programTest2.exercises.contains(e2));
        assertTrue(programTest2.exercises.contains(e3));
        assertTrue(programTest2.exercises.contains(e4));
        System.out.println("Test to see if the correct Exercise is included");

        p.giveProgram(personTest2);
        assertSame(personTest2.currentProgram, programTest2);
        assertNotSame(personTest2.currentProgram, programTestAnotherClass);
        System.out.println("testing to see if correct program has been assigned");

        p.giveProgram(personTesting2);
        assertEquals(p.giveProgram(personTesting2), "We have assigned this program to you:  "+ '\n' + "The programs overall intensity is "+ personTesting2.currentProgram.overallIntensity() + " and this is your preferred intensity " + personTesting2.acceptableIntensity + '\n'+
                    personTesting2.currentProgram.exercises);
        assertTrue(personTesting2.toString().contains("balance"));

    }

}











