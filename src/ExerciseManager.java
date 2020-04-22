import java.util.ArrayList;

public class ExerciseManager {
    public static void main(String[] args) {

        ArrayList <Exercise> exercises1 = new ArrayList<>();
        ArrayList <Exercise> exercises2 = new ArrayList<>();
        ArrayList <Exercise> exercises3 = new ArrayList<>();
        ArrayList <Exercise> exercises4 = new ArrayList<>();

        Program p = new Program();
        Program program1 = new Program();
<<<<<<< HEAD
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



=======
        Program program2 = new Program();
        Program program3 = new Program();
        Program program4 = new Program();

//Creating exercises to add to a program
        exercises1.add(new StrengthExercise(70, 20, 10, 3, 20, "Dumbbells"));
        exercises1.add(new EnduranceExercise(50, 30, 4, 1, "Stop watch"));
        exercises1.add(new FlexibilityExercise(40, 10, 1, 1, "A yoga mat"));
        exercises1.add(new BalanceExercise(40, 15, 3, 2, "A Balance ball"));
//makeProgram is referred to a method in Program-class, that takes the exercises we added and makes it into a program
        p.makeProgram(exercises1, program1);

        exercises2.add(new StrengthExercise(75, 20, 12,4 , 0, "Your hands"));
        exercises2.add(new FlexibilityExercise(25, 10, 2, 2, "A yoga mat and being able to sit in a lotus position"));
        exercises2.add(new BalanceExercise(15, 5, 15, 2, "A tree"));
        exercises2.add(new BalanceExercise(20, 5, 15, 2, "A climbing wall"));
        p.makeProgram(exercises2, program2);

//Creating exercises to add to another program
        exercises3.add(new StrengthExercise(50, 20, 12,4 , 8, "Kettle bells"));
        exercises3.add(new EnduranceExercise(40, 60, 1, 1, "Long distance running shoes"));
        exercises3.add(new FlexibilityExercise(30, 6, 6, 5, "Needs to be able to do a split"));
        exercises3.add(new FlexibilityExercise(15, 15, 1, 1, "No requirements"));
        exercises3.add(new BalanceExercise(45, 8, 20, 2, "Bosu ball"));
        p.makeProgram(exercises3, program3);

        exercises4.add(new FlexibilityExercise(50,30,5,6,"Needs to know basic yoga"));
        p.makeProgram(exercises4, program4);

        Person person1 = new Person("endurance", 55, p);
        Person person2 = new Person("strength", 80, p);
        Person person3 = new Person("balance",50 , p);

        System.out.println( p.giveProgram(person1));
        System.out.println( p.giveProgram(person2));
        System.out.println( p.giveProgram(person3));

    }
>>>>>>> e2bab19da92a665d6ce53dd2ab81cf7aeb7ad930
}

