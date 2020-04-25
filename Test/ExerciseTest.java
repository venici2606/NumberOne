import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTest {
    Exercise e = new StrengthExercise(11,1,1,1,1,"hei");

    @Test
    void ToStringTest() {
        assertTrue(e.toString().contains("e"));
        assertTrue(e.toString().contains("strength"));
    }
    @Test
    void getIntensity() {
        assertEquals(11, e.getIntensity());
    }
    @Test
    void compareTo() {
        assertTrue(e.compareTo(e) == 0);
    }

    /*  We don't know how to test for the throw exception
    @Test
    void throwException(){
        Exercise e3 = new StrengthExercise(101, 1,1,1,1,"test");

        assertSame("Invalid intensity value", e3);
        assertTrue(e3.intensity == "Invalid intensity value");
    }*/

}
