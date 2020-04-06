public class Endurance extends Exercise{
    String equipment;

    public Endurance(int intensity, int duration, int repetitions, int sets, String equipment) {
        super(intensity, duration, repetitions, sets);
        this.equipment = equipment;
    }

    @Override
    String Method() {
        String enduranceString = "This is endurance";
        return enduranceString;
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
