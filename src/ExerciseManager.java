import java.util.ArrayList;

public class ExerciseManager {

    public static void main(String[] args) {


        ArrayList <Exercise> exercises = new ArrayList<>();

        Exercise e;

        e = new EnduranceExercise(50, 30, 15,3,"your own body weight");
        exercises.add(e);

        e = new EnduranceExercise(30, 60,15,6,"yoga mat");
        exercises.add(e);

        e = new EnduranceExercise(70, 15,15,6,"running shoes");
        exercises.add(e);

        e = new StrengthExercise(20,1,3,2,4,"kettle bells");
        exercises.add(e);

// Trenger random input for å teste - Bilal
        Program p;
        p = new Program(1,1,1,1,1);


//1. Exercises are grouped into Programs.
        p.addExercises(exercises);

// 1 a. Each program keeps an account of the overall intensity
        // (the highest intensity among the included exercises).

        p.overallIntensity();
        System.out.println(p.intensitylevel + " % is the overall intensity for this program" + '\n'); /* hvilket prgram? */

// 1 b. Each program keeps account of whether or not it is balanced.
//     A balanced program has at least one exercise of each type.
        System.out.println(p.exercises);

        /* Her vil vi få en oversikt som ved personList

        for (Exercise plist : exercises) {
            System.out.println(plist);
        }
         */

        System.out.println(p.isProgramBalanced());

//1 c. Each program has the exercises sorted in order of increasing intensity.



//1 d. Overall duration for the programs are set.
        p.setDuration(e.duration);
        System.out.println(p.calculateDuration());


        System.out.println(e.toString()); /* skriver ut siste fra arrayet */

        /* TEST */
        Exercise exercise_e = new EnduranceExercise(50, 30, 15, 3, "yoga");
        Program program1 = new Program(1,1,1,1,1);

        Exercise exercise_s = new EnduranceExercise(70, 15,15,6,"running shoes");
        Program program2 = new Program(1,1,1,1,1);

        ArrayList<Person> personList = new ArrayList<>();

        Person person1 = new Person("kettle", 40, program1);
        personList.add(person1);

        Person person2 = new Person("yoga", 60, program2);
        personList.add(person2);
        /* TEST SLUTT */


        // for-each loop to divide the array
        for (Person list : personList){
            System.out.println(list);
        }


        /*
        Person pers;

        pers = new Person("kettle", 40);
        pers = new Person("yoga", 60);
        pers = new Person("running", 70);

        System.out.println(pers.toString());
        */

        // System.out.println(p.exercises);

    }


}
