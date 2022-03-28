import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {
    static Map<String, String> morseCodeMap = new HashMap<>();

    void fillMorse() {
        morseCodeMap.put("a", ".-");
        morseCodeMap.put("b", "-...");
        morseCodeMap.put("c", "-.-.");
        morseCodeMap.put("d", "-..");
        morseCodeMap.put("e", ".");
        morseCodeMap.put("f", "..-.");
        morseCodeMap.put("g", "--.");
        morseCodeMap.put("h", "....");
        morseCodeMap.put("i", "..");
        morseCodeMap.put("j", ".---");
        morseCodeMap.put("k", "-.-");
        morseCodeMap.put("l", ".-..");
        morseCodeMap.put("m", "--");
        morseCodeMap.put("n", "-.");
        morseCodeMap.put("o", "---");
        morseCodeMap.put("p", ".--.");
        morseCodeMap.put("q", "--.-");
        morseCodeMap.put("r", ".-.");
        morseCodeMap.put("s", "...");
        morseCodeMap.put("t", "-");
        morseCodeMap.put("u", "..-");
        morseCodeMap.put("v", "...-");
        morseCodeMap.put("w", ".--");
        morseCodeMap.put("x", "-..-");
        morseCodeMap.put("y", "-.--");
        morseCodeMap.put("z", "--..");
        morseCodeMap.put("0", "-----");
        morseCodeMap.put("1", ".----");
        morseCodeMap.put("2", "..---");
        morseCodeMap.put("3", "...--");
        morseCodeMap.put("4", "....-");
        morseCodeMap.put("5", ".....");
        morseCodeMap.put("6", "-....");
        morseCodeMap.put("7", "--...");
        morseCodeMap.put("8", "---..");
        morseCodeMap.put("9", "----.");
    }

    String toMorse(String english) {
        fillMorse();
        english = english.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] inpChar = english.toCharArray();
        for (char letter : inpChar)
        {
            if (morseCodeMap.get(letter+"") != null)
            {
                sb.append(morseCodeMap.get(letter + ""));
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    String toEnglish(String morse) {
        fillMorse();
        StringBuilder output = new StringBuilder();
        String[] inputLetters = morse.split(" ");
        for (String inputLetter : inputLetters)
        {
            if (morseCodeMap.containsValue(inputLetter))
            {
                output.append(morseCodeMap.get(inputLetter)); //TODO: FIX Always returns null since key/value situation
            }
        }
        return output.toString();
    }

}
