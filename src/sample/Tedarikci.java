package  sample;
import java.io.*;

public class Tedarikci implements interfaceMM {
private String isim;
private String teslimatSuresi;
private  String tedarikci_id;
public Tedarikci(String isim, String tedarikci_id, String teslimatSuresi){
    this.isim=isim;
    this.tedarikci_id=tedarikci_id;
    this.teslimatSuresi=teslimatSuresi;

}
    @Override
    public String getTedarikci_id(){
        return tedarikci_id;
    }

public String get_isim(){
        return isim;
    }

    public String getTeslimatSuresi(){
        return teslimatSuresi;
    }

}
