import static org.junit.Assert.*;

public class PersonTest {
    Program program1 = new Program();
    Person personTest1 = new Person("yoga", 60, program1);
    @org.junit.Test
    public void testPerson() {
        assertSame("yoga", personTest1.preferredExercise);
        System.out.println("Testing for correct preferred exercise");

        assertEquals(60, personTest1.acceptableIntensity);
        System.out.println("Testing for correct acceptable intensity");

        assertSame(personTest1.currentProgram, program1);
        System.out.println("Testing for correct program");
    }
    @org.junit.Test
    public void testToString() {
        assertTrue(personTest1.toString().contains("yoga"));
        assertTrue(personTest1.toString().contains("60"));
        assertTrue(personTest1.toString().contains("Current program"));
        System.out.println("Testing toString");
    }
}
