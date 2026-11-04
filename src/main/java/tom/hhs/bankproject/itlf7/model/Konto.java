package tom.hhs.bankproject.itlf7.model;

public class Konto {

    private double saldo;
    private int kontonummer;

    public Konto() {
        this.saldo = saldo;
        this.kontonummer = (int) (Math.random() * 100000);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }


}
