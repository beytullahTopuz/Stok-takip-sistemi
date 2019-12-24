package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.*;
import java.io.*;
public class Main extends Application {

public static String path = "C:\\Users\\beytu\\Desktop\\Stok Takip Sistemi\\src\\sample\\veri\\";
public static ArrayList<Musteri> musteriObjArrL=new ArrayList<Musteri>(0);
public static ArrayList<Calisan> calisanObjArrL=new ArrayList<Calisan>(0);
public static ArrayList<Yetkili> yetkiliObjArrL=new ArrayList<Yetkili>(0);
public static ArrayList<Urun> urunObjArrL=new ArrayList<Urun>(0);
public static ArrayList<Bulunan_Urunler>blnUrnObjArrL =new ArrayList<Bulunan_Urunler>(0);
public static ArrayList<Tedarikci> tedarikciObjArrL=new ArrayList<Tedarikci>(0);

    public static void ara(String s){

    String parcaAra = s;
    // parcaAra = aramatext.getText();
    //   System.out.println(parcaAra);
    //  System.out.println("tiklandi");

    for(int i=0;i<urunObjArrL.size();i++){
        String str = urunObjArrL.get(i).get_isim();
        int tmp_index=str.indexOf(parcaAra);
        if(tmp_index!=-1) {
            blnUrnObjArrL.add(new Bulunan_Urunler(urunObjArrL.get(i).barkod_no, urunObjArrL.get(i).isim, urunObjArrL.get(i).fyt, urunObjArrL.get(i).stokAdet, urunObjArrL.get(i).tedarikci_id));
        }
    }
    for(int i=0;i<blnUrnObjArrL.size();i++) {
        System.out.println(blnUrnObjArrL.get(i).get_barkod_no());
        System.out.println(blnUrnObjArrL.get(i).get_isim());
        System.out.println(blnUrnObjArrL.get(i).get_fyt());
        System.out.println(blnUrnObjArrL.get(i).get_stokAdet());
        System.out.println(blnUrnObjArrL.get(i).getTedarikci_id());
    }
}

    @Override
    public void start(Stage primaryStage) throws Exception{

//reading from Tedarikci.txt
        String tedarikciler="";
        try{
            FileInputStream tedarikci=new FileInputStream(path+"Tedarikci.txt");
            int n;
            while((n=tedarikci.available())>0){
                byte[] b=new byte[n];
                int result=tedarikci.read(b);
                if(result==-1) break;
                String s=new String(b);
                tedarikciler+=s;
            }
        }
        catch(FileNotFoundException e){System.out.println(e);}
//    System.out.println(tedarikciler);

// converting Tedarikci.txt to objects

        String [] tedArr=tedarikciler.split("\n");
        for(int i=0;i<tedArr.length;i++){       // splittin each item
            String tmp=tedArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            tedarikciObjArrL.add(new Tedarikci(innerr[0],innerr[1],innerr[2]));

        }

        for(int i=0; i<tedarikciObjArrL.size();i++){

//    System.out.println(tedarikciObjArrL.get(i).isim);
            //   System.out.println(tedarikciObjArrL.get(i).tedarikciID);
            // System.out.println(tedarikciObjArrL.get(i).teslimatSuresi);
            System.out.println(tedarikciObjArrL.get(i).get_isim());
            System.out.println(tedarikciObjArrL.get(i).getTedarikci_id());
            System.out.println(tedarikciObjArrL.get(i).getTeslimatSuresi());
            System.out.println();

        }

// reading from Musteri.txt

        String musteriler="";
        try{
            FileInputStream musteri=new FileInputStream(path+"Musteri.txt");
            int n;
            while((n=musteri.available())>0){
                byte[] b=new byte[n];
                int result=musteri.read(b);
                if(result==-1) break;
                String s=new String(b);
                musteriler+=s;
            }
        }
        catch(FileNotFoundException e){System.out.println(e);}
//    System.out.println(musteriler);

// converting Musteri.txt to objects


        String [] mustArr=musteriler.split("\n");
        for(int i=0;i<mustArr.length;i++){       // splittin each item
            String tmp=mustArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            musteriObjArrL.add(new Musteri(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4],innerr[5],innerr[6],innerr[7],innerr[8]));

        }


        String calisanlar="";
        try{
            FileInputStream calisan=new FileInputStream(path+"Calisan.txt");
            int n;
            while((n=calisan.available())>0){
                byte[] b=new byte[n];
                int result=calisan.read(b);
                if(result==-1) break;
                String s=new String(b);
                calisanlar+=s;
            }
        }
        catch(IOException e){System.out.println(e);}
//    System.out.println(calisanlar);

// converting Calisan.txt to objects


        String [] calArr=calisanlar.split("\n");
        for(int i=0;i<calArr.length;i++){       // splittin each item
            String tmp=calArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            calisanObjArrL.add(new Calisan(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4],innerr[5],innerr[6],innerr[7],innerr[8]));

        }



// reading from Yetkili.txt
        String yetkililer="";
        try{
            FileInputStream yetkili=new FileInputStream(path+"Yetkili.txt");
            int n;
            while((n=yetkili.available())>0){
                byte[] b=new byte[n];
                int result=yetkili.read(b);
                if(result==-1) break;
                String s=new String(b);
                yetkililer+=s;
            }
        }
        catch(IOException e){System.out.println(e);}


        String [] yetArr=yetkililer.split("\n");
        for(int i=0;i<yetArr.length;i++){       // splittin each item
            String tmp=yetArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            yetkiliObjArrL.add(new Yetkili(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4],innerr[5],innerr[6],innerr[7],innerr[8]));

        }


// reading from Siparis.txt

        String siparisler="";
        try{
            FileInputStream siparis=new FileInputStream(path+"Siparis.txt");
            int n;
            while((n=siparis.available())>0){
                byte[] b=new byte[n];
                int result=siparis.read(b);
                if(result==-1) break;
                String s=new String(b);
                siparisler+=s;
            }
        }
        catch(IOException e){System.out.println(e);}
//    System.out.println(siparisler);

// converting Siparis.txt to objects

        ArrayList<Siparis> siparisObjArrL=new ArrayList<Siparis>(0);
        String [] siprArr=siparisler.split("\n");
        for(int i=0;i<siprArr.length;i++){       // splittin each item
            String tmp=siprArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            siparisObjArrL.add(new Siparis(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4],innerr[5]));

        }


//test
        // reading from Siparis_istegi.txt

        String istekler="";
        try{
            FileInputStream istek=new FileInputStream(path+"Siparis_istegi.txt");
            int n;
            while((n=istek.available())>0){
                byte[] b=new byte[n];
                int result=istek.read(b);
                if(result==-1) break;
                String s=new String(b);
                istekler+=s;
            }
        }
        catch(IOException e){System.out.println(e);}
//    System.out.println(siparisler);

// converting Siparis.txt to objects

        ArrayList<Siparis_istek> istekObjArrL=new ArrayList<Siparis_istek>(0);
        String [] istkArr=istekler.split("\n");
        for(int i=0;i<istkArr.length;i++){       // splittin each item
            String tmp=istkArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            istekObjArrL.add(new Siparis_istek(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4]));

        }

        String urunler="";
        try{
            FileInputStream urun=new FileInputStream(path+"Urun.txt");
            int n;
            while((n=urun.available())>0){
                byte[] b=new byte[n];
                int result=urun.read(b);
                if(result==-1) break;
                String s=new String(b);
                urunler+=s;
            }
        }
        catch(IOException e){System.out.println(e);}

        // converting Urun.txt to objects


        String [] urunArr=urunler.split("\n");
        for(int i=0;i<urunArr.length;i++){       // splittin each item
            String tmp=urunArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            urunObjArrL.add(new Urun(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4]));

        }

        for(int i=0; i<urunObjArrL.size();i++){

//    System.out.println(tedarikciObjArrL.get(i).isim);
            //   System.out.println(tedarikciObjArrL.get(i).tedarikciID);
            // System.out.println(tedarikciObjArrL.get(i).teslimatSuresi);
            System.out.println(urunObjArrL.get(i).get_barkod_no());
            System.out.println(urunObjArrL.get(i).get_isim());
            System.out.println(urunObjArrL.get(i).get_fyt());
            System.out.println(urunObjArrL.get(i).get_stokAdet());
            System.out.println(urunObjArrL.get(i).getTedarikci_id());
            System.out.println();
        }

        // reading from Urun_talebi.txt

        String talebler="";
        try{
            FileInputStream taleb=new FileInputStream(path+"Urun_talebi.txt");
            int n;
            while((n=taleb.available())>0){
                byte[] b=new byte[n];
                int result=taleb.read(b);
                if(result==-1) break;
                String s=new String(b);
                talebler+=s;
            }
        }
        catch(IOException e){System.out.println(e);}

        // converting Urun_talebi.txt to objects

        ArrayList<Urun_Talebi> talebObjArrL=new ArrayList<Urun_Talebi>(0);
        String [] talebArr=talebler.split("\n");
        for(int i=0;i<talebArr.length;i++){       // splittin each item
            String tmp=talebArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            talebObjArrL.add(new Urun_Talebi(innerr[0],innerr[1],innerr[2]));

        }


        // deneme///////////////////////
/*
        String parcaAra = "go";
       // parcaAra = aramatext.getText();
     //   System.out.println(parcaAra);
      //  System.out.println("tiklandi");

        for(int i=0;i<urunObjArrL.size();i++){
            String str = urunObjArrL.get(i).get_isim();
            int tmp_index=str.indexOf(parcaAra);
            if(tmp_index!=-1) {
                blnUrnObjArrL.add(new Bulunan_Urunler(urunObjArrL.get(i).barkod_no, urunObjArrL.get(i).isim, urunObjArrL.get(i).fyt, urunObjArrL.get(i).stokAdet, urunObjArrL.get(i).tedarikci_id));
            }
        }
        for(int i=0;i<blnUrnObjArrL.size();i++) {
            System.out.println(blnUrnObjArrL.get(i).get_barkod_no());
            System.out.println(blnUrnObjArrL.get(i).get_isim());
            System.out.println(blnUrnObjArrL.get(i).get_fyt());
            System.out.println(blnUrnObjArrL.get(i).get_stokAdet());
            System.out.println(blnUrnObjArrL.get(i).getTedarikci_id());
        }
*/
        //**************************************


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("GİRİŞ YAP");
        primaryStage.setScene(new Scene(root, 586, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
