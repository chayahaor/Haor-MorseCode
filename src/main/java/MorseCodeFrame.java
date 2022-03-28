import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MorseCodeFrame extends JFrame {

    private JLabel lblEnterMorse;
    private JLabel lblEnterEnglish;
    private JTextArea taMorseInput;
    private JTextArea taEnglishInput;
    private JButton btnTranslateMorse;
    private JButton btnTranslateEnglish;
    JPanel verticalPanel;
    private final MorsePresenter presenter;

    public MorseCodeFrame() {
        setTitle("Morse Code Translator");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MorseCodeConverter converter = new MorseCodeConverter();

        presenter = new MorsePresenter(this, converter);

        setLayout(new FlowLayout());
        verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        add(verticalPanel);

        lblEnterMorse = new JLabel();
        lblEnterMorse.setText("Please enter Morse");
        verticalPanel.add(lblEnterMorse);
        taMorseInput = new JTextArea();
        verticalPanel.add(taMorseInput);


        lblEnterEnglish = new JLabel();
        lblEnterEnglish.setText("Please enter English");
        verticalPanel.add(lblEnterEnglish);
        taEnglishInput = new JTextArea();
        verticalPanel.add(taEnglishInput);

        btnTranslateMorse = new JButton();
        verticalPanel.add(btnTranslateMorse);
        btnTranslateMorse.setText("Translate to English");
        btnTranslateMorse.addActionListener(this::btnTranslateMorse_clicked);

        btnTranslateEnglish = new JButton();
        verticalPanel.add(btnTranslateEnglish);
        btnTranslateEnglish.setText("Translate to Morse");
        btnTranslateEnglish.addActionListener(this::btnTranslateEnglish_clicked);
    }

    public void btnTranslateMorse_clicked(ActionEvent event) {
        String input = taMorseInput.getText();
        presenter.convertToEnglish(input);
    }

    public void btnTranslateEnglish_clicked(ActionEvent event) {
        String input = taEnglishInput.getText();
        presenter.convertToMorse(input);
    }


    public void setTaMorseInput(String setText) {
        taMorseInput.setText(setText);
    }

    public void setTaEnglishInput(String setText) {
        taEnglishInput.setText(setText);
    }

    public static void main(String[] args) {
        JFrame frame = new MorseCodeFrame();
        frame.setVisible(true);
    }
}
