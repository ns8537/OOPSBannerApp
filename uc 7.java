import java.util.HashMap;
import java.util.Map;

public class CharacterPatternMap {

    private Map<Character, String[]> patternMap;

    // Constructor
    public CharacterPatternMap() {
        patternMap = new HashMap<>();
        initializePatterns();
    }

    // Initialize ASCII Patterns
    private void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Getter
    public String[] getPattern(char ch) {
        return patternMap.get(Character.toUpperCase(ch));
    }
}