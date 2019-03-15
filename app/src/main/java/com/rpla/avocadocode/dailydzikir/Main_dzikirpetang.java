package com.rpla.avocadocode.dailydzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Main_dzikirpetang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dzikirpetang);


        final String[] arabpetArray = {"أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيم",
                "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
                "سْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" +
                        " قُلْ هُوَ اللَّهُ أَحَدٌ  اللَّهُ الصَّمَدُ  لَمْ يَلِدْ وَلَمْ يُولَدْ  وَلَمْ يَكُن لَّهُ كُفُوًا أَحَد",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" +
                        " قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ  مِن شَرِّ مَا خَلَق َ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ  وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ   وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" +
                        " قُلْ أَعُوذُ بِرَبِّ النَّاس ِ مَلِكِ النَّاسِ  إِلَهِ النَّاسِ  مِن شَرِّ الْوَسْوَاسِ  الْخَنَّاسِ الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ مِنَ الْجِنَّةِ وَ النَّاسِ",
                "Qatar",
                "Palestina",
                "Palestina",
                "Palestina",
                "Palestina",
                "Palestina",
                "Palestina",
                "Palestina",
                "Uni Emirat Arab" };

        String[] dibacapetArray = {
                " ",
                "DIBACA 1X",
                "DIBACA 3X",
                "DIBACA 3X",
                "DIBACA 3X",
                "Doha",
                "Doha",
                "Doha",
                "Doha",
                "Doha",
                "Doha",
                "Doha",
                "Baitul Maqdis (kotanya seluruh umat islam)",
                "Abu Dhabi" };

        String[] artipetArray = {
                "“Aku berlindung kepada Allah dari godaan syaitan yang terkutuk”",
                "“Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar.” (QS. Al Baqarah: 255)",
                "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” (QS. Al Ikhlas: 1-4)",
                "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki”. (QS. Al Falaq: 1-5)",
                "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia.” (QS. An Naas: 1-6)",
                "Doha",
                "Doha",
                "Doha",
                "Doha",
                "Doha",
                "Doha",
                "Doha",
                "Baitul Maqdis (kotanya seluruh umat islam)",
                "Abu Dhabi"};


        ListView listView;
        CustomListAdapterDpet whatever = new CustomListAdapterDpet(this, arabpetArray, dibacapetArray, artipetArray);
        listView = (ListView) findViewById(R.id.ListViewIDpet);
        listView.setAdapter(whatever);

    }

    public void btn_homepetang(View view) {
        Intent i = new Intent(Main_dzikirpetang.this, MainActivity.class);
        startActivity(i);

    }
}
