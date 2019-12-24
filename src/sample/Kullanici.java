
package sample;

public abstract class Kullanici {
    public String isim;
    public String soyisim;
    public String sifre;
    public String tc;
    public String telefon;
    public String eMail;
    public String adres;

    public String getisim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public String getSifre() {
        return sifre;
    }

    public String getTc() {
        if (tc.length() != 11) {
            System.out.println("Tc yi eksik girdiniz.");
        }
        return tc;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEMail() {
        return eMail;
    }

    public String getAdres() {
        return adres;
    }


}