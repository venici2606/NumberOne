import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class EnduranceExerciseTest {
    @Test
    public void EnduranceClassTest(){

        Exercise enduranceTest = new EnduranceExercise(1,2,3,4,"five");
        assertTrue(enduranceTest.intensity == 1);
        System.out.println("Testing for correct intensity in Endurance object");
    }

    @Test
    public void EnduranceMethodTest(){
        Exercise enduranceTest = new EnduranceExercise(1,2,3,4,"five");
        enduranceTest.Method();
        assert(enduranceTest.Method().contentEquals("This is endurance"));
    }
    @Test
    public void EnduranceToStringTest(){
        Exercise enduranceTest = new EnduranceExercise(1,2,3,4,"five");
        equals(enduranceTest.toString().contains("s"));
    }


    //TODO figure out a way to test the method(), right now i only get void. - cant test for void.
      /*
   @Test
    public void EnduranceMethodTest(){
        Exercise test = new Endurance();
        test.Method();
 //Cannot test for void. Wanted to check if Exercise.Method() was inherited.
        assertTrue(test.Method() == "This is endurance");
         equals(test.Method() == "This is endurance");
    }
    */

}
