public abstract class Exercise {
    int intensity;
    int duration;
    int repetitions;
    int sets;


    abstract void Method();

    public Exercise(int intensity, int duration, int repetitions, int sets) {
        this.intensity = intensity;
        this.duration = duration;
        this.repetitions = repetitions;
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "intensity=" + intensity +
                ", duration=" + duration +
                ", repetitions=" + repetitions +
                ", sets=" + sets +
                '}';
    }
}
