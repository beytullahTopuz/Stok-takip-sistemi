package sample;
import sample.Kullanici;

public class Calisan extends Kullanici{

    public String maas;
    public String calisanNo;

    public Calisan(String isim, String soyisim, String sifre, String tc, String telefon, String eMail, String adres, String calisanNo, String maas) {

        this.isim = isim;
        this.soyisim = soyisim;
        this.sifre = sifre;
        this.tc = tc;
        this.telefon = telefon;
        this.eMail = eMail;
        this.adres = adres;
        this.calisanNo = calisanNo;
        this.maas=maas;
    }


    public String getMaas(){
        return maas;
    }
 //   public void setMaas(String maas){
//        this.maas = maas;
//    }
    public String getCalisanNo(){
        if( calisanNo.length() != 6){
            System.out.println("Çalışan kaydı bulunamadı tekrar deneyin.");
        }
        if(calisanNo.charAt(0) != '8'){
            System.out.println("Çalışan numarası '8' ile başlamalıdır.. Tekrar deneyin.");
        }
        return calisanNo;
    }
//    public void setCalisanNo(String calisanNo){
//        this.calisanNo = calisanNo;
//    }
}