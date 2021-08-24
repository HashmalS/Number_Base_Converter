class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        String currentName;
        int currentAge;

        currentAge = p1.age;
        currentName = p1.name;
        p1.age = p2.age;
        p1.name = p2.name;

        p2.age = currentAge;
        p2.name = currentName;
    }
}