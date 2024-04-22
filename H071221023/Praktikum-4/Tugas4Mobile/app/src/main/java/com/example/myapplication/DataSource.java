package com.example.myapplication;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("lautaromartinez","Intermilan"
                ,"Vittoria molto importante.Avanti Inter!!! #ForzaInter"
                ,R.drawable.lautaro,R.drawable.lautaro));

        instagrams1.add(new Instagram("emil_audero", "Intermilan"
                ,"my first debut at inter milan"
                ,R.drawable.emil,R.drawable.emil));

        instagrams1.add(new Instagram("benpavard21", "Intermilan"
                ,"INSIEME"
                ,R.drawable.pavard, R.drawable.pavard));

        instagrams1.add((new Instagram("hakancalhanoglu","Intermilan"
                ,"Stay focused, stay determined"
                ,R.drawable.hakan,R.drawable.hakan)));

        instagrams1.add(new Instagram("ddumfries2", "Intermilan"
                ,"Hard fought team win. We keep going!"
                ,R.drawable.dum,R.drawable.dum));

        instagrams1.add(new Instagram("thuram","Intermilan"
                ,"Un ultimo passo"
                ,R.drawable.thuram, R.drawable.thuram));

        instagrams1.add(new Instagram("alessandrobastoni","Intermilan"
                , "First half done"
                ,R.drawable.bastoni,R.drawable.bastoni));

        instagrams1.add(new Instagram("matteodarmian36","Intermilan"
                ,"Una vittoria da mettere sotto l'albero"
                ,R.drawable.darmian, R.drawable.darmian));

        instagrams1.add(new Instagram("federicodimarco", "Intermilan"
                ,"We don't need words"
                ,R.drawable.marco, R.drawable.marco));

        instagrams1.add(new Instagram("cuadrado", "Intermilan"
                ,"Buona la prima, avanti cosi"
                ,R.drawable.cuadrado, R.drawable.cuadrado));
        return instagrams1;
    }
}
