import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;


public class ExerciseManagerTest {


    @Test
    public void ExerciseGroupInProgramTest(){
        ArrayList<Exercise> exercises = new ArrayList<>();

        Exercise enduranceTest = new EnduranceExercise(1,1,1,1,"one");
        Exercise enduranceTest2 = new EnduranceExercise(2,2,2,2,"two");

        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);

        Program programTest = new Program();
        programTest.addExercises(exercises);

        assertTrue (exercises.contains(enduranceTest));
        assertTrue (exercises.contains(enduranceTest2));

        //  Failed first try at test assertEquals(exercises.contains(enduranceTest && enduranceTest2) == true);
    }
}

// TODO Write inn the failed tests.


