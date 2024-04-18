package com.example.myapplication;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyUniversities();

    private static ArrayList<Instagram> generateDummyUniversities() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("_trismanttw_", "Thanks God", R.drawable.ttw, R.drawable.ttw, R.drawable.ttw,"2004", "23"));
        instagrams1.add(new Instagram("433", "Barcelona pull the victory over the line", R.drawable.empat, R.drawable.empat, R.drawable.empat, "10 JT", "900"));
        instagrams1.add(new Instagram("difaa.mr", "Minal Aidin Wal Faidzin", R.drawable.difa, R.drawable.difa, R.drawable.difa, "2004", "24"));
        instagrams1.add(new Instagram("atlantisfest", "First Wave Ticket will be gone, only 199 tickes left", R.drawable.atlantis, R.drawable.atlantis, R.drawable.atlantis, "10.5 K", "10"));
        instagrams1.add(new Instagram("himatika", "Queen Of Science, Bravo Himatika", R.drawable.himatika, R.drawable.himatika, R.drawable.himatika, "9876", "178"));
        instagrams1.add(new Instagram("info.akpol", "Katakan Aamiin!!!", R.drawable.akpol, R.drawable.akpol, R.drawable.akpol, "17.9 K", "263"));
        instagrams1.add(new Instagram("inter", "Matchday #InterCagliari", R.drawable.inter, R.drawable.inter, R.drawable.inter, "43 JT", "70"));
        instagrams1.add(new Instagram("dagelan", "Potret keluarga muslim sebelum salat eid be like:", R.drawable.dagelan, R.drawable.dagelan, R.drawable.dagelan, "3.5 JT", "1"));
        instagrams1.add(new Instagram("mks_info", "Iran resmi mulai menyerang Israel usai meluncurkan pesawat nirawak", R.drawable.mks, R.drawable.mks, R.drawable.mks, "12.3 K", "88"));
        instagrams1.add(new Instagram("unhas", "#UNHAS TAWWA", R.drawable.unhas, R.drawable.unhas, R.drawable.unhas, "20.2 K", "66"));
        return instagrams1;
    }
}
