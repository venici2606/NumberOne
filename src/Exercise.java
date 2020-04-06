public abstract class Exercise {
    int intensity;
    int duration;
    int repetitions;
    int sets;


    abstract String Method();

    public Exercise(int intensity, int duration, int repetitions, int sets) {
        this.intensity = intensity;
        this.duration = duration;
        this.repetitions = repetitions;
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "exercise " + '\n' +
                "Intensity is " + intensity + "% " +'\n' +
                "Duration is " + duration + " mins "+ '\n' +
                repetitions + " Repetitions" +'\n' +
                sets + " Sets " +'\n'+'\n';
    }
}
