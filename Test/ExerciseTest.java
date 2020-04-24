<<<<<<< HEAD

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
=======
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
>>>>>>> e932804d48d70719daa79b11faa347769af5783a

public class ExerciseTest {
    Exercise e = new StrengthExercise(11,1,1,1,1,"hei");

    @Test
    void ToStringTest() {
        assertTrue(e.toString().contains("e"));
        assertTrue(e.toString().contains("strength"));
        System.out.println(toString());
    }

    @Test
    void getIntensity() {
        assertTrue(e.getIntensity() == 11 );
    }

<<<<<<< HEAD


=======
>>>>>>> e932804d48d70719daa79b11faa347769af5783a
    @Test
    void compareTo() {
        //TODO write tests for this class
    }

}
