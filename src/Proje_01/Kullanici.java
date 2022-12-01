package Proje_01;


import java.util.*;

public class Kullanici extends KimlikPojo {

    static Scanner scan = new Scanner(System.in);

    static Map<Integer, String> vatandasList = new HashMap<>();


    public static void saveInfo() throws InterruptedException {

        KimlikPojo obj = new KimlikPojo();
        boolean exit = true;
do {
    System.out.println(" Kayıt İşlemine Devam Etmek için  : 1 \n" +
                       " Kayıt İşlemini Sonlandırmak için : 2 ");
    int scm=scan.nextInt();
    switch (scm){
        case 1:
            System.out.println("Lutfen kimlik numaranızı giriniz..");
        //  int  setKimlikId = scan.nextInt();
          obj.setKimlikId(scan.nextInt());
            if (obj.getKimlikId() < 10000 && obj.getKimlikId() > 999) {
                if (vatandasList.containsKey(obj.getKimlikId())) {
                    System.out.println("Kayıtlı bir kimlik numarası ile işlem yapmaya çalışıyorsunuz. yeni bir kimlik no giriniz");
                    saveInfo();
                } else {
                    System.out.println("Lutfen açık kimlik bilgilerinizi giriniz..");
                    scan.nextLine();
                   obj.isimSoyisim= scan.nextLine();
                    System.out.println("obj.isimSoyisim = " + obj.isimSoyisim);
                    scan.nextLine();// satır atlamasının önüne geçilmesi için kullanıldı
                    System.out.println("Lutfen adres bilgilerinizi giriniz..");
                    obj.setAdres(scan.nextLine());

                    System.out.println("Lutfen telefon bilgilerinizi giriniz..");
                    obj.setTelefonNo(scan.nextLine());

                    Set<String> list =new TreeSet<>();
                    list.add(obj.isimSoyisim);
                    list.add(obj.getAdres());
                    list.add(obj.getTelefonNo());
                    System.out.println(list);
                    vatandasList.put(obj.getKimlikId(), list.toString());
                    System.out.println("Kayıt işlemi başarılı...");
                    Thread.sleep(3000); // ekran geçişinde 3 saniye bekletme
                }
            } else {
                System.out.println("Hatalı giriş!...Lutfen 4 haneli kimlik numaranızı giriniz");
                saveInfo();
            }
            break;
        case 2:
            System.out.println("İyi günler dileriz...");
            System.out.println("Anasayfaya yönlendiriliyorsunuz");
            Thread.sleep(3000); // ekran geçişinde 3 saniye bekletme
            KimliKSorguAnaSayfa.kimlikSorguAnaSayfa();
            exit=false;
    }
    System.out.println(obj.toString());

}while (exit);
    }



    public static void getInfo(){

    }








    }
