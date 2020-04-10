import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;

public class ExerciseManagerTest {

    @org.junit.Test
    public void personsIntoList(){
        ArrayList<Person> personList = new ArrayList<>();

        Exercise exercise_e = new EnduranceExercise(50, 30, 15, 3, "yoga");
        Program program1 = new Program();

        Person personTest1 = new Person("body weight", 30, program1);
        personList.add(personTest1);

        //Person personTest2 = new Person("zumba", 40, program2);
        //personList.add(personTest2);

        assertTrue(personList.contains(personTest1));
        //assertTrue(personList.contains(personTest2));
        System.out.println("Testing array for content");

    }
}
