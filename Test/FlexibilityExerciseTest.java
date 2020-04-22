import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlexibilityExerciseTest {
    @org.junit.Test
    public void flexibilityClassTest(){
        Exercise FlexibilityExerciseTest  = new FlexibilityExercise(60, 20, 8, 3, "nothing");

        assertTrue(FlexibilityExerciseTest.intensity == 60);
        System.out.println("Testing for correct intensity ");

        assertTrue(FlexibilityExerciseTest.duration == 20);
        System.out.println("Testing for correct duration ");

        assertTrue(FlexibilityExerciseTest.repetitions == 8);
        System.out.println("Testing for correct repetitions ");

        assertTrue(FlexibilityExerciseTest.sets == 3);
        System.out.println("Testing for correct sets ");

        assertTrue(((FlexibilityExercise) FlexibilityExerciseTest).requirement.contains("nothing"));
        System.out.println("Testing for correct equipment ");
        }

        @org.junit.Test
        public void testToString() {
            Exercise  FlexibilityExercise  = new FlexibilityExercise(60, 20, 8, 3, "nothing");
            equals(FlexibilityExercise.toString().contains("flexibility"));
            System.out.println("Testing for Check of String");
        }
}

