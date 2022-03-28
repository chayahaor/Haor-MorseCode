
public class MorsePresenter {
    MorseCodeFrame view;
    MorseCodeConverter model;

    public MorsePresenter(MorseCodeFrame view, MorseCodeConverter model) {
        this.view = view;
        this.model = model;
    }

    public void convertToEnglish(String morse) {
        view.setTaEnglishInput(model.toEnglish(morse));
    }

    public void convertToMorse(String english) {
        view.setTaMorseInput(model.toMorse(english));
    }
}
