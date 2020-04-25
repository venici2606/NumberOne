<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
=======
    import java.util.ArrayList;
    import java.util.Collections;
>>>>>>> d16345b99938ab53bda0a0814853a4b8f8986385

public class Program {
    int duration;
    int intensitylevel;

<<<<<<< HEAD

    ArrayList<Exercise> exercises = new ArrayList<>();
    ArrayList <Program> listOfPrograms = new ArrayList<>();
=======
        ArrayList<Exercise> exercises = new ArrayList<>();
        ArrayList <Program> listOfPrograms = new ArrayList<>();
>>>>>>> d16345b99938ab53bda0a0814853a4b8f8986385

    public void addExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }
    public void setDuration(int duration) {
        this.duration += duration;
    }

<<<<<<< HEAD
    // Each program keeps an account of the overall intensity (the highest intensity among the included exercises).
    public int overallIntensity(){
        intensitylevel = 0;
        for (Exercise e: exercises){
            if(e.intensity >intensitylevel){
                intensitylevel = e.intensity;
=======
// Each program keeps an account of the overall intensity (the highest intensity among the included exercises).
        public int overallIntensity(){
            intensitylevel = 0;
            for (Exercise e: exercises){
                if(e.intensity >intensitylevel){
                    intensitylevel = e.intensity;
                }
>>>>>>> d16345b99938ab53bda0a0814853a4b8f8986385
            }
        }
<<<<<<< HEAD
        return intensitylevel;
    }
//   Each program keeps account of whether or not it is balanced.
//  A balanced program has at least one exercise of each type.

    public boolean isProgramBalanced() {
        boolean isBalanced = false;
=======

//   Each program keeps account of whether or not it is balanced.
//  A balanced program has at least one exercise of each type.
        public boolean isProgramBalanced() {
            boolean isBalanced = false;
>>>>>>> d16345b99938ab53bda0a0814853a4b8f8986385

        if (exercises.size() >= 4) {
            if (exercises.toString().contains("endurance")) {
                if (exercises.toString().contains("flexibility")) {
                    if (exercises.toString().contains("strength")) {
                        if (exercises.toString().contains("balance")) {
                            isBalanced = true;
                        }
                    }
                }
            }
        }
        return isBalanced;
    }

//  Each program has the exercises sorted in order of increasing intensity.
        public static String sortExercise(ArrayList<Exercise> exercises ){

            //String nonSorted = "Ikke sortert\n" + exercises.toString();
            Collections.sort(exercises);
            String sorted = "Sortert: \n" + exercises.toString();
            return sorted;
        }

<<<<<<< HEAD

    //  Each program has an overall duration.The duration of an exercise( Program) is twice the sum of the
=======
 //  Each program has an overall duration.The duration of an exercise( Program) is twice the sum of the
>>>>>>> d16345b99938ab53bda0a0814853a4b8f8986385
// durations of all the exercises it includes (to account for rest).*/
    public String calculateDuration() {
        int totalDuration = 0;
        for (Exercise e : exercises) {
            totalDuration += e.duration*2;
        }
        return  "This program takes "+totalDuration+ " minutes from start to finish";
    }

<<<<<<< HEAD
    //   Method for building new Programs
    public void makeProgram(ArrayList<Exercise> exercises, Program p){
        // Exercises are grouped into Programs.
        p.addExercises(exercises);
        p.calculateDuration();
        p.isProgramBalanced();
        listOfPrograms.add(p);

        System.out.println('\n'+ "Program: " +'\n'+
                p.calculateDuration() + '\n' +
                "Is this program balanced: " + p.isProgramBalanced() + '\n' +
                "This program has this level of intensity: "+  p.overallIntensity() + '\n' +
                "This program contains these exercises: " + '\n' + '\n' +
                p.exercises);
    }

    //    Methods for deciding if a Program is appropriate for a given Person
    public boolean doesProgramFit (Person person, Program program) {
        program.overallIntensity();
        return program.exercises.toString().contains(person.preferredExercise) && program.overallIntensity() <= (person.acceptableIntensity + 10) &&
                program.overallIntensity() >= (person.acceptableIntensity - 10);
    }
    //   A method for recommending, from a given collection of Programs, which is most appropriate for a given Person.
    public String giveProgram( Person person) {
        int number = 100;
        int saveNumber = 100;
        for (int i = 0; i < listOfPrograms.size(); i++) {
            int pAI = person.acceptableIntensity;
            int lGO = listOfPrograms.get(i).overallIntensity();
            if (doesProgramFit(person, listOfPrograms.get(i))) {
                for(int i1 =10; i1 > 0; i1--){
                    if(pAI <= (lGO + i1) && pAI >= (lGO - i1)) {
                        number = i1;
=======
//   Method for making new Programs
        public void makeProgram(ArrayList<Exercise> exercises, Program p){
            // Exercises are grouped into Programs.
            p.addExercises(exercises);
            p.calculateDuration();
            p.isProgramBalanced();
            listOfPrograms.add(p);

            System.out.println('\n'+ "Program: " +'\n'+
                    p.calculateDuration() + '\n' +
                    "Is this program balanced: " + p.isProgramBalanced() + '\n' +
                    "This program has this level of intensity: "+  p.overallIntensity() + '\n' +
                    "This program contains these exercises: " + '\n' + '\n' +
                    p.exercises);
        }

//    Methods for deciding if a Program is appropriate for a given Person
        public boolean doesProgramFit (Person person, Program program) {
            program.overallIntensity();
            return program.exercises.toString().contains(person.preferredExercise) && program.overallIntensity() <= (person.acceptableIntensity + 10) &&
                    program.overallIntensity() >= (person.acceptableIntensity - 10);
        }

 //   A method for recommending, from a given collection of Programs, which is most appropriate for a given Person.
        public String giveProgram( Person person) {
            int number = 100;
            int saveNumber = 100;
            for (int i = 0; i < listOfPrograms.size(); i++) {
                int pAI = person.acceptableIntensity;
                int lGO = listOfPrograms.get(i).overallIntensity();
                if (doesProgramFit(person, listOfPrograms.get(i))) {
                    for(int i1 =10; i1 > 0; i1--){
                        if(pAI <= (lGO + i1) && pAI >= (lGO - i1)) {
                            number = i1;
                        }
                    }
                    if (number < saveNumber) {
                        saveNumber = number;
                        person.currentProgram = listOfPrograms.get(i);
>>>>>>> d16345b99938ab53bda0a0814853a4b8f8986385
                    }
                }
                if (number < saveNumber) {
                    saveNumber = number;
                    person.currentProgram = listOfPrograms.get(i);
                }
            }

            if(person.currentProgram.overallIntensity() == 0){
                return "We are so sorry, we could not find a appropriate program for you";
            }else {
                return "We have assigned this program to you:  "+ '\n' +
                        "The programs overall intensity is "+ person.currentProgram.overallIntensity() +
                        " and this is your preferred intensity " + person.acceptableIntensity + '\n'+
                        person.currentProgram.exercises;
            }

        }
        if(person.currentProgram.overallIntensity() == 0){
            return "We are so sorry, we could not find a appropriate program for you";
        }else {
            return "We have assigned this program to you:  "+ '\n' +
                    "The programs overall intensity is "+ person.currentProgram.overallIntensity() + " and this is your preferred intensity " + person.acceptableIntensity + '\n'+
                    person.currentProgram.exercises;
        }
    }

}

