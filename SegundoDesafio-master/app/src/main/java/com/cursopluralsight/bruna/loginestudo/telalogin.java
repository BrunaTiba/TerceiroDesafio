package com.cursopluralsight.bruna.loginestudo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class telalogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telalogin);

        SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
        //String nomeCadastro = prefs.getString("nome", null);
       // String senhaCadastro =prefs.getString("senha", null);
        if (prefs.getBoolean("logado", false)){
            Intent intent1 = new Intent(getApplicationContext(), superMarket.class);
            startActivity(intent1);
        }


    }

    public void btTelaLogin(View view) {
        TextView nomeEditText = (TextView) findViewById(R.id.nomeEditText);
        TextView senhaEditText = (TextView) findViewById(R.id.senhaEditText);
        String nome = nomeEditText.getText().toString();
        String senha = senhaEditText.getText().toString();

        SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed= prefs.edit();
        String nomeCadastro = prefs.getString("nome", null);
        String senhaCadastro =prefs.getString("senha", null);


        if (nome.equals(nomeCadastro) && senha.equals(senhaCadastro)) {
            ed.putBoolean("logado", true).apply();


            Intent intent1 = new Intent(getApplicationContext(), superMarket.class);
            startActivity(intent1);

        }else {

            AlertDialog AlertDialog;
            AlertDialog = new AlertDialog.Builder(this).create();
            AlertDialog.setTitle("Parabéns!!!");
            AlertDialog.setMessage("Login invalido");
            AlertDialog.show();

        }

    }



    public void btCadastrar (View view) {

        Intent intent3 = new Intent(getApplicationContext(), telacadastrar.class);

        startActivity(intent3);

    }

}