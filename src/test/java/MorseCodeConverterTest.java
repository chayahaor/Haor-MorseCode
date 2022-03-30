import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest {

    @Test
    public void toEnglish() {
        //given
        MorseCodeConverter convert = new MorseCodeConverter();
        //when
        String morse = ".... . .-.. .-.. ---";
        //then
        assertEquals("h e l l o", convert.toEnglish(morse));
    }

    @Test
    public void toMorse() {
        //given
        MorseCodeConverter convert = new MorseCodeConverter();
        //when
        String english = "hello";
        //then
        assertEquals(".... . .-.. .-.. ---", convert.toMorse(english));

    }
}