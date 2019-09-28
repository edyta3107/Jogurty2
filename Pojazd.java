public class Pojazd {
    private  Integer id;
    private  String marka;
    private Integer poduszkiPowietrzne;
    private Integer predkoscMax;
    private String rejestracja;

    public static class Builder{
        private  Integer id = null;
        private  String marka = null;
        private Integer poduszkiPowietrzne = null;
        private Integer predkoscMax= null;
        private String rejestracja = null;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder marka(String marka){
            this.marka = marka;
            return this;
        }
        public Builder poduszkiPowietrzne(Integer poduszkiPowietrzne){
            this.poduszkiPowietrzne = poduszkiPowietrzne;
            return this;
        }
        public Builder predkoscMax (Integer predkoscMax){
            this.predkoscMax = predkoscMax;
            return this;
        }
        public Builder rejestracja (String rejestracja){
            this.rejestracja=rejestracja;
            return this;

        }
        private Pojazd build(){
            return  new Pojazd( this);
        }}
        private Pojazd(Builder builder){}


}
