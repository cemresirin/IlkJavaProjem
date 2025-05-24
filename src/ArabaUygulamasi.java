class Araba {

        String marka;
        String model;
        int hiz;

        public void bilgileriGoster() {
            System.out.println("Marka: " + marka);
            System.out.println("Model: " + model);
            System.out.println("Hız: " + hiz + " km/s");
        }
    }
    class ArabaUygulamasi {
        public static void main(String[] args) {

            Araba benimArabam = new Araba();

            benimArabam.marka = "Renault";
            benimArabam.model = "Megane";
            benimArabam.hiz = 220;

            benimArabam.bilgileriGoster();
        }
    }

