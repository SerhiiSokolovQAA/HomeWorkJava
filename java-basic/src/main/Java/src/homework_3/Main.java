package homework_3;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});

        Human mother = new Human("Jane", "Karleone", 1975);
        Human father = new Human("Vito", "Karleone", 1973);

        Family family = new Family(mother, father);
        family.setPet(dog);

        Human child = new Human("Michael", "Karleone", 2000, 90, dog, mother, father, new String[][] {{"Monday", "Soccer"}});
        family.addChild(child);

        System.out.println(child);
        child.greetPet();
        child.describePet();

        dog.eat();
        dog.respond();
        dog.foul();

        System.out.println(family);
    }
}