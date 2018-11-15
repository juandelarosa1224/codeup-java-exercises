import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] person = new Person[3];

        person[0] = new Person("Max");
        person[1] = new Person("Tim");
        person[2] = new Person("Tony");

        person = addPerson(person, new Person("Rick"));
//        System.out.println(person);
        for (Person p : person) {
            System.out.println(p.getName());
        }
    }

    public static Person[] addPerson(Person[] oldArray, Person newPerson) {
        Person[] newArray = new Person[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = newPerson;
        return newArray;
    }
}


//  person[] morePeople = addPerson(people, new Person("jr");
//  system.out.println(Arrays.toString(morePeople));
//
//  public static Person[] addPerson(person[] personArr, Person p) {
//      Person[] personCopy = Arrays.copyOf(personArr, personArr.length + 1)
//
//