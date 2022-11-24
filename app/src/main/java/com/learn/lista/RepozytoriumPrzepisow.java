package com.learn.lista;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    public  static Przepis[] przepisy = {
            new Przepis("mufinki",3,"mąka,cukier,mleko,kakao",R.drawable.indeks),
            new Przepis("pierniki",3,"mąka,cukier,mleko,kakao,miód",R.drawable.images),
            new Przepis("ptyś",3,"mąka,cukier,mleko,kakao",R.drawable.indeks1),
            new Przepis("gofry",2,"mąka,cukier,mleko,jajko", R.drawable.gofry),
            new Przepis("lody",2,"cukier,śmietana,jajko",R.drawable.lody)
    };
    public static ArrayList<Przepis> wybierz(int kat){
        ArrayList<Przepis> lista = new ArrayList<>();
        for (Przepis przepis: przepisy){
            if (przepis.getId_p() == kat){
                lista.add(przepis);
            }
        }
        return lista;
    }
}
