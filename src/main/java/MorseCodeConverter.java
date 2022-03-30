import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {


    void fillMapToMorse(Map<String, String> mapToMorse) {
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

    void fillMapToEnglish(Map<String, String> mapToMorse) {
        mapToMorse.put(".-", "a");
        mapToMorse.put("-...", "b");
        mapToMorse.put("-.-.", "c");
        mapToMorse.put("-..", "d");
        mapToMorse.put(".", "e");
        mapToMorse.put("..-.", "f");
        mapToMorse.put("--.", "g");
        mapToMorse.put("....", "h");
        mapToMorse.put("..", "i");
        mapToMorse.put(".---", "j");
        mapToMorse.put("-.-", "k");
        mapToMorse.put(".-..", "l");
        mapToMorse.put("--", "m");
        mapToMorse.put("-.", "n");
        mapToMorse.put("---", "o");
        mapToMorse.put(".--.", "p");
        mapToMorse.put("--.-", "q");
        mapToMorse.put(".-.", "r");
        mapToMorse.put("...", "s");
        mapToMorse.put("-", "t");
        mapToMorse.put("..-", "u");
        mapToMorse.put("...-", "v");
        mapToMorse.put(".--", "w");
        mapToMorse.put("-..-", "x");
        mapToMorse.put("-.--", "y");
        mapToMorse.put("--..", "z");
        mapToMorse.put("-----", "0");
        mapToMorse.put(".----", "1");
        mapToMorse.put("..---", "2");
        mapToMorse.put("...--", "3");
        mapToMorse.put("....-", "4");
        mapToMorse.put(".....", "5");
        mapToMorse.put("-....", "6");
        mapToMorse.put("--...", "7");
        mapToMorse.put("---..", "8");
        mapToMorse.put("----.", "9");
    }

    String toMorse(String english) {
        Map<String, String> mapToMorse = new HashMap<>();
        fillMapToMorse(mapToMorse);
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

    String toEnglish(String morse) {
        Map<String, String> mapToEnglish = new HashMap<>();
        fillMapToEnglish(mapToEnglish);
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