public abstract class Exercise implements Comparable<Exercise> {
        int intensity;
        int duration;
        int repetitions;
        int sets;


        public Exercise(int intensity, int duration, int repetitions, int sets) {
<<<<<<< HEAD
            if (intensity <= 0 || intensity >= 100) {
                throw new IllegalArgumentException("Invalid intensity value");
            }

=======
            // the intensity can't be negative, 0, 100 or higher than 100
            if (intensity <= 0 || intensity >= 100) {
                    throw new IllegalArgumentException("Invalid intensity value");
            }
            
>>>>>>> e932804d48d70719daa79b11faa347769af5783a
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
        //TODO hva gjør denne?
        @Override
        public int compareTo(Exercise o) {
            return this.getIntensity()-o.getIntensity();
        }
        }


