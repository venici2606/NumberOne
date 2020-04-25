public class Person {
    String preferredExercise;
    int acceptableIntensity;
    Program currentProgram;

    public Person(String preferredExercise, int acceptableIntensity, Program currentProgram) {
        this.preferredExercise = preferredExercise;
        this.acceptableIntensity = acceptableIntensity;
        this.currentProgram = currentProgram;
    }

    @Override
    public String toString() {
        return "Preferred exercise: " + preferredExercise + '\n' +
                "Acceptable intensity: " + acceptableIntensity + " %" + '\n' +
                "Current program: " + currentProgram.exercises + '\n';
    }
}