import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private Rechner rechner; // Instanzvariable für den Rechner
    private int ergebnisZähler;
    private int ergebnisNenner;

    public Bruchrechner(){
        setTitle("Bruchrechner");
        setContentPane(anzeigen);
        pack(); // Größe basierend auf den Inhalt anpassen
        setLocationRelativeTo(null); // setzt es in die Bildschirmmitte
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Event-Listener für Addition
        btnAdd.addActionListener(e -> berechne("+"));

        // Event-Listener für Subtraktion
        btnSub.addActionListener(e -> berechne("-"));

        // Event-Listener für Multiplikation
        btnMul.addActionListener(e -> berechne("*"));

        // Event-Listener für Division
        btnDiv.addActionListener(e -> berechne("/"));

        // Ergebnis-Anzeige
        btnErg.addActionListener(e -> {
            if (rechner != null) {
                String bruch = ergebnisZähler + "\n---\n" + ergebnisNenner;
                ergebnisField.setText(bruch);
            } else {
                ergebnisField.setText("Kein Ergebnis berechnet!");
            }
        });

        // Felder leeren
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

    private void berechne(String operator) {
        try {
            int zahl1 = Integer.parseInt(zähler1.getText().trim());
            int zahl2 = Integer.parseInt(nenner1.getText().trim());
            int zahl3 = Integer.parseInt(zähler2.getText().trim());
            int zahl4 = Integer.parseInt(nenner2.getText().trim());

            if (zahl2 == 0 || zahl4 == 0) {
                JOptionPane.showMessageDialog(this, "Nenner darf nicht 0 sein!", "Fehler", JOptionPane.ERROR_MESSAGE);
                return;
            }

            rechner = new Rechner(zahl1, zahl3, zahl2, zahl4);

            switch (operator) {
                case "+":
                    ergebnisZähler = rechner.getZählerAddition();
                    ergebnisNenner = rechner.getNennerAddition();
                    break;
                case "-":
                    ergebnisZähler = rechner.getZählerSubtraktion();
                    ergebnisNenner = rechner.getNennerAddition(); // Nenner bleibt gleich
                    break;
                case "*":
                    ergebnisZähler = rechner.getZählerMultiplikation();
                    ergebnisNenner = rechner.getNennerMultiplikation();
                    break;
                case "/":
                    ergebnisZähler = rechner.getZählerDivision();
                    ergebnisNenner = rechner.getNennerDivision();
                    break;
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Fehler: Ungültige Eingabe!", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Bruchrechner();
    }
}
