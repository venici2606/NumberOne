import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnduranceExerciseTest {
    Exercise EnduranceExerciseTest  = new EnduranceExercise(1, 2, 3, 4, "Melkespann");
    @Test
    public void EnduranceClassTest(){
        assertEquals(1, EnduranceExerciseTest.intensity);
        System.out.println("Testing for correct intensity ");
        assertEquals(2, EnduranceExerciseTest.duration);
        System.out.println("Testing for correct duration ");
        assertEquals(3, EnduranceExerciseTest.repetitions);
        System.out.println("Testing for correct repetitions ");
        assertEquals(4, EnduranceExerciseTest.sets);
        System.out.println("Testing for correct sets ");
        assertTrue(EnduranceExerciseTest.toString().contains("Melkespann"));
        System.out.println("Testing for correct equipment");
    }
    @Test
    public void testToString() {
        assertTrue(EnduranceExerciseTest.toString().contains("endurance"));
        System.out.println("Testing toString");
    }
}

