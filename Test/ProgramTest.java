import org.junit.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
public class ProgramTest {

    ArrayList<Exercise> exercises = new ArrayList<>();
    Exercise enduranceTest = new EnduranceExercise(1,1,1,1,"one");
    Exercise enduranceTest2 = new EnduranceExercise(2,2,2,2,"two");
    Exercise strengthExercise = new StrengthExercise(1,2,3,4,5,"six");
    Exercise flexibilityExercise = new FlexibilityExercise(1,2,3,4,"3");
    Exercise balanceExercise = new BalanceExercise(1,2,3,4,"yoga mat");

    Program programTest = new Program();
    Program p = new Program();
    Person personTest;

    @Test
    public void setDurationTest(){
        programTest.setDuration(10);
        assertEquals(programTest.duration, 10);
    }
    @Test
    public void overallIntensityTest(){
 //testing to see if intensitylevel is zero before adding exercises.
        assertEquals(programTest.intensitylevel, 0);

        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.addExercises(exercises);
        programTest.overallIntensity();

//testing to see if intensity level has changed from zero. here we want 2 as a result,
// endurance2 has intensity 2, while endurance1 has intensity 1, so intensity should be 2

        assertEquals(programTest.intensitylevel, 2);
        System.out.println(programTest.intensitylevel  + " = should be 2");
    }
    @Test
    public void isProgramBalancedTest(){
 //checking if the program is balanced before adding exercises
        assertFalse(programTest.isProgramBalanced());

 //adding exercises of all four types
        exercises.add(enduranceTest);
        exercises.add(strengthExercise);
        exercises.add(flexibilityExercise);
        exercises.add(balanceExercise);

 //checking to see if program is balanced.
        programTest.addExercises(exercises);
        assertTrue(programTest.isProgramBalanced());
    }

    @Test
    public void sortExerciseTest() {
        Exercise e1 = new BalanceExercise(1, 3, 2, 4, "5");
        Exercise e2 = new FlexibilityExercise(4, 3, 2, 4, "5");
        Exercise e3 = new EnduranceExercise(9, 3, 2, 4, "5");
        Exercise e4 = new StrengthExercise(3, 3, 2, 4, 5, "5");

        ArrayList<Exercise> ovelser = new ArrayList<>();
        ovelser.add(e1);
        ovelser.add(e2);
        ovelser.add(e3);
        ovelser.add(e4);

        assertEquals(1, ovelser.get(0).intensity);
        System.out.println("Index 0 is intensity 1 before sorting");
        assertEquals(4, ovelser.get(1).intensity);
        System.out.println("Index 1 is intensity 4 before sorting");
        assertEquals(9, ovelser.get(2).intensity);
        System.out.println("Index 2 is intensity 9 before sorting");
        assertEquals(3, ovelser.get(3).intensity);
        System.out.println("Index 3 is intensity 3 before sorting");
        System.out.println("");

//If you want to see the unsorted list of exercise after intensity you can remove the comment of the code below
//System.out.println("These are the unsorted exercises : \n" + ovelser);
        Program.sortExercise(ovelser);
        assertEquals(1, ovelser.get(0).intensity);
        System.out.println("Index 0 is intensity 1 after sorting");
        assertEquals(3, ovelser.get(1).intensity);
        System.out.println("Index 1 is intensity 3 after sorting");
        assertEquals(4, ovelser.get(2).intensity);
        System.out.println("Index 2 is intensity 4 after sorting");
        assertEquals(9, ovelser.get(3).intensity);
        System.out.println("Index 3 is intensity 9 after sorting");
    }

    @Test
    public void CalculateDurationTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.addExercises(exercises);
        int totalDuration = (enduranceTest.duration+enduranceTest2.duration)*2;
        assertEquals(programTest.calculateDuration(), "This program takes "+totalDuration+ " minutes from start to finish");
    }

    @Test
    public void makeProgramTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.addExercises(exercises);
        assertTrue (programTest.exercises.contains(enduranceTest));
        assertTrue (programTest.exercises.contains(enduranceTest2));
    }

    @Test
    public void doesProgramFitTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.addExercises(exercises);
        System.out.println(programTest.overallIntensity());
        personTest = new Person("endurance", 2,p);
        assertTrue(p.doesProgramFit(personTest,programTest));
        Person personTest2 = new Person("Swimming", 30, p);
        assertFalse(p.doesProgramFit(personTest2,programTest));
    }
    @Test
    public void giveProgramIsProgramEmptyTest(){
        Person personTest = new Person("balance", 50,programTest);
        assertFalse(personTest.currentProgram.exercises.contains(balanceExercise));
    }
    @Test
    public void giveProgramNoProgramForYou(){
        Person personTest = new Person("balance", 50,programTest);
        p.giveProgram(personTest);
        assertTrue(p.giveProgram(personTest) == "We are so sorry, we could not find a appropriate program for you");
    }
    @Test
    public void giveProgramIsCorrectExercisesIncludedTest() {
        Person personTest = new Person("balance", 50,programTest);
        exercises.add(enduranceTest);
        exercises.add(flexibilityExercise);
        exercises.add(strengthExercise);
        exercises.add(balanceExercise);
        p.addExercises(exercises);
        p.makeProgram(exercises, programTest);
        p.giveProgram(personTest);

        assertTrue(personTest.currentProgram.exercises.contains(balanceExercise));
        assertTrue(personTest.currentProgram.exercises.contains(strengthExercise));
        assertTrue(personTest.currentProgram.exercises.contains(flexibilityExercise));
        assertTrue(personTest.currentProgram.exercises.contains(enduranceTest));
        assertFalse(personTest.currentProgram.exercises.contains(enduranceTest2));
    }
    @Test
    public void giveProgramIsAssumedProgramAssignedTest(){
        exercises.add(enduranceTest);
        exercises.add(flexibilityExercise);
        exercises.add(strengthExercise);
        exercises.add(balanceExercise);
        p.addExercises(exercises);
        p.makeProgram(exercises, programTest);

        Person personTest2 = new Person("balance", 5,p);
        p.giveProgram(personTest2);
        assertEquals( p.giveProgram(personTest2), "We have assigned this program to you:  "+ '\n' +
                "The programs overall intensity is "+ personTest2.currentProgram.overallIntensity() +
                " and this is your preferred intensity " + personTest2.acceptableIntensity + '\n'+
                personTest2.currentProgram.exercises);
    }

}
