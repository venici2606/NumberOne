import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

    public class Program extends Exercise {
        //int durationE;
        int intensitylevel;


/* Dette er en constructor for Program classen, siden abstract class ikke kan bli initialized må vi ha en constructor i en
subclass(Program) for å hente ut varabler fra abstract classen ved bruk av super. Dermed kan man initialize subclassen(Program) istedet*/
        public Program(int intensity, int duration, int repetitions, int sets, int intensitylevel) {
            super(intensity, duration, repetitions, sets);
            this.intensitylevel = intensitylevel;
        }

//1 Exercises are grouped into Programs.
        ArrayList<Exercise> exercises = new ArrayList<>();


    public void addExercises(ArrayList<Exercise> exercises) {
            this.exercises = exercises;
        }

        public void setDuration(int duration) {
            this.duration += duration;
        }


// 1a. Each program keeps an account of the overall intensity (the highest intensity among the included exercises).
        public void overallIntensity(){
            intensitylevel = 0;
            for (Exercise e: exercises){
                if(e.intensity >intensitylevel){
                    intensitylevel = e.intensity;
                }
            }
        }

//  1b. Each program keeps account of whether or not it is balanced.
//  A balanced program has at least one exercise of each type.

        public boolean isProgramBalanced() {
            boolean isBalanced = false;

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

// 1c. Each program has the exercises sorted in order of increasing intensity.

        public static void main(String[] args) {

            List<Exercise> ovelser = new ArrayList<Exercise>(Arrays.asList());

            System.out.println("Ikke sortert" + ovelser.toString());
            Collections.sort(ovelser);
            System.out.println("Sortert:"+ ovelser.toString());
        }

// 1d. Each program has an overall duration.The duration of an exercise( Program) is twice the sum of the
// durations of all the exercises it includes (to account for rest).*/
        public String calculateDuration() {
            int totalDuration = 0;
            for (Exercise e : exercises) {
                totalDuration += e.duration*2;
            }
            return  "This program takes "+totalDuration+ " minutes from start to finish";
        }

    }

