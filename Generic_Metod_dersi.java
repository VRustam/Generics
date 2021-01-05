package Bolum_11_Generics;

public class Generic_Metod_dersi {
    public static void main(String[] args) {
        String[] Adlar={"Emilia","Emil"};
        Integer[] reqemler={1,2,3,4,5,6};
        Character[] herifler={'a','s','d','f','g','h'};

        deyisenyazdir(Adlar);
        deyisenyazdir(reqemler);
        deyisenyazdir(herifler);
        Nomreyazan(reqemler);
        Herihyazan(Adlar);



    }

    public static void deyisenyazdir(Object[] deyisen){
        for(Object gecici : deyisen){
            System.out.println(gecici);
        }
    }

  /*  public static void stringDiziyazdir(String[] deyisen){
        for(String gecici : deyisen){
            System.out.println(gecici);
        }
    }*/


    public static <Esas extends Number> void Nomreyazan(Esas [] deyisgen){
        for(Esas gecici : deyisgen){
            System.out.println(gecici.intValue());
        }
    }

    public static <Esas extends CharSequence> void Herihyazan(Esas [] deyisgen){
        for(Esas gecici : deyisgen){
            System.out.println(gecici.length());
        }
    }
}
