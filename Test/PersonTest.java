import static org.junit.Assert.assertTrue;

public class PersonTest {

    @org.junit.Test
    public void testPerson() {
        Person personTest1 = new Person("yoga", 60, "Program en");
        assertTrue(personTest1.preferredExercise == "yoga");
        System.out.println("Testing for correct preferred exercise");

        assertTrue(personTest1.acceptableIntensity == 60);
        System.out.println("Testing for correct acceptable intensity");

//        assertTrue(personTest1.preferredExercise == "yoga" && personTest1.acceptableIntensity == 60);
//        System.out.println("Testing for correct preferred exercise and acceptable intensity");


//        if(assertTrue(personTest1.preferredExercise == "yoga" && personTest1.acceptableIntensity == 60)) {
//            System.out.println("Testing for incorrect preferred exercise");
//            assertTrue(false); //assertFalse(false);
//        } else {
//            System.out.println("Testing for correct preferred exercise");
//            assertTrue(true);
//        }
//            //assertTrue(person1.preferredExercise = "");
//        assertTrue(personTest1.acceptableIntensity > 10);
//        System.out.println("Testing for correct acceptable intensity");
    }


    @org.junit.Test
    public void testToString() {
        Person personTest1  = new Person("yoga", 60, "Program en");
        equals(personTest1.toString().contains("yoga"));
        equals(personTest1.toString().contains("60"));
        System.out.println("Testing for Check of String");
    }
}
