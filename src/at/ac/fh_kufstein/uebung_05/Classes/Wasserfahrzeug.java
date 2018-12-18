package at.ac.fh_kufstein.uebung_05.Classes;

public class Wasserfahrzeug extends Fahrzeug{
    private double tiefgang;
    private short schrauben;
    private double ladung;

    //KONSTRUKTOR

    public Wasserfahrzeug(short reifen, String farbe, short ps, short tueren, double tiefgang, short schrauben, double ladung) {
        super(reifen, farbe, ps, tueren);
        this.tiefgang=tiefgang;
        this.schrauben=schrauben;
        this.ladung=ladung;
    }
    // METHODE FÜR LADUNG
    public void entladen() throws InterruptedException {
        setLadung(0);
        Thread.sleep(5000);
    }

    @Override
    public String toString(){
        return "Mein Wasserfahrzeug hat "+this.getPs()+" PS und einen Tiefgang von "+getTiefgang()+" m";
    }

    //GETTER & SETTER
    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }
}