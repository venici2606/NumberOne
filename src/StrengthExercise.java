public class StrengthExercise extends Exercise {
    int weights;
    String equipment;

    public StrengthExercise(int intensity, int duration, int repetitions, int sets, int weights, String equipment) {
        super(intensity, duration, repetitions, sets);
        this.weights = weights;
        this.equipment = equipment;
    }
    @Override
    public String toString() {
        return "For this strength exercise you need "+ weights + " kg " + equipment + '\n' +
                "Intensity is " + intensity + "% " +'\n' +
                "Duration is " + duration + " mins "+ '\n' +
                repetitions + " Repetitions" +'\n' +
                sets + " Sets " +'\n'+'\n';
    }
}