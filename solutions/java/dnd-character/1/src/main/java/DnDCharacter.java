import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private static final int BASE_HITPOINTS = 10;
    private final Random r = new Random();

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
        hitpoints = BASE_HITPOINTS + modifier(constitution);
    }

    int ability(List<Integer> scores) {
        List<Integer> scoresCopy = new ArrayList<>(scores);
        Collections.sort(scoresCopy, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scoresCopy.get(i);
        }
        return sum;
    }

    List<Integer> rollDice() {
        List<Integer> dice = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            dice.add(r.nextInt(6) + 1);
        }
        return dice;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
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
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
