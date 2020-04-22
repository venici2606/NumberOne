import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalanceExerciseTest {
    @org.junit.Test
    public void balanceClassTest(){
        Exercise BalanceExerciseTest = new BalanceExercise(40, 15, 3, 4, "balance board");

        assertTrue(BalanceExerciseTest.intensity == 40);
        System.out.println("Testing for correct intensity ");

        assertTrue(BalanceExerciseTest.duration == 15);
        System.out.println("Testing for correct duration ");

        assertTrue(BalanceExerciseTest.repetitions == 3);
        System.out.println("Testing for correct repetitions ");

        assertTrue(BalanceExerciseTest.sets == 4);
        System.out.println("Testing for correct sets ");

        assertTrue(((BalanceExercise) BalanceExerciseTest).equipment.contains("board"));
        System.out.println("Testing for correct equipment ");
    }

    @org.junit.Test
    public void testToString() {
        Exercise  BalanceExercise  = new BalanceExercise(40, 15, 3, 4, "balance board");
        equals(BalanceExercise.toString().contains("balance"));
        System.out.println("Testing for Check of String");
    }

}
