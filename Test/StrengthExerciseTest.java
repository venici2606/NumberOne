import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrengthExerciseTest {
    @Test
    public void strengthClassTest(){
        Exercise StrengthExerciseTest  = new StrengthExercise(1, 2, 3, 4,20,  "Dumbell");

        assertTrue(StrengthExerciseTest.intensity ==1);
        System.out.println("Testing for correct intensity ");
        assertTrue(StrengthExerciseTest.duration ==2);
        System.out.println("Testing for correct duration ");
        assertTrue(StrengthExerciseTest.repetitions ==3);
        System.out.println("Testing for correct repetitions ");
        assertTrue(StrengthExerciseTest.sets ==4);
        System.out.println("Testing for correct sets ");
        assertTrue(((StrengthExercise) StrengthExerciseTest).weights ==20);
        System.out.println("testing for correct weight");
        assertTrue(((StrengthExercise) StrengthExerciseTest).equipment.contains("D"));
        System.out.println("Testing for correct equipment ");
    }
    @Test
    public void testToString() {
        Exercise  StrengthExercise  = new StrengthExercise(1, 2, 3, 4, 20,"Dumbell");
        equals(StrengthExercise.toString().contains("s"));
        System.out.println("Testing for Check of String");
    }

}

