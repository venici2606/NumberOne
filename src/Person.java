import java.util.ArrayList;

public class Person {
    String preferredExercise;
    int acceptableIntensity;
    Program currentProgram;

    public Person(String preferredExercise, int acceptableIntensity, Program currentProgram) {
        this.preferredExercise = preferredExercise;
        this.acceptableIntensity = acceptableIntensity;
        this.currentProgram = currentProgram;
    }

            /*      Trenger kanskje ikke dette
                public String getPreferredExercise() {
                    return preferredExercise;
                }

                public int getAcceptableIntensity() {
                    return acceptableIntensity;
                }

                public String getCurrentProgram(){
                    return currentProgram;
                }

             */

    @Override
    public String toString() {
        return "Preferred exercise: " + preferredExercise + '\n' +
                "Acceptable intensity: " + acceptableIntensity + " %" + '\n' +
                "Current program: " + currentProgram + '\n';
    }
/*
    ArrayList<Person> personData = new ArrayList<>();

    public void gatherPersons(ArrayList<Person> personData) {
        this.personData = personData;
    } */

}