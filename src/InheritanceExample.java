public class InheritanceExample {

    static class Hayvan {
            public void sesCikar() {
                System.out.println("Hayvan bir ses çıkarıyor.");
            }
        }
        static class Kedi extends Hayvan {
            public void miyavla() {
                System.out.println("Kedi miyavlıyor.");
            }
        }
        static class Kopek extends Hayvan {
            public void havla() {
                System.out.println("Köpek havlıyor.");
            }
        }
        public static void main(String[] args) {
            Kedi kedi = new Kedi();
            kedi.sesCikar();
            kedi.miyavla();

            Kopek kopek = new Kopek();
            kopek.sesCikar();
            kopek.havla();
        }
    }

