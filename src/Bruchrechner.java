import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class Bruchrechner extends JFrame{
    private JPanel anzeigen;
    private JTextField zähler1;
    private JTextField nenner1;
    private JTextField zähler2;
    private JTextField nenner2;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnDiv;
    private JButton btnMul;
    private JButton btnErg;
    private JButton btnClear;
    private JLabel zähler1Txt;
    private JLabel nenner1Txt;
    private JLabel label1;
    private JLabel zähler2Txt;
    private JLabel nenner2Txt;
    private JLabel label2;
    private JLabel ergTxt;
    private JTextArea ergebnisField;

    public Bruchrechner(){
        setTitle("Bruchrechner");
        setContentPane(anzeigen);
        pack(); // Größe basierend auf den Inhalt anpassen
        setLocationRelativeTo(null); // setzt es in die Bildschirmmitte
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        try {
            int zahl1 = parseInt(zähler1.getText().trim());
            int zahl2 = parseInt(nenner1.getText().trim());
            int zahl3 = parseInt(zähler2.getText().trim());
            int zahl4 = parseInt(nenner2.getText().trim());

        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Fehler: Ungültige Eingabe!");
        }
        Bruchzahlen bruch = new Bruchzahlen(zahl1, zahl2, zahl3, zahl4);



        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });


        btnErg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String zahler = "3";
                String nenner = "4";
                String bruch = zahler+"\n---\n"+ nenner;
                ergebnisField.setText(bruch);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zähler1.setText("");
                nenner1.setText("");
                zähler2.setText("");
                nenner2.setText("");
                ergebnisField.setText("");
            }
        });

    }

    public static void main(String[] args) {
        new Bruchrechner();
    }
}
