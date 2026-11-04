package tom.hhs.bankproject.itlf7.model.bike;

public class Fahrrad {

    private String marke;
    private int gang;
    private double geschwindigkeit;
    private double reifengroesse;

    public void beschleunigen(double zunahme) {
        if (zunahme > 0 && this.geschwindigkeit >= 0) {
            this.geschwindigkeit += zunahme;
        }

    }

    public void bremsen(double abnahme) {
        if (abnahme <= 0 && this.geschwindigkeit >= 0) {
            this.geschwindigkeit += abnahme;
        }

    }

    public void gangWechseln(int gang) {
        if (gang > 7 || gang < 0) {
            return;
        }
        this.gang = gang;

    }

    public void setMarke(String marke) {
        if (marke == null ||marke.trim().isEmpty()) {
            return;
        }
        this.marke = marke;
    }

    public void anzeigen() {
        System.out.println("Marke: " + this.marke + " Gang: " + this.gang + " Geschwindigkeit " + this.geschwindigkeit + " Reifengroesse " + this.reifengroesse);
    }

    public double getReifengroesse() {
        return reifengroesse;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }
}

