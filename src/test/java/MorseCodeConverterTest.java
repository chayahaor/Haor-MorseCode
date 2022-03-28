import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest {

    @Test
    public void testFillMorse() {
        //given
        MorseCodeConverter convert = new MorseCodeConverter();

        //when
        convert.fillMorse();

        //then
        //TODO: how to test this?
    }

    @Test
    public void testToEnglish() {
        //given
        MorseCodeConverter convert = new MorseCodeConverter();
        //when
        String morse = ".... . .-.. .-.. ---";
        //then
        assertEquals("h e l l o", convert.toEnglish(morse));
    }

    @Test
    public void testToMorse() {
        //given
        MorseCodeConverter convert = new MorseCodeConverter();
        //when
        String english = "hello";
        //then
        assertEquals(".... . .-.. .-.. --- ", convert.toMorse(english));

    }
}