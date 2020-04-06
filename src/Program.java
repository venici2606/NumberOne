import java.util.ArrayList;

public class Program {
    int duration;
    int intensitylevel;



    ArrayList<Exercise> exercises = new ArrayList<>();

    public void addExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }


    public void setDuration(int duration) {
        this.duration += duration;
    }

    public String calculateDuration() {
        int totalDuration = 0;
        for (Exercise e : exercises) {
            totalDuration += e.duration*2;
        }
        return  "This program takes "+totalDuration+ " minutes from start to finish";
    }

}
