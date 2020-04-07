import java.util.ArrayList;

public class ExerciseManager {

    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>();
        Person person1 = new Person("kettle", 40);
        personList.add(person1);

        Person person2 = new Person("yoga", 60);
        personList.add(person2);

        Person person3 = new Person("running", 70);
        personList.add(person3);

        // for-each loop to divide the array
        for (Person list : personList){
            System.out.println(list);
        }

        /*Person pers;

        pers = new Person("kettle", 40);
        pers = new Person("yoga", 60);
        pers = new Person("running", 70);

        System.out.println(pers.toString());*/


    }

}


