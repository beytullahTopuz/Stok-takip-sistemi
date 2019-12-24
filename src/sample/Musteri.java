package sample;
import sample.Kullanici;

public class Musteri extends Kullanici {
    public String musteriNo;
    public String odemeSekli;

    public Musteri(String isim, String soyisim, String sifre, String tc, String telefon, String eMail, String adres, String MusteriNo, String odemeSekli) {

        this.isim = isim;
        this.soyisim = soyisim;
        this.sifre = sifre;
        this.tc = tc;
        this.telefon = telefon;
        this.eMail = eMail;
        this.adres = adres;
        this.musteriNo = MusteriNo;
        this.odemeSekli=odemeSekli;
    }


    public String getOdemeSekli() {
        return odemeSekli;
    }

    public String getMusteriNo(){
        if (musteriNo.length() != 6) {
            System.out.println("Müşteri kaydı bulunamadı tekrar deneyin.");
        }
        if (musteriNo.charAt(0) == '7' || musteriNo.charAt(0) == '8' || musteriNo.charAt(0) == '9') {
            System.out.println("İlk karakter 7-8-9 olamaz. Tekrar deneyin.");
            this.odemeSekli = odemeSekli;
        }
        return musteriNo;
    }

}