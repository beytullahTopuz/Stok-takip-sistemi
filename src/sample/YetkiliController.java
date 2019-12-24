package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import static sample.Main.*;

public class YetkiliController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Tab Yetkili_CalisanHesapOlusturma;

    @FXML
    private TextField a00;

    @FXML
    private TextField a01;

    @FXML
    private TextField a02;

    @FXML
    private TextField a10;

    @FXML
    private TextField a11;

    @FXML
    private TextField a12;

    @FXML
    private TextField a20;

    @FXML
    private TextField a21;

    @FXML
    private TextField a22;

    @FXML
    private TextField a30;

    @FXML
    private TextField a31;

    @FXML
    private TextField a32;

    @FXML
    private TextField a40;

    @FXML
    private TextField a41;

    @FXML
    private TextField a42;

    @FXML
    private TextField a50;

    @FXML
    private TextField a51;

    @FXML
    private TextField a52;

    @FXML
    private TextField ad;

    @FXML
    private TextField adres;

    @FXML
    private TextField b1;

    @FXML
    private TextField b2;

    @FXML
    private TextField b3;

    @FXML
    private TextField b4;

    @FXML
    private TextField b5;

    @FXML
    private Text barkodId;

    @FXML
    private Button btnCalisanKayitOlustur;

    @FXML
    private Button btnYetkiliUrunKayit;

    @FXML
    private Button btntedarikcikaydet;

    @FXML
    private Text calisanNo;

    @FXML
    private TextField calisann;

    @FXML
    private TextField eMail;

    @FXML
    private Text fiyat;

    @FXML
    private TextField sifre1;

    @FXML
    private TextField sifre2;

    @FXML
    private TextField soyad;

    @FXML
    private TextField stokekleme1;

    @FXML
    private TextField stokekleme2;

    @FXML
    private TextField stokekleme3;

    @FXML
    private TextField stokekleme4;

    @FXML
    private TextField stokekleme5;

    @FXML
    private TextField stokekleme6;

    @FXML
    private TextField tcNo;

    @FXML
    private TextField tedarikciid;

    @FXML
    private TextField tedarikciisim;

    @FXML
    private TextField telNo;

    @FXML
    private TextField teslimatsuresi;

    @FXML
    private Button urun1stokguncelle;

    @FXML
    private Button urun2stokguncelle;

    @FXML
    private Button urun3stokguncelle;

    @FXML
    private Button urun4stokguncelle;

    @FXML
    private Button urun5stokguncelle;

    @FXML
    private Button urun6stokguncelle;

    @FXML
    private Tab yetkiliUrunKaydi;

    @FXML
    private Tab yetkiliUrunTakip;

  //  public static int ytkno = 900000;
    public static String mas = "3000";
    public static ArrayList<Urun> urunObjArrL=new ArrayList<Urun>(0);

    public void btngoruntuleme(ActionEvent actionEvent){
       // System.out.println("qqqqq");
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
        if (urunObjArrL.size()==1){
            a00.setText(urunObjArrL.get(0).barkod_no);
            a01.setText(urunObjArrL.get(0).isim);
            a02.setText(urunObjArrL.get(0).stokAdet);
        }
        if (urunObjArrL.size()==2){
            a00.setText(urunObjArrL.get(0).barkod_no);
            a01.setText(urunObjArrL.get(0).isim);
            a02.setText(urunObjArrL.get(0).stokAdet);
            a10.setText(urunObjArrL.get(1).barkod_no);
            a11.setText(urunObjArrL.get(1).isim);
            a12.setText(urunObjArrL.get(1).stokAdet);
        }
        if (urunObjArrL.size()==3){
            a00.setText(urunObjArrL.get(0).barkod_no);
            a01.setText(urunObjArrL.get(0).isim);
            a02.setText(urunObjArrL.get(0).stokAdet);
            a10.setText(urunObjArrL.get(1).barkod_no);
            a11.setText(urunObjArrL.get(1).isim);
            a12.setText(urunObjArrL.get(1).stokAdet);
            a20.setText(urunObjArrL.get(2).barkod_no);
            a21.setText(urunObjArrL.get(2).isim);
            a22.setText(urunObjArrL.get(2).stokAdet);
        }
        if (urunObjArrL.size()==4){
            a00.setText(urunObjArrL.get(0).barkod_no);
            a01.setText(urunObjArrL.get(0).isim);
            a02.setText(urunObjArrL.get(0).stokAdet);
            a10.setText(urunObjArrL.get(1).barkod_no);
            a11.setText(urunObjArrL.get(1).isim);
            a12.setText(urunObjArrL.get(1).stokAdet);
            a20.setText(urunObjArrL.get(2).barkod_no);
            a21.setText(urunObjArrL.get(2).isim);
            a22.setText(urunObjArrL.get(2).stokAdet);
            a30.setText(urunObjArrL.get(3).barkod_no);
            a31.setText(urunObjArrL.get(3).isim);
            a32.setText(urunObjArrL.get(3).stokAdet);
        }
    }

    public void stok1update(ActionEvent actionEvent){
      //  System.out.println("1");
        a02.setText(stokekleme1.getText());

    }
    public void stok2update(ActionEvent actionEvent){
       // System.out.println("2");
        a12.setText(stokekleme2.getText());
    }
    public void stok3update(ActionEvent actionEvent){
        //System.out.println("3");
        a22.setText(stokekleme3.getText());
    }
    public void stok4update(ActionEvent actionEvent){
        //System.out.println("4");
        a32.setText(stokekleme4.getText());
    }



    public static String tedarikciYaz="";

    public void tedarilcikayit(ActionEvent actionEvent) throws Exception{
        //System.out.println("basss");
        tedarikciObjArrL.add(new Tedarikci (tedarikciisim.getText(), tedarikciid.getText(), teslimatsuresi.getText()));

        tedarikciYaz+=tedarikciisim.getText();
        tedarikciYaz+=";";
        tedarikciYaz+=tedarikciid.getText();
        tedarikciYaz+=";";
        tedarikciYaz+=teslimatsuresi.getText();
        tedarikciYaz+="\n";
        FileOutputStream outputStream = new FileOutputStream(path+"Tedarikci.txt", true);
        byte[] strToBytes = tedarikciYaz.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
        System.out.println("Tedaikci: "+tedarikciYaz);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("success");
        alert.setHeaderText("islem basarili");
        alert.setContentText("yeni tedarikci kaydiniz alinmistir");
        alert.showAndWait();

    }

    public void calisankayit(ActionEvent actionEvent) throws IOException{
        System.out.println("buton çalışıtoeasdlaoksd");
        String txtYaz="";
        txtYaz += ad.getText();
        txtYaz +=";";
        txtYaz +=soyad.getText();
        txtYaz +=";";
        txtYaz +=sifre1.getText();
        txtYaz +=";";
        txtYaz +=tcNo.getText();
        txtYaz +=";";
        txtYaz +=telNo.getText();
        txtYaz +=";";
        txtYaz +=eMail.getText();
        txtYaz +=";";
        txtYaz +=adres.getText();
        txtYaz +=";";
        txtYaz +=calisann.getText();
        txtYaz +=";";
        txtYaz += mas;

     //   System.out.println(txtYaz);
        txtYaz += "\n";
        FileOutputStream outputStream = new FileOutputStream(path+"Calisan.txt", true);
        byte[] strToBytes = txtYaz.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }

    public static String uruntxt;
   public void urunkayit(ActionEvent actionEvent)throws IOException{
        uruntxt = b1.getText();
        uruntxt += ";";
        uruntxt += b2.getText();
        uruntxt += ";";
        uruntxt +=b3.getText();
        uruntxt += ";";
        uruntxt +=b4.getText();
        uruntxt += ";";
        uruntxt += b5.getText();
        uruntxt +="\n";
       FileOutputStream outputStream = new FileOutputStream(path+"Urun.txt", true);
       byte[] strToBytes = uruntxt.getBytes();
       outputStream.write(strToBytes);
       outputStream.close();
       urunObjArrL.add(new Urun(b1.getText(),b2.getText(),b3.getText(),b4.getText(),b5.getText()));


     //  System.out.println(uruntxt);
   }


}
