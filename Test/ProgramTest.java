
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;



public class ProgramTest {

    //TODO clean up
    int duration;
    int intensitylevel;


    ArrayList<Exercise> exercises = new ArrayList<>();
    Exercise enduranceTest = new EnduranceExercise(1,1,1,1,"one");
    Exercise enduranceTest2 = new EnduranceExercise(2,2,2,2,"two");
    Exercise strengthExercise = new StrengthExercise(1,2,3,4,5,"six");
    Exercise flexibilityExercise = new FlexibilityExercise(1,2,3,4,"3");
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

        //testing to see if intensitylevel is zero before adding exercises.
        System.out.println(programTest.intensitylevel);
assertEquals(programTest.intensitylevel, 0);

        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);

        programTest.addExercises(exercises);
        programTest.overallIntensity();
//testing to see if intesitylevel has changed from zero. here we want 2 as a result,
        // endurance2 has intensity 2, while endurance1 has intensity 1, so itensity should be 2

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
    public void sortExerciseTest(){

        /*Exercise e1 = new BalanceExercise(1,3,2,4,"5");
        Exercise e2 = new FlexibilityExercise(4,3,2,4,"5");
        Exercise e3 = new EnduranceExercise(9,3,2,4,"5");
        Exercise e4 = new StrengthExercise(3,3,2,4,5,"5");

        ArrayList <Exercise> ovelser = new ArrayList<>();
        ovelser.add(e1);
        ovelser.add(e2);
        ovelser.add(e3);
        ovelser.add(e4);

        String testIntensity = Program.sortExercise(ovelser);
        System.out.println(testIntensity.indexOf("1"));
        System.out.println("--------------");
        System.out.println(testIntensity);*/

       /* ArrayList <Exercise> exercises1 = new ArrayList<>();
        Program p = new Program();
        Program program1 = new Program();

        exercises1.add(new StrengthExercise(70, 20, 10, 3, 20, "Dumbbells"));
        exercises1.add(new EnduranceExercise(50, 30, 4, 1, "Stop watch"));
        exercises1.add(new FlexibilityExercise(40, 10, 1, 1, "A yoga mat"));
        exercises1.add(new BalanceExercise(40, 15, 3, 2, "A Balance ball"));

        p.makeProgram(exercises1, program1);



        Collections.sort(exercises);
       // String sorted = "Sortert: \n" + exercises.toString();
        System.out.println(p.sortExercise(exercises1));*/







        /*Exercise e1 = new BalanceExercise(1,3,2,4,"5");
        Exercise e2 = new FlexibilityExercise(4,3,2,4,"5");
        Exercise e3 = new EnduranceExercise(9,3,2,4,"5");
        Exercise e4 = new StrengthExercise(3,3,2,4,5,"5");

       // List<Exercise> ovelser = new ArrayList<Exercise>(Arrays.asList(e1, e2, e3, e4));
        ArrayList<Exercise> exercisesTest
        System.out.println("Ikke sortert" + ovelser.toString());
        Collections.sort(ovelser);
        System.out.println("Sortert:" + ovelser.toString());


        assertTrue(e1.intensity < e4.intensity);
        System.out.println("Intensity 1 is less than intensity 3");

        assertTrue(e4.intensity < e2.intensity);
        System.out.println("Intensity 3 is less than intensity 4");

        assertTrue(e2.intensity < e3.intensity);
        System.out.println("Intensity 4 is less than intensity 9");*/



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