package Proje_01;

import java.util.Scanner;

public class KimliKSorguAnaSayfa {
    static Scanner scan = new Scanner(System.in);
    public static void kimlikSorguAnaSayfa() throws InterruptedException {
        System.out.println("**********-----Kimlik İşlemleri Ekranına Hoşgeldiniz-----**********");
        System.out.println("Lutfen yapacağınız işlemi seçiniz \n" +
                "1 : Kimlik Kayıt \n" +
                "2 : Kimlik Sorgu \n" +
                "3 : Kimlik Silme \n" +
                "4 : Çıkış");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                Kullanici.saveInfo();
                break;
            case 2:
                Kullanici.getInfo();
                break;
            case 3:
                kimlikSorguAnaSayfa();
                break;
            case 4:
                System.out.println("Güzel günleriniz olsun...");
                break;
            default:
                System.out.println("Lütfen gecerli bir giriş yapınız\n" +
                        "Giriş ekranına yönlendiriliyorsunuz.");
                Thread.sleep(2000);
                kimlikSorguAnaSayfa();

        }
    }




}
