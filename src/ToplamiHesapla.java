import java.util.Scanner;
    public class ToplamiHesapla {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Pozitif bir sayı girin: ");
            int n = scanner.nextInt();

            int total = 0;

            for (int i = 1; i <= n; i++) {
                total += i;
            }
            System.out.println("1'den " + n + "'e kadar olan sayıların toplamı: " + total);

            scanner.close();
        }
    }

