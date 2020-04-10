import java.util.ArrayList;


public class ExerciseManager {


    //TODO make the toString in each class contain its own name!! its for the program-isbalanced-method.

    public static void main(String[] args) {
// Methods for building new programs.
        ArrayList<Exercise> exercises = new ArrayList<>();
        Exercise e;

        e = new EnduranceExercise(40, 50, 20, 3, "your own body weight");
        exercises.add(e);

        e = new EnduranceExercise(40, 50, 15, 6, "yoga mat");
        exercises.add(e);

        e = new EnduranceExercise(70, 15, 15, 6, "rowers");
        exercises.add(e);

        e = new StrengthExercise(20, 5, 3, 2, 4, "Dumbbells");
        exercises.add(e);

        Program p;
        p = new Program();
        p.addExercises(exercises);
        p.overallIntensity();

        System.out.println(p.intensitylevel + " % is the overall intensity for this program");
        System.out.println(p.exercises);
        p.setDuration(e.duration);
        System.out.println(p.calculateDuration());
        System.out.println(e.toString());
        System.out.println(p.isProgramBalanced());


        // Deciding if a program is appropriate for a given person

        String person ="newProgram";
        int intensity=60;
        int duration=30;
        String program;

        if (duration <=30 && intensity >=60){
            program="appropriated for a given person";

        } else if (duration <=20 && intensity >=50) {
            program=" not 100% appropriated, but close enough";
        } else if (duration<=10 && intensity >=70) {
            program="not so appropriated for a given person";
        } else {
            program="not appropriated for a given person";
        }
        System.out.println("The program " + person + " is: " + program );




}
// Method for recommendation



}