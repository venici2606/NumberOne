import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void compareTo() {
        //TODO write tests for this class
    }

}
