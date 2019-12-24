package sample;

    public abstract class Urunler  {

        protected String siparisNo;
        protected String barkodNo;
        protected String urunAdet;
        protected String urnTplmFyt;
        protected String musteriNo;

        public abstract String get_siparisNo();

        public abstract String get_barkodNo();

        public abstract String get_urunAdet();

        public abstract String get_urnTplmFyt();

        public abstract String get_musteriNo();
    }