import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);

        Maths maths = new Maths();
        System.out.println("Mathes: " + maths.add(numbers));

        Animal cat = new Animal();
        Animal dog = new Animal();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        System.out.println(animals);

        //Arrays
        String[] names = {"Wendi", "Ana", "Zoe", "Noori", "Roger", "George"};
        //System.out.println(names);

        names[1] = "Ana";
        //System.out.println(Array.toString(names));

        int legthOfNames = names.length;
        int indexOfLastName = legthOfNames - 1;

        //System.out.println(names[indexOfLastName]);

        String[] exampel = new String[2];
        //System.out.println("Exampel: " + exampel[0]);

        //int[] numbers = new int[3];
        /*numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;*/

        /*System.out.println("Plats 1: " + numbers[0]);
        System.out.println("Plats 2: " + numbers[1]);
        System.out.println("Plats 3: " + numbers[2]);*/

        //numbers[3] = 4;

        // kommer vara 4 efter att jag har satt ett värde:
        //System.out.println("Plats 4: "+ numbers[3]);

        // vi kan förändra alla värde - både de som är satta och de som inte är satta ännu.
       //numbers[0] = 77;
        //System.out.println("Plats 1: " + numbers[0]);

        String noori = names[3];
        //System.out.println(noori);

        String george = names[5];
        //System.out.println(george);

        /*int[] numbers = {1,2,3,};
        System.out.println(numbers);*/

        /*System.out.println(names);
        System.out.println(Arrays.toString(names));*/

        String name = "Wendi";
        //System.out.println(name);

        //Deklarera en ArraysLista som kommer innehålla typen String
        /*ArrayList<String> familynames1;
        familyNames1 = new Arraylist<>();*/

        //Initiera ArraysListan
        ArrayList<String> familyNames = new ArrayList<>();
        familyNames.add("Wendi"); // index 0
        familyNames.add("Ana"); // index 1
        familyNames.add("Zoe"); // index 2
        familyNames.add("Noori"); // index 3
        familyNames.add("Roger"); // index 4
        familyNames.add("George"); // index 5
        familyNames.add("Roger1"); // index 6

        /*int roger1 = familyNames.indexOf("Roger");
        System.out.println(roger1);*/

        /*System.out.println(familyNames);
        familyNames.set(1, "Ana" );*/

        /*System.out.println("Efter ändring: " + familyNames);*/

        /*int size = familyNames.size();
        System.out.println("Störlek: " + size);
        int indexOfLastElementInfamilyNemes = size - 1; */

        //Ta bort sista index i ArraysListen
        /*familyNames.remove(indexOfLastElementInfamilyNames);
        System.out.println("Störlek efter remove; " + familyNames.size());
        System.out.println("Efter remove: " + familyNames);*/

        /*familyNames.remove("George");
        System.out.println("Ta bort George: " + familyNames);*/

        //String lastNameInList = familyNames.get(indexOfLastElementInFamilyNames);
        //System.out.println(lastNameInList);

        //Rekommenderar INTE
        /*ArrayList mixed = new ArrayList();
        mixed.add("Wendi");
        mixed.add(3);
        mixed.add(true);
        System.out.println(mixed);*/


    }
}
