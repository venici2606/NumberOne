import org.junit.Test;
import java.util.ArrayList;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ProgramTest {
    int duration;
    int intensitylevel;


    ArrayList<Exercise> exercises = new ArrayList<>();
    Exercise enduranceTest = new EnduranceExercise(1,1,1,1,"one");
    Exercise enduranceTest2 = new EnduranceExercise(2,2,2,2,"two");
    Exercise strengthExercise = new StrengthExercise(1,2,3,4,5,"six");
    Exercise flexibilityExercise = new FlexibilityExercise(1,2,3,4,3);
    Exercise balanceExercise = new BalanceExercise(1,2,3,4,"yoga mat");


    Program programTest = new Program();

    @Test
    public void ExerciseGroupInProgramTest(){

        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);

        programTest.addExercises(exercises);

        assertTrue (programTest.exercises.contains(enduranceTest));
        assertTrue (programTest.exercises.contains(enduranceTest2));

        //  Failed first try at test assertEquals(exercises.contains(enduranceTest && enduranceTest2) == true);
    }
    @Test
    public void setDurationTest(){

        programTest.setDuration(10);
        assertEquals(programTest.duration, 10);

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
    public void overallIntensityTest(){

       programTest.overallIntensity();

        System.out.println(programTest.intensitylevel);
       assertEquals(intensitylevel, 0);

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


}