import java.util.ArrayList;


public class PersonTest {

    @org.junit.Test
    public void PersonValue() {

        Person personTest = new Person(" ", -1);

        if((personTest.preferredExercise == "") || (personTest.preferredExercise == " ")) {
            System.out.println("You need to put valid exercise!");
        } else if (personTest.acceptableIntensity < 10) {
            System.out.println("You need to have an intensity level over 10 % ");
        } else {
            System.out.println("You have valid values");
        }
    }

}
