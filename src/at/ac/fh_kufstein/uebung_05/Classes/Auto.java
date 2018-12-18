package at.ac.fh_kufstein.uebung_05.Classes;

public class Auto extends Fahrzeug{

    //ATTRIBUTE
    private boolean klimaanlage;
    private short airbags;

    //KONSTRUKTOR
    public Auto(short reifen, String farbe, short ps, short tueren, short airbags) {
        super(reifen, farbe, ps, tueren);
        this.klimaanlage=false;
        this.airbags=airbags;
    }

    //METHODEN

    @Override
    public String toString(){
        return "Mein Auto hat "+this.getPs()+" PS und fährt mit "+this.getGeschwindigkeit()+" km/h";
    }

    public void klimaanlageAn(){
        if (getKlimaanlage()==true){
            System.out.println("Klima läuft bereits");
        }
        else {
            setKlimaanlage(true);
        }
    }

    //GETTER & SETTER

    public boolean getKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
}