import java.util.ArrayList;

public class ExerciseManager {
    //private programs program;
    public static void main(String[] args) {

            /* Program */

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

        Program p;
        p = new Program();

//1. Exercises are grouped into Programs.
        p.addExercises(exercises);

// 1 a. Each program keeps an account of the overall intensity
        // (the highest intensity among the included exercises).

        p.overallIntensity();
        System.out.println(p.intensitylevel + " % is the overall intensity for this program" + '\n'); /* hvilket prgram? */

// 1 b. Each program keeps account of whether or not it is balanced.
//     A balanced program has at least one exercise of each type.
                //System.out.println(p.exercises); /* Her skrives det ut som en array med [ ... ]*/

                /* Her vil vi få en oversikt som ved personList */
        for (Exercise plist : exercises) {
            System.out.println(plist);
        }


                // System.out.println(p.isProgramBalanced());

//1 c. Each program has the exercises sorted in order of increasing intensity.



//1 d. Overall duration for the programs are set.
        p.setDuration(e.duration);
        System.out.println(p.calculateDuration()); /* Kalkulerer dette alle exercisene eller programmene? */


            //System.out.println(e.toString()); /* skriver ut siste fra arrayet */
        // System.out.println(program1.exercises);

            /* Program slutt */

        ArrayList<Person> personList = new ArrayList<>();

        Person person1 = new Person("kettle", 40, "Program en");
        personList.add(person1);

        Person person2 = new Person("yoga", 60, "Program to");
        personList.add(person2);

        Person person3 = new Person("running", 70, "Program tre");
        personList.add(person3);


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

    }

    //        Sjekk at preferred == øvelsen i programmet, og acceptableIntensity >= intensity på programmet

    public static void checkProgram(){



    }

}
