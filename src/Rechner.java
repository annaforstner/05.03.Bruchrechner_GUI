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

    int zahlOben1 = zähler1 * nenner2;
    int zahlOben2 = zähler2 * nenner1;
    int zahlUnten = nenner1 * nenner2;

    public int nennerAddSUb(){
        return zahlUnten;
    }
    public int zählerAdd(){
        return zahlOben1 + zahlOben2;
    }
    public int zählerSub(){
        return zahlOben1 - zahlOben2;
    }

    public int zählerMul(){
        return zähler1 * zähler2;
    }
    public int nennerMul(){
        return nenner1 * nenner2;
    }
    public int zählerDiv(){
        return zähler1 * nenner2;
    }

    public int nennerDiv(){
        return nenner1 + zähler2;
    }

}
