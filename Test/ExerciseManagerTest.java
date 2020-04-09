import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;

public class ExerciseManagerTest {

    @org.junit.Test
    public void personsIntoList(){
        ArrayList<Person> personList = new ArrayList<>();

        Person personTest1 = new Person("body weight", 30, "Program en");
        personList.add(personTest1);

        Person personTest2 = new Person("zumba", 40, "Program to");
        personList.add(personTest2);

        assertTrue(personList.contains(personTest1));
        assertTrue(personList.contains(personTest2));
        System.out.println("Testing array for content");

    }
}
