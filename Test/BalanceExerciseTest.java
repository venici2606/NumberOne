import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalanceExerciseTest {
    Exercise BalanceExerciseTest = new BalanceExercise(40, 15, 3, 4, "balance board");

    @org.junit.Test
    public void balanceClassTest(){
<<<<<<< HEAD

<<<<<<< HEAD

        assertTrue(BalanceExerciseTest.intensity == 40);
=======
=======
>>>>>>> 05fcda55c3377f515547b53b2dfe7fe6eb7ac551
        assertEquals(40, BalanceExerciseTest.intensity);
>>>>>>> d16345b99938ab53bda0a0814853a4b8f8986385
        System.out.println("Testing for correct intensity ");
        assertEquals(15, BalanceExerciseTest.duration);
        System.out.println("Testing for correct duration ");
        assertEquals(3, BalanceExerciseTest.repetitions);
        System.out.println("Testing for correct repetitions ");
        assertEquals(4, BalanceExerciseTest.sets);
        System.out.println("Testing for correct sets ");
        assertTrue(((BalanceExercise) BalanceExerciseTest).equipment.contains("board"));
        System.out.println("Testing for correct equipment ");
    }

    @org.junit.Test
    public void testToString() {
       assertTrue(BalanceExerciseTest.toString().contains("balance"));
        System.out.println("Testing toString");
    }

}
