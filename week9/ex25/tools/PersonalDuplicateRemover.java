package week9.ex25.tools;

import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private int amount;
    private Set<String> uniqueCharacterStrings = new HashSet<String>();


    @Override
    public void add(String characterString) {
        if (uniqueCharacterStrings.contains(characterString)) {
            amount++;
        }
        this.uniqueCharacterStrings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return amount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueCharacterStrings;
    }

    @Override
    public void empty() {
        uniqueCharacterStrings.clear();
        amount = 0;
    }
}
