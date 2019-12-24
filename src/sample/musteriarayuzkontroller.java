package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.Main.*;
import static sample.Main.urunObjArrL;

//import static sample.Main.ara;


public class musteriarayuzkontroller {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField aramatext;

    @FXML
    private Button btnAra;

    @FXML
    private TextField c00;

    @FXML
    private TextField c01;

    @FXML
    private TextField c02;

    @FXML
    private TextField c10;

    @FXML
    private TextField c11;

    @FXML
    private TextField c12;

    @FXML
    private TextField c20;

    @FXML
    private TextField c21;

    @FXML
    private TextField c22;

    @FXML
    private TextField c30;

    @FXML
    private TextField c31;

    @FXML
    private TextField c32;

    @FXML
    private TextField c40;

    @FXML
    private TextField c41;

    @FXML
    private TextField c42;

    @FXML
    private TextField c50;

    @FXML
    private TextField c51;

    @FXML
    private TextField c52;

    @FXML
    private AnchorPane m00;

    @FXML
    private Tab musteriArayuzSepet;

    @FXML
    private Button sepetekle1;

    @FXML
    private Button sepetekle2;

    @FXML
    private Button sepetekle3;

    @FXML
    private Button sepetekle4;

    @FXML
    private Button sepetekle5;

    @FXML
    private Button sepetekle6;

    @FXML
    private Tab urunArayuzAra;

    @FXML
    private TextField uruntxt1;

    @FXML
    private TextField uruntxt2;

    @FXML
    private TextField uruntxt3;

    @FXML
    private TextField uruntxt4;

    @FXML
    private TextField uruntxt5;

    @FXML
    private TextField uruntxt6;


    public void search(ActionEvent actionEvent) throws Exception {
        //System.out.println("qqwqwqwq");
        String urunler="";
   /*     try{
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
*/
        // converting Urun.txt to objects


        String [] urunArr=urunler.split("\n");
        for(int i=0;i<urunArr.length;i++){       // splittin each item
            String tmp=urunArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            urunObjArrL.add(new Urun(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4]));

        }
        if(urunObjArrL.size()<=1){
            uruntxt1.setText(urunObjArrL.get(0).isim);
        }
        if(urunObjArrL.size()<=2){
            //  uruntxt1.setText(urunObjArrL.get(0).isim);
            uruntxt2.setText(urunObjArrL.get(1).isim);
        }
        if(urunObjArrL.size()<=3){
            //  uruntxt1.setText(urunObjArrL.get(0).isim);
            //  uruntxt2.setText(urunObjArrL.get(1).isim);
            uruntxt3.setText(urunObjArrL.get(2).isim);
        }

    }


    public void sepet1(ActionEvent actionEvent)throws Exception{
       // System.out.println("tikkkk");
        if (urunObjArrL.size() >= 1){
            c00.setText(urunObjArrL.get(0).barkod_no);
            c01.setText(urunObjArrL.get(0).isim);
            c02.setText(urunObjArrL.get(0).fyt);
            uruntxt1.setText(urunObjArrL.get(0).isim);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("uyari");
            alert.setHeaderText("hata");
            alert.setContentText("hic urun yok");
            alert.showAndWait();
        }

    }
    public void sepet2(ActionEvent actionEvent)throws Exception{
        if (urunObjArrL.size() >= 2){
            c10.setText(urunObjArrL.get(1).barkod_no);
            c11.setText(urunObjArrL.get(1).isim);
            c12.setText(urunObjArrL.get(1).fyt);
            uruntxt2.setText(urunObjArrL.get(1).isim);

        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("uyari");
            alert.setHeaderText("hata");
            alert.setContentText("2. urun yok");
            alert.showAndWait();
        }

    }
    public void sepet3(ActionEvent actionEvent)throws Exception{
        if (urunObjArrL.size() >= 3){
            c20.setText(urunObjArrL.get(2).barkod_no);
            c21.setText(urunObjArrL.get(2).isim);
            c22.setText(urunObjArrL.get(2).fyt);
            uruntxt3.setText(urunObjArrL.get(2).isim);
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("uyari");
            alert.setHeaderText("hata");
            alert.setContentText("3. urun yok");
            alert.showAndWait();
        }



    }

    public void sepet4(ActionEvent actionEvent)throws Exception{
        if (urunObjArrL.size() >= 4){
            c30.setText(urunObjArrL.get(3).barkod_no);
            c31.setText(urunObjArrL.get(3).isim);
            c32.setText(urunObjArrL.get(3).fyt);
            uruntxt4.setText(urunObjArrL.get(4).isim);
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("uyari");
            alert.setHeaderText("hata");
            alert.setContentText("3. urun yok");
            alert.showAndWait();
        }
    }


}
