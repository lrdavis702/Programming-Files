package DesignPatterns.RaceFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    protected String name;
    protected String size;
    protected int speed;
    protected int age;

    public void setHpMod(int num) {
        this.hpMod += num;
    }

    protected int hpMod = 0;

    protected ArrayList traits = new ArrayList();
    protected ArrayList languages = new ArrayList();

    int[] abilityScores = new int[6];
    protected String[] abilities = new String[]{"Strength",
            "Dexterity", "Constitution", "Intelligence",
            "Wisdom", "Charisma"};

    public void setAge(int age) {
        this.age = age;
    }

    public void setAbilityScores(int elm, int num) {
        this.abilityScores[elm] += num;
    }

 //   void generator() {
//        System.out.println("Generating " + name);
//
//        System.out.println("Determining modifiers: ");
//        for (int i = 0; i < abilities.length; i++){
//            System.out.println(" " + abilities[i] ": " + getAbilityscores());
//        }
//        System.out.println("Your character is " + getAge() + " years old.");
//        System.out.println("Size: ");
//        System.out.println("Adding toppings: ");
//        for (int i = 0; i < toppings.size(); i++){
//            System.out.println(" " + toppings.get(i));
//        }
 //   }


    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                ", hpMod=" + hpMod +
                ", traits=" + traits +
                ", languages=" + languages +
                ", abilityScores=" + Arrays.toString(abilityScores) +
                ", abilities=" + Arrays.toString(abilities) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAge(int min, int max) {
        this.age = (int)((Math.random() * (max/2 - min) + 1) + min);
    }

    public ArrayList getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList languages) {
        this.languages = languages;
    }
}
