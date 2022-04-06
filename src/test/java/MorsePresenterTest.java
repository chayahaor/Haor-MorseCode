import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class MorsePresenterTest {

    MorseCodeFrame view = mock(MorseCodeFrame.class);
    MorseCodeConverter model = mock(MorseCodeConverter.class);
    MorsePresenter presenter = new MorsePresenter(view, model);

    @Test
    public void convertEnglish() {
        //given
        String toConvert = ".... . .-.. .-.. ---";
        doReturn("h e l l o")
                .when(model)
                .toEnglish(toConvert);


        //when
        presenter.convertToEnglish(toConvert);

        //then
        verify(model).toEnglish(toConvert);

    }

    @Test
    public void convertMorse() {
        //given
        String toConvert = "hello";

        //when
        presenter.convertToMorse(toConvert);

        //then
        verify(model).toMorse(toConvert);

    }

}
