import static org.junit.Assert.*;

public class PersonTest {
    Program program1 = new Program();
    Person personTest1 = new Person("yoga", 60, program1);
    @org.junit.Test
<<<<<<< HEAD
    public void testPersonExercise() {
        Exercise exercise_e = new EnduranceExercise(50, 30, 15, 3, "yoga");
        Program program1 = new Program();

        Person personTest1 = new Person("yoga", 60, program1);
        assertTrue(personTest1.preferredExercise == "yoga");
        System.out.println("Testing for correct preferred exercise");
        assertTrue(personTest1.acceptableIntensity == 60);
        System.out.println("Testing for correct acceptable intensity");
        assertTrue(personTest1.currentProgram == program1);
        System.out.println("Testing for correct program");
    }



=======
    public void testPerson() {
        assertSame("yoga", personTest1.preferredExercise);
        System.out.println("Testing for correct preferred exercise");

        assertEquals(60, personTest1.acceptableIntensity);
        System.out.println("Testing for correct acceptable intensity");

        assertSame(personTest1.currentProgram, program1);
        System.out.println("Testing for correct program");
    }
>>>>>>> d16345b99938ab53bda0a0814853a4b8f8986385
    @org.junit.Test
    public void testToString() {
        assertTrue(personTest1.toString().contains("yoga"));
        assertTrue(personTest1.toString().contains("60"));
        assertTrue(personTest1.toString().contains("Current program"));
        System.out.println("Testing toString");
    }
}