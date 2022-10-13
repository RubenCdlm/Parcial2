package com.example.appdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

     private TextView prod2;
     private TextView prod6;
     private TextView prod8;
     private TextView prod11;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        prod2 = (TextView) findViewById(R.id.prod2);
        prod6 = (TextView) findViewById(R.id.prod6);
        prod8 = (TextView) findViewById(R.id.prod8);
        prod11 = (TextView) findViewById(R.id.prod11);


        Bundle objEnviado = getIntent().getExtras();
        Usuario user = null;



        if(objEnviado != null){
            user = (Usuario) objEnviado.getSerializable("usuario");






        }

    }

    public void regresar(View view){
        finish();
    }
}