import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class DnDCharacter {
    
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligent;
    private int widdom;
    private int charisma;
    
    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligent = ability(rollDice());
        widdom = ability(rollDice());
        charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        return (int) scores.stream().sorted(Comparator.reverseOrder()).limit(3).mapToInt(Integer::intValue).sum();
    }

    List<Integer> rollDice() {
        List<Integer> dados = Arrays.asList(
                (int) Math.floor(1+6*Math.random()),
                (int) Math.floor(1+6*Math.random()),
                (int) Math.floor(1+6*Math.random()),
                (int) Math.floor(1+6*Math.random())
                );
        return dados;
    }

    int modifier(int input) {
        return (int) Math.floor((input-10)/2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligent;
    }

    int getWisdom() {
        return widdom;
    }

    int getCharisma() {
        return charisma;
    }
    
    int getHitpoints() {
        return 10+modifier(getConstitution());
    }
}
