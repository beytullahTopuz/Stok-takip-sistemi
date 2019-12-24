package sample;

public class Urun implements interfaceMM {
   public String barkod_no;
   public String isim;
   public String fyt;
    public String stokAdet;
    public String tedarikci_id;

    public Urun(String barkod_no, String isim, String fyt, String stokAdet, String tedarikci_id){
        this.barkod_no=barkod_no;
        this.isim=isim;
        this.fyt=fyt;
        this.stokAdet=stokAdet;
        this.tedarikci_id=tedarikci_id;
    }

    public String get_barkod_no(){ return barkod_no; }
    public String get_isim(){ return isim; }
    public String get_fyt(){ return fyt; }
    public String get_stokAdet(){ return stokAdet; }

    @Override
    public String getTedarikci_id(){ return tedarikci_id; }
}
