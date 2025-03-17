public class Rechner {
    private int zähler1;
    private int zähler2;
    private int nenner1;
    private int nenner2;

    public Rechner(int zähler1, int zähler2, int nenner1, int nenner2) {
        this.zähler1 = zähler1;
        this.zähler2 = zähler2;
        this.nenner1 = nenner1;
        this.nenner2 = nenner2;
    }

    // Addition: (a/b) + (c/d) = (a*d + c*b) / (b*d)
    public int getNennerAddition() {
        return nenner1 * nenner2;
    }

    public int getZählerAddition() {
        return (zähler1 * nenner2) + (zähler2 * nenner1);
    }

    // Subtraktion: (a/b) - (c/d) = (a*d - c*b) / (b*d)
    public int getZählerSubtraktion() {
        return (zähler1 * nenner2) - (zähler2 * nenner1);
    }

    // Multiplikation: (a/b) * (c/d) = (a*c) / (b*d)
    public int getZählerMultiplikation() {
        return zähler1 * zähler2;
    }

    public int getNennerMultiplikation() {
        return nenner1 * nenner2;
    }

    // Division: (a/b) ÷ (c/d) = (a*d) / (b*c)
    public int getZählerDivision() {
        return zähler1 * nenner2;
    }

    public int getNennerDivision() {
        return nenner1 * zähler2;
    }
}
