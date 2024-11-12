package homework_3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq = new Random().nextInt(101);
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hi, " + pet.getNickname());
    }

    public void describePet() {
        String cleverness = pet.getTrickLevel() > 50 ? "very cunning" : "almost not cunning";
        System.out.println("I have a " + pet.getSpecies() + ", he/she is " + pet.getAge() + " years, he/she " + cleverness);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "unknown") +
                ", father=" + (father != null ? father.name + " " + father.surname : "unknown") +
                ", pet=" + pet + ", schedule=" + Arrays.deepToString(schedule) + "}";
    }
    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(mother, human.mother) &&
                Objects.equals(father, human.father);
    }
}

