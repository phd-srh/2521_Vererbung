public class Karte {
    private int wert;
    private String farbe;

    public Karte(int wert, String farbe) {
        this.wert = wert;
        this.farbe = farbe;
    }

    public int getWert() {
        return wert;
    }

    public String getFarbe() {
        return farbe;
    }

    public void ziehen() {
        System.out.println("Karte wird gezogen");
    }

    public void ausspielen() {
        System.out.println("spiele " + farbe + wert);
    }
}
