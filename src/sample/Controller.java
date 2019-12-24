package sample;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import sample.Musteri;
import sample.Main.*;

import static sample.Main.*;


public class Controller {

    public static int mustNo=100000;

    public static Boolean girildi = false;//giriş yapilinca true olacak

    //********************************mmain giris ekran
    @FXML
    TextField email;
    @FXML
    PasswordField sifre;
    @FXML
    Button btngiris;
    @FXML
    Button btnkayit;

    public void girisyap(ActionEvent actionEvent) throws IOException {
      /*  uyari mesaji;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("uyari");
        alert.setHeaderText("hata");
        alert.setContentText("message");
        alert.showAndWait();*/
        //müsşteri ekranina giriş yap
       for(int i=0; i<musteriObjArrL.size();i++)
        if (email.getText().equals(musteriObjArrL.get(i).eMail) && sifre.getText().equals(musteriObjArrL.get(i).sifre)){
        //    System.out.println("musteri giris yapildi");
            (new Musteriarayuz()).start(new Stage());
            girildi = true;

        } else {
            System.out.println("kullanici adi ya da sifere hatali");
        }
       if (girildi==false){
           for(int i=0; i<calisanObjArrL.size();i++)
               if (email.getText().equals(calisanObjArrL.get(i).eMail) && sifre.getText().equals(calisanObjArrL.get(i).sifre)){
                   System.out.println("calisan giris yapildi");
                   (new calisanarayuz()).start(new Stage());


                    girildi = true;
               } else {
                   System.out.println("kullanici adi ya da sifere hatali");
               }
       }
        if (girildi == false){
            for(int i=0; i<yetkiliObjArrL.size();i++)
                if (email.getText().equals(yetkiliObjArrL.get(i).eMail) && sifre.getText().equals(yetkiliObjArrL.get(i).sifre)){
                    System.out.println("yetkili giris yapildi");
                    (new yetkiliarayuz()).start(new Stage());

                } else {
                   // System.out.println("kullanici adi ya da sifere hatali");
                }
        }





    }
    public void kayitolagit(ActionEvent actionEvent) throws IOException {
        System.out.println("kayit");
        (new Kayitol()).start(new Stage());
    }
    //********************************************kayıt ol ekranı*****************
    @FXML
    private TextField ad;

    @FXML
    private TextField adres;

    @FXML
    private Button btnkayitol;

    @FXML
    private TextField eMail;

    @FXML
    private TextField sifre1;

    @FXML
    private TextField sifre2;

    @FXML
    private TextField soyad;

    @FXML
    private TextField tcNo;

    @FXML
    private TextField telNo;
/*
    @FXML
    private Label sonuc;
*/
    public void kayit(ActionEvent actionEvent) throws IOException{

        mustNo++;
        String tmpmustNo = Integer.toString(mustNo);
        String textToAppend = "";
        textToAppend += ad.getText();
        textToAppend += ";";
        textToAppend += soyad.getText();
        textToAppend += ";";
        textToAppend += sifre1.getText();
        textToAppend += ";";
        textToAppend += tcNo.getText();
        textToAppend += ";";
        textToAppend += telNo.getText();
        textToAppend += ";";
        textToAppend += eMail.getText();
        textToAppend += ";";
        textToAppend += adres.getText();
        textToAppend += ";";
        textToAppend += tmpmustNo;
        textToAppend += ";";
        textToAppend += "visa";
        textToAppend += "\n";
        FileOutputStream outputStream = new FileOutputStream(path+"Musteri.txt", true);
        byte[] strToBytes = textToAppend.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
        musteriObjArrL.add(new Musteri(ad.getText(), soyad.getText(), sifre1.getText(), tcNo.getText(), telNo.getText(), eMail.getText(), adres.getText(), tmpmustNo, "visa"));



    }

    //****************************************calisan ARAYUZ**********************************************
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField UrunKaydiFiyat;

    @FXML
    private TextField UrunKaydiStokAdedi;

    @FXML
    private TextField UrunKaydiTedarikciId;

    @FXML
    private Tab Yetkili_CalisanHesapOlusturma;

    @FXML
    private TextField add;

    @FXML
    private TextField adress;

    @FXML
    private Text barkodId;

    @FXML
    private Button btnCalisanKayitOlustur;

    @FXML
    private Button btnYetkiliUrunKayit;

    @FXML
    private Text calisanNo;

    @FXML
    private TextField calisann;

    @FXML
    private TextField eMaill;

    @FXML
    private Text fiyat;

    @FXML
    private TextField sifree1;

    @FXML
    private TextField sifree2;

    @FXML
    private TextField soyadd;

    @FXML
    private TextField tcNoo;

    @FXML
    private TextField telNoo;

    @FXML
    private TextField urunKaydiBarkodNumarasi;

    @FXML
    private TextField urunKaydiUrunAdi;

    @FXML
    private ListView<?> yetkiliSiparisKontrol;

    @FXML
    private Tab yetkiliSiparisTakip;

    @FXML
    private TableColumn<?, ?> yetkiliUrunBarkodNo;

    @FXML
    private TableColumn<?, ?> yetkiliUrunFiyat;

    @FXML
    private Tab yetkiliUrunKaydi;

    @FXML
    private TableColumn<?, ?> yetkiliUrunStok;

    @FXML
    private Tab yetkiliUrunTakip;

    @FXML
    private TableColumn<?, ?> yetkiliUrunTedarikciId;

    @FXML
    private TableColumn<?, ?> yetkiliUrunUrunAdi;

////////////////////////////////////////////
}
