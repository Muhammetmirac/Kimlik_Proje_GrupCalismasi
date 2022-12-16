package Proje_01;


import java.util.*;

public class Kullanici extends KimlikPojo {

    static Scanner scan = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);

    static Map<Integer, String> vatandasList = new HashMap<>();
    static KimlikPojo obj = new KimlikPojo();

    public static void saveInfo() throws InterruptedException {


        boolean exit = true;
        do {
            System.out.println("<<<<<-----KİMLİK KAYIT İŞLEMİ EKRANINA HOŞGELDİNİZ----->>>>>");
            System.out.println("Lutfen kimlik numaranızı giriniz..");
            obj.setKimlikId(scan.nextInt());
            if (obj.getKimlikId() < 10000 && obj.getKimlikId() > 999) {
                if (vatandasList.containsKey(obj.getKimlikId())) {
                    System.out.println("Kayıtlı bir kimlik numarası ile işlem yapmaya çalışıyorsunuz. yeni bir kimlik no giriniz\n");
                    Thread.sleep(3000); // ekran geçişinde 3 saniye bekletme
                    saveInfo();
                } else {
                    System.out.println("Lutfen ad-soyad bilgilerinizi giriniz..");
                    scan.nextLine();
                    obj.isimSoyisim = input.nextLine();
                    //  System.out.println("obj.isimSoyisim = " + obj.isimSoyisim);

                    System.out.println("Lutfen adres bilgilerinizi giriniz..");
                    obj.setAdres(input.nextLine());
                    //    input.nextLine();// satır atlamasının önüne geçilmesi için kullanıldı
                    System.out.println("Lutfen telefon bilgilerinizi giriniz..");
                    obj.setTelefonNo(input.nextLine());

                    Set<String> list = new LinkedHashSet<>();
                    list.add(obj.isimSoyisim);
                    list.add(obj.getAdres());
                    list.add(obj.getTelefonNo());
                    System.out.println(list);
                    vatandasList.put(obj.getKimlikId(), list.toString());
                    System.out.println("Kayıt işlemi başarılı...");
                    System.out.println("\n" + obj.toString());
                    Thread.sleep(2000); // ekran geçişinde 3 saniye bekletme
                    System.out.println(" Kayıt İşlemine Devam Etmek için  : 1 \n" +
                            " Kayıt İşlemini Sonlandırmak için : 2 ");
                    int scm = scan.nextInt();
                    switch (scm) {
                        case 1:
                            saveInfo();
                            exit = false;
                            break;
                        case 2:
                            System.out.println("İyi günler dileriz...");
                            System.out.println("Anasayfaya yönlendiriliyorsunuz\n");
                            Thread.sleep(2000); // ekran geçişinde 2 saniye bekletme
                            KimliKSorguAnaSayfa.kimlikSorguAnaSayfa();
                            exit = false;
                            break;
                    }
                }
            } else {
                System.out.println("Hatalı giriş!...Lutfen 4 haneli kimlik numaranızı giriniz\n");
                saveInfo();
                exit = false;
            }
        } while (exit);

    }




    public static void getInfo() throws InterruptedException {

        System.out.println("-----------<<< KİMLİK SORGU EKRANINA HOŞGELDİNİZ >>>-----------");
        System.out.println("Lutfen sorgulamak istediğiniz Kimlik Nosunu giriniz");
        int kimlikNo = scan.nextInt();

        if (vatandasList.containsKey(kimlikNo)) {
            //      System.out.println(kimlikNo+" "+vatandasList.get(kimlikNo));ku
            System.out.println(vatandasList.get(kimlikNo));

//            Set<Map.Entry<Integer, String>> set = vatandasList.entrySet();
//            for (Map.Entry<Integer, String> w : set) {
//                if (w.getKey() == kimlikNo) System.out.println(w.getValue());
//
//            }
            Thread.sleep(3000);
            KimliKSorguAnaSayfa.kimlikSorguAnaSayfa();

        } else {
            System.out.println("Kayıt bulunamadı...\n");
            Thread.sleep(3000);
            boolean exit = true;

            do {

                System.out.println("Sorgulama ekranı için   1: \n" +
                        "Kayıt ekranı için       2:\n" +
                        "Anasayfaya gitmek için  3: \n");
                int scm = scan.nextInt();
                switch (scm) {
                    case 1:
                        getInfo();
                        exit = false;
                        break;
                    case 2:
                        saveInfo();
                        exit = false;
                        break;
                    case 3:
                        KimliKSorguAnaSayfa.kimlikSorguAnaSayfa();
                        exit = false;
                        break;
                    default:
                        System.out.println("Geçerli bir seçim yapınız\n");

                }
            } while (exit);
        }

    }

    public static void removeInfo() throws InterruptedException {
        System.out.println("\"-----------<<< KİMLİK BİLGİLERİ SİLME EKRANINA HOŞGELDİNİZ >>>-----------\"");
        System.out.println();
        System.out.println("Silmek istediğiniz kimlik numarasını giriniz :");
        int kimlikNo=scan.nextInt();
        if (vatandasList.containsKey(kimlikNo)){
            vatandasList.remove(kimlikNo);
            System.out.println(kimlikNo+"Kimlik Numarası Başarıyla Kaldırıldı...\n");
            Thread.sleep(1500);
            System.out.println("\n Silme işlemine devam etmek için 1 :\n" +
                               "   Anasayfaya Yönlendirilmek için  2 :");
            int secim= scan.nextInt() ;
            if (secim == 1){
                removeInfo();
            }else if(secim==2){
                KimliKSorguAnaSayfa.kimlikSorguAnaSayfa();
            }
        }else{
            System.out.println("Girmiş oldugunuz Kimlik Numarasına Ait Kayıt Bulunamadı\n");
            removeInfo();
        }

    }

















}







