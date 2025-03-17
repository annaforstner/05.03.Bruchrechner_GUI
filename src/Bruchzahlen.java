import javax.swing.*;

public class Bruchzahlen {
    private int zahl1;
    private int zahl2;
    private int zahl3;
    private int zahl4;
    private Rechner calc;

    public Bruchzahlen(int zahl1, int zahl2, int zahl3, int zahl4) {
        if (zahl2 == 0 || zahl4 == 0) { JOptionPane.showMessageDialog(null,"Nenner darf nicht null sein.", "Fehler", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Nenner darf nicht null sein.");}
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
        this.zahl3 = zahl3;
        this.zahl4 = zahl4;

        // Initialisierung nach der Zuweisung
        this.calc = new Rechner(zahl1, zahl2, zahl3, zahl4);

    }

    public int getZahl1() {
        return zahl1;
    }

    public void setZahl1(int zahl1) {
        this.zahl1 = zahl1;
    }

    public int getZahl2() {
        return zahl2;
    }

    public void setZahl2(int zahl2) {
        if (zahl2 == 0) {
            throw new IllegalArgumentException("Nenner darf nicht null sein.");
        }
        this.zahl2 = zahl2;
    }

    public int getZahl3() {
        return zahl3;
    }

    public void setZahl3(int zahl3) {
        this.zahl3 = zahl3;
    }

    public int getZahl4() {
        return zahl4;
    }

    public void setZahl4(int zahl4) {
        if (zahl4 == 0) {
            throw new IllegalArgumentException("Nenner darf nicht null sein.");
        }
        this.zahl4 = zahl4;
    }

    public Rechner getCalc(){
        return calc;
    }
}
