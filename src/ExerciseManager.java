import java.util.ArrayList;


public class ExerciseManager {


    //TODO make the toString in each class contain its own name!! its for the program-isbalanced-method.

    public static void main(String[] args) {



       //  System.out.println(endurance.toString());
        // this is an arraylist for a program.
        ArrayList <Exercise> exercises = new ArrayList<>();


        // make exercises - shortcut alle kalles nå for e, uavhengig av om det er
        Exercise e;

//1. Exercises are added to Programs.
        e = new Endurance(50, 30, 15,3,"your own body weight");
        exercises.add(e);

        e = new Endurance(30, 60,15,6,"yoga mat");
        exercises.add(e);

        e = new Endurance(70, 15,15,6,"running shoes");
        exercises.add(e);

        e = new Strength(20,1,3,2,4,"kettle bells");
        exercises.add(e);

        Program p;
        // the programs are made.
        p = new Program();

//1. Exercises are grouped into Programs.
        p.addExercises(exercises);

// 1 a. Each program keeps an account of the overall intensity
 // (the highest intensity among the included exercises).

        p.overallIntensity();
        System.out.println(p.intensitylevel + " % is the overall intensity for this program");

// 1 b. Each program keeps account of whether or not it is balanced.
//     A balanced program has at least one exercise of each type.
       System.out.println(p.exercises);

        System.out.println(p.isProgramBalanced());

//1 c. Each program has the exercises sorted in order of increasing intensity.



//1 d. Overall duration for the programs are set.
        p.setDuration(e.duration);

        System.out.println(p.calculateDuration());


        System.out.println(e.toString());
       // System.out.println(program1.exercises);


    }

}
