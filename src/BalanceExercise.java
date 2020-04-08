public class BalanceExercise extends Exercise{
    String equipment;

    public BalanceExercise(int intensity, int duration, int repetitions, int sets, String equipment) {
        super(intensity, duration, repetitions, sets);
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "For this balance exercise you need "+ equipment + '\n' +
                "Intensity is " + intensity + "% " +'\n' +
                "Duration is " + duration + " mins "+ '\n' +
                repetitions + " Repetitions" +'\n' +
                sets + " Sets " +'\n'+'\n';
    }
}
