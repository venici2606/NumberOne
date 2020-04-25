import java.util.ArrayList;

public class ExerciseManager {
    public static void main(String[] args) {

        ArrayList <Exercise> exercises1 = new ArrayList<>();
        ArrayList <Exercise> exercises2 = new ArrayList<>();
        ArrayList <Exercise> exercises3 = new ArrayList<>();
        ArrayList <Exercise> exercises4 = new ArrayList<>();

        Program program1 = new Program();
        Program program2 = new Program();
        Program program3 = new Program();
        Program program4 = new Program();

// We use Program P as an empty program so that we can use it to access the program-class.
        Program p = new Program();

//Creating exercises to add to a program
        exercises1.add(new StrengthExercise(70, 20, 10, 3, 20, "Dumbbells"));
        exercises1.add(new EnduranceExercise(50, 30, 4, 1, "Stop watch"));
        exercises1.add(new FlexibilityExercise(40, 10, 1, 1, "A yoga mat"));
        exercises1.add(new BalanceExercise(40, 15, 3, 2, "A Balance ball"));
        p.sortExercise(exercises1);
//makeProgram is referred to a method in Program-class, that takes the exercises we added and makes it into a program
        p.makeProgram(exercises1, program1);

        exercises2.add(new StrengthExercise(75, 20, 12,4 , 0, "Your hands"));
        exercises2.add(new FlexibilityExercise(25, 10, 2, 2, "A yoga mat and being able to sit in a lotus position"));
        exercises2.add(new BalanceExercise(15, 5, 15, 2, "A tree"));
        exercises2.add(new BalanceExercise(20, 5, 15, 2, "A climbing wall"));
        p.sortExercise(exercises2);
        p.makeProgram(exercises2, program2);

//Creating exercises to add to another program
        exercises3.add(new StrengthExercise(50, 20, 12,4 , 8, "Kettle bells"));
        exercises3.add(new EnduranceExercise(40, 60, 1, 1, "Long distance running shoes"));
        exercises3.add(new FlexibilityExercise(30, 6, 6, 5, "Needs to be able to do a split"));
        exercises3.add(new FlexibilityExercise(15, 15, 1, 1, "No requirements"));
        exercises3.add(new BalanceExercise(45, 8, 20, 2, "Bosu ball"));
        p.sortExercise(exercises3);
        p.makeProgram(exercises3, program3);

        exercises4.add(new FlexibilityExercise(50,30,5,6,"Needs to know basic yoga"));
        p.sortExercise(exercises4);
        p.makeProgram(exercises4, program4);

        Person person1 = new Person("endurance", 55, p);
        Person person2 = new Person("strength", 80, p);
        Person person3 = new Person("balance",50 , p);

        System.out.println( p.giveProgram(person1));
        System.out.println( p.giveProgram(person2));
        System.out.println( p.giveProgram(person3));
    }

}


