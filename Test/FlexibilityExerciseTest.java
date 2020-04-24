import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlexibilityExerciseTest {
    Exercise FlexibilityExerciseTest  = new FlexibilityExercise(60, 20, 8, 3, "nothing");

    @org.junit.Test
    public void flexibilityClassTest(){
        assertEquals(60, FlexibilityExerciseTest.intensity);
        System.out.println("Testing for correct intensity ");
        assertEquals(20, FlexibilityExerciseTest.duration);
        System.out.println("Testing for correct duration ");
        assertEquals(8, FlexibilityExerciseTest.repetitions);
        System.out.println("Testing for correct repetitions ");
        assertEquals(3, FlexibilityExerciseTest.sets);
        System.out.println("Testing for correct sets ");
        assertTrue(((FlexibilityExercise) FlexibilityExerciseTest).requirement.contains("nothing"));
        System.out.println("Testing for correct equipment ");
        }

        @org.junit.Test
        public void testToString() {
           assertTrue(FlexibilityExerciseTest.toString().contains("flexibility"));
            System.out.println("Testing toString");
        }


    }




