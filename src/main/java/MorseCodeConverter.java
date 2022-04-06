import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {
    private Map<String, String> mapToMorse = new HashMap<>();
    private Map<String, String> mapToEnglish = new HashMap<>();

    public MorseCodeConverter() {
        fillMapToMorse();
        fillMapToEnglish();
    }

    private void fillMapToMorse() {
        mapToMorse.put("a", ".-");
        mapToMorse.put("b", "-...");
        mapToMorse.put("c", "-.-.");
        mapToMorse.put("d", "-..");
        mapToMorse.put("e", ".");
        mapToMorse.put("f", "..-.");
        mapToMorse.put("g", "--.");
        mapToMorse.put("h", "....");
        mapToMorse.put("i", "..");
        mapToMorse.put("j", ".---");
        mapToMorse.put("k", "-.-");
        mapToMorse.put("l", ".-..");
        mapToMorse.put("m", "--");
        mapToMorse.put("n", "-.");
        mapToMorse.put("o", "---");
        mapToMorse.put("p", ".--.");
        mapToMorse.put("q", "--.-");
        mapToMorse.put("r", ".-.");
        mapToMorse.put("s", "...");
        mapToMorse.put("t", "-");
        mapToMorse.put("u", "..-");
        mapToMorse.put("v", "...-");
        mapToMorse.put("w", ".--");
        mapToMorse.put("x", "-..-");
        mapToMorse.put("y", "-.--");
        mapToMorse.put("z", "--..");
        mapToMorse.put("0", "-----");
        mapToMorse.put("1", ".----");
        mapToMorse.put("2", "..---");
        mapToMorse.put("3", "...--");
        mapToMorse.put("4", "....-");
        mapToMorse.put("5", ".....");
        mapToMorse.put("6", "-....");
        mapToMorse.put("7", "--...");
        mapToMorse.put("8", "---..");
        mapToMorse.put("9", "----.");
    }

    private void fillMapToEnglish() {
        mapToEnglish.put(".-", "a");
        mapToEnglish.put("-...", "b");
        mapToEnglish.put("-.-.", "c");
        mapToEnglish.put("-..", "d");
        mapToEnglish.put(".", "e");
        mapToEnglish.put("..-.", "f");
        mapToEnglish.put("--.", "g");
        mapToEnglish.put("....", "h");
        mapToEnglish.put("..", "i");
        mapToEnglish.put(".---", "j");
        mapToEnglish.put("-.-", "k");
        mapToEnglish.put(".-..", "l");
        mapToEnglish.put("--", "m");
        mapToEnglish.put("-.", "n");
        mapToEnglish.put("---", "o");
        mapToEnglish.put(".--.", "p");
        mapToEnglish.put("--.-", "q");
        mapToEnglish.put(".-.", "r");
        mapToEnglish.put("...", "s");
        mapToEnglish.put("-", "t");
        mapToEnglish.put("..-", "u");
        mapToEnglish.put("...-", "v");
        mapToEnglish.put(".--", "w");
        mapToEnglish.put("-..-", "x");
        mapToEnglish.put("-.--", "y");
        mapToEnglish.put("--..", "z");
        mapToEnglish.put("-----", "0");
        mapToEnglish.put(".----", "1");
        mapToEnglish.put("..---", "2");
        mapToEnglish.put("...--", "3");
        mapToEnglish.put("....-", "4");
        mapToEnglish.put(".....", "5");
        mapToEnglish.put("-....", "6");
        mapToEnglish.put("--...", "7");
        mapToEnglish.put("---..", "8");
        mapToEnglish.put("----.", "9");
    }

    public String toMorse(String english) {
        english = english.toLowerCase();
        StringBuilder sb = new StringBuilder();
        String[] inpChar = english.split("");
        for (String letter : inpChar)
        {
            if (mapToMorse.containsKey(letter))
            {
                sb.append(mapToMorse.get(letter));
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public String toEnglish(String morse) {
        StringBuilder sb = new StringBuilder();
        String[] inputLetters = morse.split(" ");
        for (String inputLetter : inputLetters)
        {
            if (mapToEnglish.containsKey(inputLetter))
            {
                sb.append(mapToEnglish.get(inputLetter));
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}