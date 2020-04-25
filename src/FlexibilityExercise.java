public class FlexibilityExercise extends Exercise{
    String requirement;

    public FlexibilityExercise(int intensity, int duration, int repetitions, int sets, String requirement) {
        super(intensity, duration, repetitions, sets);
        this.requirement = requirement;
    }

    @Override
    public String toString() {
        return "For this flexibility exercise you need to "+ requirement + '\n' +
                "Intensity is " + intensity + "% " +'\n' +
                "Duration is " + duration + " mins "+ '\n' +
                repetitions + " Repetitions" +'\n' +
                sets + " Sets " +'\n'+'\n';
    }

}