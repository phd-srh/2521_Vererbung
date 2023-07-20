public class Main {
    public static void main(String[] args) {
        Karte[] stapel = new Karte[20];

        stapel[0] = new Karte(8, "grün");

        // Upcast, jede Aussetzkarte ist auch eine Karte
        stapel[1] = new Aussetzkarte("blau");

        for (Karte karte : stapel) {
            if (karte != null) {
                if (karte instanceof Aussetzkarte) {
                    System.out.println("Aussetzkarte!");
                }
                else {
                    System.out.println("Normale Karte");
                }
                karte.ausspielen();
            }
        }

        Aussetzkarte a = (Aussetzkarte)stapel[1]; // Downcast, GEFÄHRLICH!!
        a.aussetzen();
    }
}
