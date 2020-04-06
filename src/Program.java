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

    public int getDuration() {
        return duration*2;
    }
}
