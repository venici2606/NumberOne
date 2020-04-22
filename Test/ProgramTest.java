import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ProgramTest {

    int duration;
    int intensitylevel;


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
        System.out.println(programTest.intensitylevel);
        assertEquals(programTest.intensitylevel, 0);

        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);

        programTest.addExercises(exercises);
        programTest.overallIntensity();
//testing to see if intesitylevel has changed from zero. here we want 2 as a result,
        // endurance2 has intensity 2, while endurance1 has intensity 1, so intensity should be 2

        System.out.println(programTest.intensitylevel);
        assertEquals(programTest.intensitylevel, 2);

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
    public void CalculateDurationTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.addExercises(exercises);
        int totalDuration = (enduranceTest.duration+enduranceTest2.duration)*2;
        assertEquals(programTest.calculateDuration(), "This program takes "+totalDuration+ " minutes from start to finish");
    }



    @Test
    public void sortExerciseTest(){

        Exercise e1 = new BalanceExercise(1,3,2,4,"5");
        Exercise e2 = new BalanceExercise(4,3,2,4,"5");
        Exercise e3 = new BalanceExercise(9,3,2,4,"5");
        Exercise e4 = new BalanceExercise(3,3,2,4,"5");
        Exercise e5 = new BalanceExercise(2,3,2,4,"5");

        List<Exercise> ovelser = new ArrayList<Exercise>(Arrays.asList(e1, e2, e3, e4, e5));

        System.out.println("Ikke sortert" + ovelser.toString());
        Collections.sort(ovelser);
        System.out.println("Sortert:" + ovelser.toString());
    }
    @Test
    public void makeProgramTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.addExercises(exercises);
        assertTrue (programTest.exercises.contains(enduranceTest));
        assertTrue (programTest.exercises.contains(enduranceTest2));
        //  Failed first try at test assertEquals(exercises.contains(enduranceTest && enduranceTest2) == true);
    }

    @Test
    public void doesProgramFitTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.addExercises(exercises);
        System.out.println(programTest.overallIntensity());
        personTest = new Person("endurance", 2,p);
        assertTrue(p.doesProgramFit(personTest,programTest));

    }

    @Test
    public void giveProgramTest() {
        Program p = new Program();
        Person personTest = new Person("balance", 50,programTest);

        assertFalse(personTest.currentProgram.exercises.contains(balanceExercise));
        p.giveProgram(personTest);
        assertTrue(p.giveProgram(personTest) == "We are so sorry, we could not find a appropriate program for you");

        exercises.add(enduranceTest);
        exercises.add(flexibilityExercise);
        exercises.add(strengthExercise);
        exercises.add(balanceExercise);
        p.addExercises(exercises);
        p.makeProgram(exercises, programTest);

        assertTrue(personTest.currentProgram.exercises.contains(balanceExercise));
        assertTrue(personTest.currentProgram.exercises.contains(strengthExercise));
        assertTrue(personTest.currentProgram.exercises.contains(flexibilityExercise));
        assertTrue(personTest.currentProgram.exercises.contains(enduranceTest));

        assertFalse(personTest.currentProgram.exercises.contains(enduranceTest2));

        Person personTest2 = new Person("balance", 5,p);
        p.giveProgram(personTest2);
        assertEquals( p.giveProgram(personTest2), "We have assigned this program to you:  "+ '\n' +
                "The programs overall intensity is "+ personTest2.currentProgram.overallIntensity() +
                " and this is your preferred intensity " + personTest2.acceptableIntensity + '\n'+
                personTest2.currentProgram.exercises);

    }
    /*@Test
    public void sortExerciseTest(){

        Collections.sort(exercises);

        Exercise e1 = new Exercise(1, 3, 2, 4);
        Exercise e2 = new Exercise(4, 3, 2, 4);
        Exercise e3 = new Exercise(3, 3, 2, 4);
        Exercise e4 = new Exercise(9, 3, 2, 4);
        Exercise e5 = new Exercise(2, 3, 2, 4);

        List<Exercise> ovelser = new ArrayList<Exercise>(Arrays.asList(e1, e2, e3, e4, e5));
        System.out.println("Ikke sortert" + ovelser.toString());
        Collections.sort(ovelser);
        System.out.println("Sortert:" + ovelser.toString());

    }*/


}