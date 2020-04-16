import java.util.ArrayList;

public class ExerciseManager {

    private static void makeProgram( ArrayList <Exercise> exercises ){
        Program p;
        p= new Program();
        p.addExercises(exercises);
        System.out.println("Dette er et program som inneholder disse øvelsene "+ '\n' + p.exercises);
        exercises.clear();
    }


    public static void main(String[] args) {

        ArrayList <Exercise> exercises = new ArrayList<>();
        Exercise e;


//program 1

        e = new StrengthExercise(30, 20, 30, 40, 20, "hei");
        exercises.add(e);
        e = new EnduranceExercise(1, 2, 2, 2, "hei");
        exercises.add(e);
        e = new FlexibilityExercise(1, 2, 2, 2, "hei");
        exercises.add(e);
        e = new BalanceExercise(1, 2, 2, 2, "hei");
        exercises.add(e);
        makeProgram(exercises);

//program 2
        e = new StrengthExercise(30, 20, 30, 40, 20, "hade");
        exercises.add(e);
        e = new EnduranceExercise(1, 2, 2, 2, "hade");
        exercises.add(e);
        e = new FlexibilityExercise(1, 2, 2, 2, "hade");
        exercises.add(e);
        e = new BalanceExercise(1, 2, 2, 2, "hade");
        exercises.add(e);
        makeProgram(exercises);

/*
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


        System.out.println(p.isProgramBalanced());

//1 c. Each program has the exercises sorted in order of increasing intensity.



//1 d. Overall duration for the programs are set.
        p.setDuration(e.duration);
        System.out.println(p.calculateDuration());


        System.out.println(e.toString()); /* skriver ut siste fra arrayet

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



        // ArrayList<Person> personList = new ArrayList<>();

        Person person1 = new Person("endurance", 61, program1);
        //personList.add(person1);

        Person person2 = new Person("strength", 60, program2);
        //personList.add(person2);

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

      /*System.out.println(doesProgramFit(person1, program1));


    }
/*
     public static boolean doesProgramFit(Person person, Program program) {
        if(program.exercises.toString().contains(person.preferredExercise) &&
                (program.overallIntensity() <= (person.acceptableIntensity + 10) ) &&
                (program.overallIntensity() >= (person.acceptableIntensity - 10) ) ){
            System.out.print("Does program fit person? ");
            return true;
        } else {
            System.out.print("Does program fit person? ");
            return false;
        }
*/
    }


}
