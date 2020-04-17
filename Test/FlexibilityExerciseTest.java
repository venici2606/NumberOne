import java.util.ArrayList;

public class FlexibilityExerciseTest {
    @org.junit.jupiter.api.Test
    void testToString() {

        // Lager ArrayList for programmene
        ArrayList<Exercise> exercises = new ArrayList<>();


        // Gjorde alle exercisene hver for seg - tungvindt. Laget heller forkortelser - mindre koding / mer ryddig.
        // Nå heter alle Exercises e

        Exercise e;

        e = new FlexibilityExercise(1,3,2,4, "Nothing");
        exercises.add(e);
        e = new FlexibilityExercise(4,3,2,4, "Moderate flexibility");
        exercises.add(e);


        //  Laget en forkortelse for Program for så å lage programmene
        // trenger random input for å teste -Bilal
        Program p;
        p = new Program(1,1,1,1,1);

        //  Her hentes exercisene ut fra arrayet over for så å bli skrevet ut.
        p.addExercises(exercises);
        System.out.println(p.exercises);

        System.out.println(e.toString());

        // Slik så det ut før jeg forkortet Exercise til e.
//        System.out.println(e1.toString());
//        System.out.println(e2.toString());
//        System.out.println(e3.toString());
//        System.out.println(e4.toString());
    }
}

