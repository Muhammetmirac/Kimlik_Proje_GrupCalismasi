package Proje_01;

import java.util.LinkedHashSet;
import java.util.Set;

public class KimlikPojo {
    private int kimlikId;
    public String isimSoyisim;
    private String adres;
    private String telefonNo;

    public KimlikPojo() {
    }

    public KimlikPojo(int kimlikId, String isimSoyisim, String adres, String telefon) {
        this.kimlikId = kimlikId;
        this.isimSoyisim = isimSoyisim;
        this.adres = adres;
        this.telefonNo = telefon;
    }


    public int getKimlikId() {
        return kimlikId;
    }

    public void setKimlikId(int kimlikId) {
        this.kimlikId = kimlikId;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    @Override
    public String toString() {
        return
                "==============================\n"+
        "Kimlik Sahibinin Bilgileri : \n" +
                "kimlikId ='" + kimlikId +'\''+ "\n" +
                "isimSoyisim='" + isimSoyisim +'\''+ "\n" +
                "adres='" + adres +'\''+ "\n" +
                "telefonNo='" + telefonNo + '\''+
                "\n==============================";


    }

}
