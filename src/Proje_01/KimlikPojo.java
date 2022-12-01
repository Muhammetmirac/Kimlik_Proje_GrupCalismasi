package Proje_01;

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
        return "Kimlik Bilgileri{" +
                "kimlikId='" + kimlikId + '\'' +
                ", isimSoyisim='" + isimSoyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", telefonNo='" + telefonNo + '\'' +
                '}';
    }
}
