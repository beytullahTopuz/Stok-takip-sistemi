package sample;

public class Siparis_istek extends Urunler {

        public Siparis_istek(String siparisNo, String barkodNo, String urunAdet, String urnTplmFyt, String musteriNo){
            this.siparisNo=siparisNo;
            this.barkodNo=barkodNo;
            this.urunAdet=urunAdet;
            this.urnTplmFyt=urnTplmFyt;
            this.musteriNo=musteriNo;
        }


    @Override
    public String get_siparisNo(){ return siparisNo; }

    @Override
    public String get_barkodNo(){ return barkodNo; }

    @Override
    public String get_urunAdet(){ return urunAdet; }

    @Override
    public String get_urnTplmFyt(){ return urnTplmFyt; }

    @Override
    public String get_musteriNo(){ return musteriNo; }


}
