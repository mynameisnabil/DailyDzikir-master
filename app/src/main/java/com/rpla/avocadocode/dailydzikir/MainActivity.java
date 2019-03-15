package com.rpla.avocadocode.dailydzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void btn_dzikirpagi(View view) {
        Intent i = new Intent(MainActivity.this, Main_dzikirpagi.class);
        startActivity(i);

    }

    public void btn_dzikirpetang(View view) {
        Intent i = new Intent(MainActivity.this, Main_dzikirpetang.class);
        startActivity(i);

    }

    public void btn_dzikirtidur(View view) {
        Intent i = new Intent(MainActivity.this, Main_dzikirtidur.class);
        startActivity(i);

    }


}

