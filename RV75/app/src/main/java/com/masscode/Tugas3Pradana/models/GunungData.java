package com.masscode.Tugas3Pradana.models;

import java.util.ArrayList;

public class GunungData {

    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            // copy from my gits, link in description
            // this data from wikipedia
            {"Merapi",
                    "3000 mdpl",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Merapi_mountain.jpg/800px-Merapi_mountain.jpg",
                    "gunung berapi di bagian tengah Pulau Jawa dan merupakan salah satu gunung api teraktif di Indonesia.",
                    "Jawa Tengah"},
            {"Jayawijaya",
                    "4880 mdpl",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3f/Puncakjaya.jpg",
                    "Pegunungan Jayawijaya adalah rangkaian pegunungan yang membujur di Provinsi Papua, Indonesia. Pegunungan Jayawijaya adalah rangkaian pegunungan tertinggi di Indonesia, dengan puncak tertingginya yaitu Puncak Jaya (4.884 meter dari permukaan laut).",
                    "Papua"},
            {"Rinjani",
                    "3700 mdpl",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Savanna_Mt._Rinjani_5.JPG/800px-Savanna_Mt._Rinjani_5.JPG",
                    "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia",
                    "Lombok"},
            {"Merbabu",
                    "3100 mdpl",
                    "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/010109090101/gunung-pemula-8-1024x767.jpg",
                    "gunung api yang bertipe Strato (lihat Gunung Berapi) yang terletak secara geografis pada 7,5° LS dan 110,4° BT",
                    "Jawa Tengah"},
            {"Slamet",
                    "3400 mdpl",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Gunung_Slamet_dari_Kr_Salam.jpg/800px-Gunung_Slamet_dari_Kr_Salam.jpg",
                    "adalah sebuah gunung berapi kerucut yang terdapat di Pulau Jawa, Indonesia. Gunung Slamet terletak di antara 5 kabupaten.",
                    "Jawa Tengah"},
            {"Sindoro",
                    "3100 mdpl",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Mt_Sindoro_view_from_Mt_Sikunir.jpg/280px-Mt_Sindoro_view_from_Mt_Sikunir.jpg",
                    "Merupakan sebuah gunung volkano aktif yang terletak di Jawa Tengah, Indonesia, dengan Temanggung sebagai kota terdekat.",
                    "Jawa Tengah"},
            {"Lawu",
                    "8,167 m (26,795 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Lawu.jpg/280px-Lawu.jpg",
                    "Status gunung ini adalah gunung api istirahat (diperkirakan terahkir meletus pada tanggal 28 November 1885) dan telah lama tidak aktif, terlihat dari rapatnya vegetasi serta puncaknya yang tererosi.",
                    "Nepal"},

    };

    public static ArrayList<Gunung> getListData() {
        Gunung gunung;
        ArrayList<Gunung> list = new ArrayList<>();

        for (String[] gData : data) {
            gunung = new Gunung();
            gunung.setName(gData[0]);
            gunung.setElevation(gData[1]);
            gunung.setPhoto(gData[2]);
            gunung.setDescription(gData[3]);
            gunung.setLocation(gData[4]);

            list.add(gunung);
        }

        return list;
    }

}
