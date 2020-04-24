import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnduranceExerciseTest {
    @Test
    public void EnduranceClassTest() {
        Exercise EnduranceExerciseTest = new EnduranceExercise(1, 2, 3, 4, "Dumbell");
        assertTrue(EnduranceExerciseTest.intensity == 1);
        System.out.println("Testing for correct intensity ");
        assertTrue(EnduranceExerciseTest.duration == 2);
        System.out.println("Testing for correct duration ");
        assertTrue(EnduranceExerciseTest.repetitions == 3);
        System.out.println("Testing for correct repetitions ");
        assertTrue(EnduranceExerciseTest.sets == 4);
        System.out.println("Testing for correct sets ");
        assertTrue(EnduranceExerciseTest.toString().contains("D"));
        System.out.println("Testing for correct equipment ");
    }

    @Test
    public void testToString() {
        Exercise EnduranceExercise = new EnduranceExercise(1, 2, 3, 4, "Dumbell");
        equals(EnduranceExercise.toString().contains("s"));
        System.out.println("Testing for Check of String");
    }
}



