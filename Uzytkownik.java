import model.PoszukiwanyPartner;

public class Uzytkownik {

    private boolean kobieta;
    private boolean mezczyzna;
    private int wiek;
    private int wzrost;
    private PoszukiwanyPartner poszukiwanyPartner;


    public Uzytkownik(boolean kobieta, boolean mezczyzna, int wiek, int wzrost, PoszukiwanyPartner poszukiwanyPartner) {
        this.kobieta = kobieta;
        this.mezczyzna = mezczyzna;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.poszukiwanyPartner = poszukiwanyPartner;
    }

    public boolean isKobieta() {
        return kobieta;
    }

    public void setKobieta(boolean kobieta) {
        this.kobieta = kobieta;
    }

    public boolean isMezczyzna() {
        return mezczyzna;
    }

    public void setMezczyzna(boolean mezczyzna) {
        this.mezczyzna = mezczyzna;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public PoszukiwanyPartner getPoszukiwanyPartner() {
        return poszukiwanyPartner;
    }

    public void setPoszukiwanyPartner(PoszukiwanyPartner poszukiwanyPartner) {
        this.poszukiwanyPartner = poszukiwanyPartner;
    }
}

