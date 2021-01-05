package Bolum_11_Generics;

public class GenericsDersi {
    public static void main(String[] args) {
        String[] Adlar={"Emilia","Emil"};
        Integer[] reqemler={1,2,3,4,5,6};
        Character[] herifler={'a','s','d','f','g','h'};

        Generic_Dizi_Yazdir<String> stringGeneric_dizi_yazdir=new Generic_Dizi_Yazdir<>();
        stringGeneric_dizi_yazdir.yazdir(Adlar);
        Generic_Dizi_Yazdir<Integer> integerGeneric_dizi_yazdir=new Generic_Dizi_Yazdir<>();
        integerGeneric_dizi_yazdir.yazdir(reqemler);
        Generic_Dizi_Yazdir<Character>  characterGeneric_dizi_yazdir = new Generic_Dizi_Yazdir<>();
        characterGeneric_dizi_yazdir.yazdir(herifler);



        /* String_Dizi_Yazdir.yazdir(Adlar);
        System.out.println("\n");
        IntegerDiziYAzdir.yazdir(reqemler);
        System.out.println("\n");
        Char_Dizi_yazdir.yazdir(herifler); */

    }
}
