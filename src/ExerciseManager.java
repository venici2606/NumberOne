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


        Program p;
        p = new Program();


//1. Exercises are grouped into Programs.
        p.addExercises(exercises);

// 1 a. Each program keeps an account of the overall intensity
        // (the highest intensity among the included exercises).

        p.overallIntensity();
        System.out.println(p.intensitylevel + " % is the overall intensity for this program" + '\n');

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

// Add program to Person - START
        Exercise exercise_e1 = new EnduranceExercise(70, 30, 15, 3, "yoga");
        exercises.add(exercise_e1);
        Exercise exercise_s1 = new StrengthExercise(60, 20, 8, 3, 5, "kettle bell");
        exercises.add(exercise_s1);
        Exercise exercise_b1 = new BalanceExercise(40, 15, 4, 2, "yoga mat");
        exercises.add(exercise_b1);
        Exercise exercise_f1 = new FlexibilityExercise(50, 30, 12, 2, "nothing");
        exercises.add(exercise_f1);

        Program program1 = new Program();
        program1.exercises.add(exercise_e1);
        program1.exercises.add(exercise_s1);
        program1.exercises.add(exercise_b1);
        program1.exercises.add(exercise_f1);


        Exercise exercise_e2 = new EnduranceExercise(60, 30,0,0,"cycle");
        exercises.add(exercise_e2);
        Exercise exercise_f2 = new FlexibilityExercise(50, 30, 12, 2, "nothing");
        exercises.add(exercise_f2);

        Program program2 = new Program();
        program2.exercises.add(exercise_e2);
        program2.exercises.add(exercise_f2);

        Exercise exercise_b3 = new BalanceExercise(50, 25, 8, 2, "yoga mat");
        exercises.add(exercise_b3);
        Exercise exercise_s3 = new StrengthExercise(60, 40, 12, 4, 0, "body weight");
        exercises.add(exercise_s3);

        Program program3 = new Program();
        program3.exercises.add(exercise_b3);
        program3.exercises.add(exercise_s3);


        // ArrayList<Person> personList = new ArrayList<>();

        Person person1 = new Person("endurance", 61, program1);
        //personList.add(person1);

        Person person2 = new Person("strength", 60, program2);
        //personList.add(person2);

        Person person3 = new Person("balance", 50, program1);

        System.out.println(person1);
        program1.overallIntensity();
        System.out.println("Overall intensity for this program: " + program1.intensitylevel + " % \n");

        System.out.println(person2);
        program2.overallIntensity();
        System.out.println("Overall intensity for this program: " + program2.intensitylevel + " % \n");

// Add program to Person - END

/*
        // for-each loop to divide the array
        for (Person list : personList){
            System.out.println(list);
        }

 */


        /*
        Person pers;

        pers = new Person("kettle", 40);
        pers = new Person("yoga", 60);
        pers = new Person("running", 70);

        System.out.println(pers.toString());
        */

        // System.out.println(p.exercises);

        System.out.println(doesProgramFit(person1, program1));

        System.out.println(program1.overallIntensity());
        System.out.println(program2.overallIntensity());
        System.out.println(program3.overallIntensity());

        System.out.println(giveProgram(program1));

    }

     public static boolean doesProgramFit(Person person, Program program) {
        if(program.exercises.toString().contains(person.preferredExercise) &&
                (program.overallIntensity() <= (person.acceptableIntensity + 10) ) &&
                (program.overallIntensity() >= (person.acceptableIntensity - 10) ) ){
            System.out.print("Does program fit person? ");
            return true;
        } else {
            //System.out.print("Does program fit person? ");
            return false;
        }

    }
   /* A method for recommending, from a given collection of Programs, which is most appropriate for a given Person. */

    public static String giveProgram(Program program, Person person){
        switch (program.exercises.toString().contains(person.preferredExercise)){
            case "endurance":
                System.out.println(program.exercises.contains("exercise_e"));
                break;
            case "strength":
                System.out.println(program.exercises.contains("exercise_s"));
                break;
        }
    }
/*
    public void giveProgram(Program program, Person person){
        if(program.overallIntensity() <= (person.acceptableIntensity + 10) ){

        }


    }
 */


}
