import java.util.Scanner;

public class Donguler {
public static void main (String[] args) {

    System.out.println("1'den 100'e kadar çift sayılar:");
    for (int i = 1; i <=100; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
  System.out.println("----------------");

    Scanner scanner = new Scanner(System.in);
    String sifre;

   do {
       System.out.print("Şifreyi girin: ");
       sifre = scanner.nextLine();
   }   while (!sifre.equals("1905"));

   System.out.println("Şifre doğru , giriş başarılı.");

   scanner.close();
}
}
