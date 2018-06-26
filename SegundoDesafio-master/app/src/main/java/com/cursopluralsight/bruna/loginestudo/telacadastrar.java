package com.cursopluralsight.bruna.loginestudo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class telacadastrar extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacadastrar);

        final EditText nome = (EditText) findViewById(R.id.nomeCadastarEditText);
        final EditText senha = (EditText) findViewById(R.id.senhaCadastrarEditText);

        Button gravar = (Button) findViewById(R.id.btSalvar);
        gravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor ed= prefs.edit();

                ed.putString ("nome", nome.getText().toString());
                ed.putString ("senha", senha.getText().toString());

                ed.apply();
                Toast.makeText(getBaseContext(), "Cadastro realizado com sucesso", Toast.LENGTH_LONG).show();


            }
        });
        Button limpar = (Button) findViewById(R.id.btLimpar);
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nome.setText("");
                senha.setText("");
            }
        });
        Button recuperar = (Button) findViewById(R.id.btnRecuperar);
        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
                nome.setText(prefs.getString("nome", "Não tem"));
                senha.setText(prefs.getString("email", "Não tem"));
            }
        });




    }

    public void btVoltar (View view){
        Intent intent4 = new Intent(getApplicationContext(), telalogin.class);
        startActivity(intent4);
    }



    }

