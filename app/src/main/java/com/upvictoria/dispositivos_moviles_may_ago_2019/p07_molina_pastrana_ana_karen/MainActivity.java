package com.upvictoria.dispositivos_moviles_may_ago_2019.p07_molina_pastrana_ana_karen;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder ADX; // Alert Builder
    AlertDialog AD; // ALert Dialog


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ADX = new AlertDialog.Builder(this);
        AD = ADX.create();

        Button btn1 = (Button) findViewById(R.id.button11);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), DragActivity.class);
                startActivityForResult(intent2, 0);
            }
        });

        Button btn2 = (Button) findViewById(R.id.button22);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), DragActivity2.class);
                startActivityForResult(intent2, 0);
            }
        });

        Button btn3 = (Button) findViewById(R.id.info);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AD.setMessage("Esta aplicación fue desarrollada por\n" +
                        "María Fernanada Baez Zapata,\n" +
                        "Ana Karen Molina Pastrana y\n" +
                        "Linda Margarita Rodríguez Terán.\n" +
                        "Cómputo en Dispositivos Móviles\n" +
                        "Universidad Politécnica de Victoria\n" +
                        "Agosto de 2019");
                AD.show();
            }
        });

    }
}
