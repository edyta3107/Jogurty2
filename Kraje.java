public enum Kraje implements PodrozeInterface {


    Egipt("samolot", 2000.00),
    Turcja("samolot", 2500.00),
    Turcja1("samochod", 1500.00),
    Grecja("samolot", 3000.00),
    Grecja1("samochod", 2500.00),
    Norwegia("samolot", 3000.00),
    ;


    public double kosztWycieczki;
    public String rodzajTransportu;

    public double getKosztWycieczki() {
        return kosztWycieczki;}

    private Kraje(String rodzajTransportu, double kosztWycieczki) {
        this.kosztWycieczki = kosztWycieczki;
        this.rodzajTransportu = rodzajTransportu;


    }

    public String getRodzajTransportu() {
        return rodzajTransportu;
    }

    @Override
    public String toString() {
        return super.toString() + "-- " +
                "rodzaj Transportu ='" + rodzajTransportu + '\'' +
                ", koszt Wycieczki =" + kosztWycieczki
                ;
    }


    @Override
    public double oblicz(double a, double b) {
        return 0;
    }

}
















