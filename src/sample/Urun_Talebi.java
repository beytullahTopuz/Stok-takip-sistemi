package sample;

public class Urun_Talebi implements interfaceMM{
    String adet;
    String tedarikci_id;
    String barkod_no;

    public Urun_Talebi(String s, String s1, String s2) {
        barkod_no = s;
        adet = s1;
        tedarikci_id = s2;
    }


    public String get_adet(){ return adet; }
    public String get_barkod_no(){ return barkod_no; }

    @Override
    public String getTedarikci_id(){ return tedarikci_id; }
}
