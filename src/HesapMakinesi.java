import java.util.Scanner;
public class HesapMakinesi {

public static void topla(int a,int b ) {
    System.out.println("Toplama: " + (a+b));
}
public static void cıkar(int a,int b) {
    System.out.println("Çıkarma: " + (a-b));
}
public static void carp(int a,int b) {
    System.out.println("Çarpma: " + (a*b));
}
public static void bol(int a,int b) {
    if (b ==0) {
     System.out.println("İkinci sayı 0 olamaz!");
    }else{
        System.out.println("Bölme: "+((double) a/b));
    }
}
public static void main(String[] args ) {
    Scanner scan = new Scanner(System.in);

    System.out.print("İlk sayıyı giriniz : ");
    int sayi1 = scan.nextInt();

    System.out.print("İkinci sayıyı giriniz: ");
    int sayi2 = scan.nextInt();

    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
    System.out.println("1-Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
    System.out.print("Seçiminiz: ");
    int secim = scan.nextInt();

    switch (secim) {
        case 1:
            topla(sayi1, sayi2);
            break;
        case 2:
            cıkar(sayi1, sayi2);
            break;
        case 3:
            carp(sayi1, sayi2);
            break;
        case 4:
            bol(sayi1, sayi2);
            break;
        default:
            System.out.println("Geçersiz seçim!");
    }
    scan.close();
}
}





