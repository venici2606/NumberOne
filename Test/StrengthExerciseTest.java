import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrengthExerciseTest {
    Exercise StrengthExerciseTest  = new StrengthExercise(1, 2, 3, 4,20,  "Dumbell");
    @Test
    public void strengthClassTest(){
        assertEquals(1, StrengthExerciseTest.intensity);
        System.out.println("Testing for correct intensity ");
        assertEquals(2, StrengthExerciseTest.duration);
        System.out.println("Testing for correct duration ");
        assertEquals(3, StrengthExerciseTest.repetitions);
        System.out.println("Testing for correct repetitions ");
        assertEquals(4, StrengthExerciseTest.sets);
        System.out.println("Testing for correct sets ");
        assertEquals(20, ((StrengthExercise) StrengthExerciseTest).weights);
        System.out.println("testing for correct weight");
        assertTrue(((StrengthExercise) StrengthExerciseTest).equipment.contains("Dumbell"));
        System.out.println("Testing for correct equipment ");
    }
    @Test
    public void testToString() {
        assertTrue(StrengthExerciseTest.toString().contains("strength"));
        System.out.println("Testing toString");
    }
}

