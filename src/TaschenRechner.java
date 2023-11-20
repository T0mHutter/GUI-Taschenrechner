import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenRechner {
    private JPanel main_panel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton AddButton;
    private JButton SubButton;
    private JButton MulButton;
    private JButton DivButton;
    private JButton berechnenButton;
    private JButton eingabeLöschenButton;
    private JLabel Ergebnis;
    private JLabel Zahl1;
    private JLabel Zahl2;
    Float erg;

    Float num1;
    Float num2;
    public TaschenRechner(){
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Float.valueOf(textField1.getText());
                num2 = Float.valueOf(textField2.getText());

                erg = num1 + num2;
            }
        });
        SubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Float.valueOf(textField1.getText());
                num2 = Float.valueOf(textField2.getText());

                erg = num1 - num2;
            }
        });
        MulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Float.valueOf(textField1.getText());
                num2 = Float.valueOf(textField2.getText());

                erg = num1 * num2;
            }
        });
        DivButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Float.valueOf(textField1.getText());
                num2 = Float.valueOf(textField2.getText());

                erg = num1 / num2;
            }
        });

        eingabeLöschenButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String b = "";
                Ergebnis.setText(b);
            }
        });
        berechnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val = String.valueOf(erg);
                Ergebnis.setText(val);
            }
        });
    }

    public static void main(String[] Args) {
        JFrame frame = new JFrame("Taschenrechner");
        frame.setContentPane(new TaschenRechner().main_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
