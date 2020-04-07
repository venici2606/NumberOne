import java.util.ArrayList;

public class Person {
    String preferredExercise;
    int acceptableIntensity;

    public Person(String preferredExercise, int acceptableIntensity) {
        this.preferredExercise = preferredExercise;
        this.acceptableIntensity = acceptableIntensity;
    }

    @Override
    public String toString() {
        return "Preferred exercise: " + preferredExercise + '\n' +
                "Acceptable intensity: " + acceptableIntensity + " %" + '\n';
    }
/*
    ArrayList<Person> personData = new ArrayList<>();

    public void gatherPersons(ArrayList<Person> personData) {
        this.personData = personData;
    } */

}
