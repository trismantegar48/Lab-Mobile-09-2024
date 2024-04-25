package com.example.tugas5mobile;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("trisman", "Trisman Tegar Wiratama ", "Mathematics Event XXIV"
                ,R.drawable.me, R.drawable.me));

        instagrams1.add(new Instagram("difaa.mr", "Andi Naifah Mahardhika Rusdi", "Lagi di pantai"
                ,R.drawable.difa, R.drawable.difa));

        instagrams1.add(new Instagram("inter", "inter", "We still haven't stopped celebrating"
                ,R.drawable.inter, R.drawable.inter));

        instagrams1.add(new Instagram("jokowi", "Joko Widodo", "siapa yang mau sepeda?"
                ,R.drawable.jokowi, R.drawable.jokowi));

        instagrams1.add(new Instagram("pdiperjuangan", "DPP PDI Perjuangan", "terimakasih atas dukungan semua pihak"
                ,R.drawable.pdip, R.drawable.pdip));

        return instagrams1;

    }

}
