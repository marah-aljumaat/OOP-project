import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {
        int secim = 0, secim2 = 0;
        Scanner scan = new Scanner(System.in);

        while (secim != 3) {
            System.out.println("-----------------------------------");
            System.out.println(" 1. iki boyutlu şekil"
                    + "\n 2. üç boyutlu şekil"
                    + "\n 3. çıkış");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println(" 1. Daire\n 2. Üçgen\n 3. Dikdörtgen\n 4. Kare");
                    secim2 = scan.nextInt();
                    if (secim2 == 1) {
                        System.out.println("-----------------------------------");
                        secimDaire();
                    } else if (secim2 == 2) {
                        System.out.println("-----------------------------------");
                        secimUcgen();
                    } else if (secim2 == 3) {
                        System.out.println("-----------------------------------");
                        secimDikdortgen();
                    } else if (secim2 == 4) {
                        System.out.println("-----------------------------------");
                        secimKare();
                    } else {
                        System.out.println("-----------------------------------");
                        System.out.println("yanlış numara");
                    }
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    System.out.println(" 1. Küre\n 2. Dörtgen prizma");
                    secim2 = scan.nextInt();
                    
                    if (secim2 == 1) {
                    	System.out.println("-----------------------------------");
                    	secimKure();
                    } else if (secim2 == 2) {
                        System.out.println("-----------------------------------");
                        secimDortgenPrizma();
                    } else {
                        System.out.println("-----------------------------------");
                        System.out.println("yanlış numara");
                    }
                    break;
                case 3:
                    System.out.println("çıkış yaptınız !!");
                    System.out.println("proje yapanlar:\nMarah Aljumaat 230411245\nSafia Ashraf Said 230411182");
                    break;
                default:
                    System.out.println("yanlış numara");
            }

        }

    }

    public static double positifSayiAl(String message) {
        Scanner scan = new Scanner(System.in);
        double sayi;
        do {
            System.out.println(message);
            sayi = scan.nextDouble();
            if (sayi <= 0) {
                System.out.println("Lütfen pozitif bir değer girin.");
            }
        } while (sayi <= 0);
        return sayi;
    }
    
    public static void secimDaire() {
    	double yariCapi;
    	yariCapi = positifSayiAl("Yarı çapı gir (negatif yada sıfır girme!): ");
    	Daire daire = new Daire(yariCapi);
        System.out.println(daire.isimYazdir("Daire"));
        System.out.println("Yarı çapı: " + yariCapi);
        System.out.println("Alan: " + daire.alanHesaplama());
        System.out.println("Çevre: " + daire.cevreHesaplama());
        new ShapeDrawer("Daire", yariCapi, 0, 0, 0);
    }
    
    public static void secimUcgen() {
    	double yukseklik,taban,uzunluk, uzunluk2, uzunluk3;
    	taban = positifSayiAl("Taban gir (negatif yada sıfır girme!): ");
        yukseklik = positifSayiAl("Yükseklik gir (negatif yada sıfır girme!): ");
        uzunluk = positifSayiAl("1. kenar uzunluğu gir (negatif yada sıfır girme!): ");
        uzunluk2 = positifSayiAl("2. kenar uzunluğu gir (negatif yada sıfır girme!): ");
        uzunluk3 = positifSayiAl("3. kenar uzunluğu gir (negatif yada sıfır girme!): ");
        Ucgen ucgen = new Ucgen(taban, yukseklik, uzunluk, uzunluk2, uzunluk3);
        System.out.println(ucgen.isimYazdir("Üçgen"));
        System.out.println("Taban: " + taban + "\tYükseklik: " + yukseklik);
        System.out.println("1.kenar uzunluğu: " + uzunluk + "\t2.kenar uzunluğu: " + uzunluk2 + "\t3.kenar uzunluğu: " + uzunluk3);
        System.out.println("Alan: " + ucgen.alanHesaplama());
        System.out.println("Çevre: " + ucgen.cevreHesaplama());
        new ShapeDrawer("Üçgen", taban, yukseklik, 0, 0);
    }
    
    public static void secimDikdortgen() {
    	double uzunluk, genislik;
    	uzunluk = positifSayiAl("Uzunluk gir (negatif yada sıfır girme!): ");
        genislik = positifSayiAl("Genişlik gir (negatif yada sıfır girme!): ");
        Dikdortgen dikdortgen = new Dikdortgen(uzunluk, genislik);
        System.out.println(dikdortgen.isimYazdir("Dikdortgen"));
        System.out.println("Uzunluk: " + uzunluk + "\tGenişlik: " + genislik);
        System.out.println("Alan: " + dikdortgen.alanHesaplama());
        System.out.println("Çevre: " + dikdortgen.cevreHesaplama());
        new ShapeDrawer("Dikdörtgen", uzunluk, genislik, 0, 0);
    }
    
    public static void secimKare() {
    	double uzunluk;
    	uzunluk = positifSayiAl("Uzunluk gir (negatif yada sıfır girme!): ");
    	Kare kare = new Kare(uzunluk);
        System.out.println(kare.isimYazdir("kare"));
        System.out.println("Uzunluk: " + uzunluk);
        System.out.println("Alan: " + kare.alanHesaplama());
        System.out.println("Çevre: " + kare.cevreHesaplama());
        new ShapeDrawer("Kare", uzunluk, 0, 0, 0);
    }
    
    public static void secimKure() {
    	double yariCapi;
    	yariCapi = positifSayiAl("Yarı çapı gir (negatif yada sıfır girme!): ");
    	Kure kure = new Kure(yariCapi);
        System.out.println(kure.isimYazdir("Küre"));
        System.out.println("Yarı çapı: " + yariCapi);
        System.out.println("Alan: " + kure.alanHesaplama());
        System.out.println("Hacim: " + kure.hacimHesaplama());
        new ShapeDrawer3D("Küre", yariCapi,0,0);
    }
    
    public static void secimDortgenPrizma() {
    	double uzunluk,genislik,yukseklik;
    	uzunluk = positifSayiAl("Uzunluk gir (negatif yada sıfır girme!): ");
        genislik = positifSayiAl("Genişlik gir (negatif yada sıfır girme!): ");
        yukseklik = positifSayiAl("Yükseklik gir (negatif yada sıfır girme!): ");
        DortgenPrizma prizma = new DortgenPrizma(uzunluk, genislik, yukseklik);
        System.out.println(prizma.isimYazdir("Dikdortgen prizma"));
        System.out.println("Uzunluk: " + uzunluk + "\tGenişlik: " + genislik + "\tYükseklik: " + yukseklik);
        System.out.println("Alan: " + prizma.alanHesaplama());
        System.out.println("Hacim: " + prizma.hacimHesaplama());
        new ShapeDrawer3D("Dörtgen Prizma", uzunluk, genislik, yukseklik);
    }
}
