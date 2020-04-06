import java.util.ArrayList;


public class ExerciseManager {


    public static void main(String[] args) {


       //  System.out.println(endurance.toString());
        // this is an arraylist for a program.
        ArrayList <Exercise> exercises = new ArrayList<>();


        // make exercises - shortcut alle kalles nå for e, uavhengig av om det er
        Exercise e;

//1. Exercises are added to Programs.
        e = new Endurance(50, 30, 15,3,"your own bodyweight");
        exercises.add(e);

        e = new Endurance(30, 60,15,6,"kettlebells");
        exercises.add(e);

        Program p;
        // the programs are made.
        p = new Program();

        // the exercises are added to the program.
        p.addExercises(exercises);

        // the duration for the programs are set.
        p.setDuration(e.duration);


        System.out.println(p.calculateDuration());



       // System.out.println(program1.exercises);


    }

}
