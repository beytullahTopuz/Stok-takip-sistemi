package sample;

public class Siparis extends Urunler {

        protected String onaylynPersNo;

        public Siparis(String siparisNo, String barkodNo, String urunAdet, String urnTplmFyt, String musteriNo, String onaylynPersNo){

                this.siparisNo=siparisNo;
                this.barkodNo=barkodNo;
                this.urunAdet=urunAdet;
                this.urnTplmFyt=urnTplmFyt;
                this.musteriNo=musteriNo;

            this.onaylynPersNo=onaylynPersNo;
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

        public String get_onaylynPersNo(){ return onaylynPersNo; }

    }
