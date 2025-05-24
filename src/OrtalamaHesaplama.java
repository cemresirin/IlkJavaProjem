import java.util.Scanner;

public class OrtalamaHesaplama {

    public static void main(String[] args) {

        int fizik, kimya, biyoloji, resim, muzik;
        double ortalama = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Fizik notunu giriniz :");
        fizik = scan.nextInt();
        System.out.print("\n Kimya notunu giriniz : ");
        kimya = scan.nextInt();
        System.out.print("\n Biyoloji notunu giriniz : ");
        biyoloji = scan.nextInt();
        System.out.print("\n Resim notunu giriniz : ");
        resim = scan.nextInt();
        System.out.print("\n Müzik notunu giriniz : ");
        muzik = scan.nextInt();
        ortalama = (fizik + kimya + biyoloji + resim + muzik) / 5;
        if (ortalama < 55) {
            System.out.println("Sınıfta kaldınız");
        } else {
            System.out.println("Sınıfı geçtiniz ");
        }
        System.out.println("Sınıf Ortalamanız : " + ortalama );
        }
    }
