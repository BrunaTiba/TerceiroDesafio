package com.cursopluralsight.bruna.loginestudo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class superMarket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telalogado);
    }


    public void irTelalogin (View view){
        SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed= prefs.edit();
        ed.putBoolean("logado", false).apply();
        Intent intent2 = new Intent(getApplicationContext(), telalogin.class);
        startActivity(intent2);
    }

    public void irterceiratela (View view) {
        Intent intent3 = new Intent(getApplicationContext(), terceiratela.class);
        startActivity(intent3);
    }
}
