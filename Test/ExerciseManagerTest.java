
import org.junit.Test;

import java.util.ArrayList;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

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
    public void testDoesProgramFit(){
        ArrayList<Exercise> exercises = new ArrayList<>();

        Exercise exercise_e2 = new EnduranceExercise(60, 30,0,0,"cycle");
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

        if(program2.exercises.toString().contains("flexibility") && person2.preferredExercise == "flexibility"){
            System.out.println("Testing if program contains the preferred exercise");
            assertTrue(true);

            if((program2.overallIntensity() <= (person2.acceptableIntensity = 70)) &&
                    (program2.overallIntensity() >= (person2.acceptableIntensity = 60)) ) {
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
