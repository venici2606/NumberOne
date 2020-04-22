public abstract class Exercise implements Comparable<Exercise> {
        int intensity;
        int duration;
        int repetitions;
        int sets;


        public Exercise(int intensity, int duration, int repetitions, int sets) {
            this.intensity = intensity;
            this.duration = duration;
            this.repetitions = repetitions;
            this.sets = sets;
        }

        @Override
        public String toString() {
            return "exercise \n" +
                    "Intensity is " + intensity + "% " +'\n' +
                    "Duration is " + duration + " mins "+ '\n' +
                    repetitions + " Repetitions" +'\n' +
                    sets + " Sets " +'\n'+'\n';
        }

        public int getIntensity(){

            return intensity;
        }
        @Override
        public int compareTo(Exercise o) {
            return this.getIntensity()-o.getIntensity();
        }
        }


