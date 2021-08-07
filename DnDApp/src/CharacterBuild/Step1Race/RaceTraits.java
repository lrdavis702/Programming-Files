// #Description - Constructor class for the race traits
package CharacterBuild.Step1Race;

import java.util.ArrayList;

public class RaceTraits {
    private String name;
    private ArrayList<Integer> abilityScoreMod;
    private int age;
    private ArrayList<String> alignmentChoices;
    private String size;
    private int speed;
    private ArrayList<String> languages;
    private String subrace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getAbilityScoreMod() {
        return abilityScoreMod;
    }

    public void setAbilityScoreMod(ArrayList<Integer> abilityScoreMod) {
        this.abilityScoreMod = abilityScoreMod;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getAlignmentChoices() {
        return alignmentChoices;
    }

    public void setAlignmentChoices(ArrayList<String> alignmentChoices) {
        this.alignmentChoices = alignmentChoices;
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

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public String getSubrace() {
        return subrace;
    }

    public void setSubrace(String subrace) {
        this.subrace = subrace;
    }
}
