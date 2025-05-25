public class EncapsulationUygulamasi {
    static class Kisi {
        private String isim;

        public String getIsim() {
            return isim;
        }
        public void setIsim(String isim) {
            this.isim = isim;
        }
    }
    public static void main(String[] args) {
        Kisi kisi = new Kisi();
        kisi.setIsim("Cemre");
        System.out.println("İsim: " + kisi.getIsim());
    }
}
