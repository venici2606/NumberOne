import static org.junit.Assert.assertTrue;

public class PersonTest {

    @org.junit.Test
    public void testPersonExercise() {
        Exercise exercise_e = new EnduranceExercise(50, 30, 15, 3, "yoga");
        Program program1 = new Program();

        Person personTest1 = new Person("yoga", 60, program1);
        assertTrue(personTest1.preferredExercise == "yoga");
        System.out.println("Testing for correct preferred exercise");

    }

    @org.junit.Test
    public void testPersonIntensity() {
        Exercise exercise_e = new EnduranceExercise(50, 30, 15, 3, "yoga");
        Program program1 = new Program();

        Person personTest1 = new Person("yoga", 60, program1);

        assertTrue(personTest1.acceptableIntensity == 60);
        System.out.println("Testing for correct acceptable intensity");

    }



    @org.junit.Test
    public void testToString() {
        Exercise exercise_e = new EnduranceExercise(50, 30, 15, 3, "yoga");
        Program program1 = new Program();

        Person personTest1  = new Person("yoga", 60, program1);
        equals(personTest1.toString().contains("yoga"));
        equals(personTest1.toString().contains("60"));
        equals(personTest1.toString().contains("program1"));
        System.out.println("Testing for Check of String");
    }
}