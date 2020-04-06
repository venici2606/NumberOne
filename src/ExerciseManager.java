import java.util.ArrayList;

public class ExerciseManager {


    public static void main(String[] args) {
        Exercise endurance = new Endurance(50, 30, 15,3,"your own bodyweight");
        Exercise endurance2 = new Endurance(30, 60,15,6,"kettlebells");

       //  System.out.println(endurance.toString());

        ArrayList <Exercise> exercises = new ArrayList<>();

        exercises.add(endurance2);
        exercises.add(endurance);

        Program program1 = new Program();

        program1.addExercises(exercises);

        System.out.println(program1.exercises);


    }

}
