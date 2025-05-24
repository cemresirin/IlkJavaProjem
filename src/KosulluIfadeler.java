import java.util.Scanner;

public class KosulluIfadeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı girin ");
        int sayi = input.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Sayı çifttir.");
        } else {
            System.out.println("Sayı tektir.");
        }
        System.out.println("Bir not girin (0-100): ");
        int not = input.nextInt();

        switch (not / 10) {
            case 10:
            case 9:
                System.out.println("Harf notu: A");
                break;
            case 8:
                System.out.println("Harf notu B");
                break;
            case 7:
                System.out.println("Harf notu C");
                break;
            case 6:
                System.out.println("Harf notu D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Harf notu F");
                break;
            default:
                System.out.println("Yanlış sayı girdiniz.");

        }

    }
}


