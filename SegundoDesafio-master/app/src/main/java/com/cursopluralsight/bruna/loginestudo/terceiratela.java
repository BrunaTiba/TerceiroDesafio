package com.cursopluralsight.bruna.loginestudo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class terceiratela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiratela);
    }

    public void irtelalogado (View view){
        Intent intent4 = new Intent(getApplicationContext(), superMarket.class);
        startActivity(intent4);
    }
}
