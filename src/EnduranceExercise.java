public class EnduranceExercise extends Exercise{
    String equipment;

    public EnduranceExercise(int intensity, int duration, int repetitions, int sets, String equipment) {
        super(intensity, duration, repetitions, sets);
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "For this endurance exercise you need "+ equipment + '\n' +
                "Intensity is " + intensity + "% " +'\n' +
                "Duration is " + duration + " mins "+ '\n' +
                repetitions + " Repetitions" +'\n' +
                sets + " Sets " +'\n'+'\n';
    }
}