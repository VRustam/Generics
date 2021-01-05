package Bolum_11_Generics;

public class Generic_Dizi_Yazdir <Gelenler>{
    public void yazdir(Gelenler[] ardicilliq) {

        for(Gelenler gecici:ardicilliq ){
            System.out.println(gecici);
        }

    }
}
