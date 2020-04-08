import java.util.*;


public abstract class ExerciseManager {

public static void main(String []args){
    List<String> exercisesLst = new ArrayList<>();
     exercisesLst.add("Balance");
     exercisesLst.add("Strength");
     exercisesLst.add("Endurance");
     exercisesLst.add("Flexibility");

     Iterator<String> iter = exercisesLst.iterator();
     while (iter.hasNext()) {
         String str = iter.next();
         System.out.println("You can choose between: " + str);
     }


 }
 public static String findExercise(String Person) {
String exercise;
if (Person ) {
exercise="";
} else if(Person )
 }


    }

