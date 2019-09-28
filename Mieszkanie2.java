public class Mieszkanie2 {

    private String miasto;
    private String dzielnica;
    private String ulica;
    private int pokoje;
    private float powierzchnia;
    private boolean piwnica;
    private int cena;
    public Mieszkanie2(String miasto,String dzielnica, String ulica, int pokoje, float powierzchnia,boolean piwnica, int cena ){
        this.miasto = miasto;
        this.dzielnica = dzielnica;
        this.ulica = ulica;
        this.pokoje = pokoje;
        this.powierzchnia =powierzchnia;
        this.piwnica = piwnica;
        this.cena = cena;
    }
    public void setPiwnica(boolean piwnica){
        this.piwnica = piwnica;
    }
    public void setMiasto(String miasto){this.miasto= miasto; }
    public void setDzielnica(String dzielnica){this.dzielnica = dzielnica;}
    public void setUlica(String ulica){this.ulica=ulica;}
    public void setPokoje(int pokoje){this.pokoje = pokoje;}
    public void setPowierzchnia(float powierzchnia){this.powierzchnia = powierzchnia;}
    public int getCena(){return cena ;}
    public String getMiasto(){return miasto;}
    public boolean getpiwnica(){return piwnica;}


    public void setCena(int cena){this.cena = cena;}

    public String toString (){
        return "Mieszkanie{ " +
                "miasto" + miasto +
                "dzielnica"+dzielnica +
                 "ulica "  + ulica +
                 "pokoje" + pokoje +
                 "powierzchnia" +  powierzchnia +
                "piwnica" + piwnica +
                "cena" + cena +"}";

    }

    public String getUlica() {return ulica;
    }
}
