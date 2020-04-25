public class Person {
    String preferredExercise;
    int acceptableIntensity;
    Program currentProgram;

    public Person(String preferredExercise, int acceptableIntensity, Program currentProgram) {
        this.preferredExercise = preferredExercise;
        this.acceptableIntensity = acceptableIntensity;
        this.currentProgram = currentProgram;
    }

<<<<<<< HEAD

=======
>>>>>>> 05fcda55c3377f515547b53b2dfe7fe6eb7ac551
    @Override
    public String toString() {
        return "Preferred exercise: " + preferredExercise + '\n' +
                "Acceptable intensity: " + acceptableIntensity + " %" + '\n' +
                "Current program: " + currentProgram.exercises + '\n';
    }
<<<<<<< HEAD

=======
>>>>>>> 05fcda55c3377f515547b53b2dfe7fe6eb7ac551
}