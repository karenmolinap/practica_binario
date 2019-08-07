package com.upvictoria.dispositivos_moviles_may_ago_2019.p07_molina_pastrana_ana_karen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

//import androidx.appcompat.app.AppCompatActivity;

public class Explicacion2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicacion2);

        ArrayList<TextView> texts = new ArrayList<>();
        ArrayList<TextView> texts1 = new ArrayList<>();
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        TextView tv4 = (TextView) findViewById(R.id.tv4);
        TextView tv5 = (TextView) findViewById(R.id.tv5);
        TextView tv6 = (TextView) findViewById(R.id.tv6);
        TextView tv7 = (TextView) findViewById(R.id.tv7);
        TextView tv8 = (TextView) findViewById(R.id.tv8);
        TextView tv9 = (TextView) findViewById(R.id.tv9);
        TextView tv10 = (TextView) findViewById(R.id.tv10);

        TextView TV1 = (TextView) findViewById(R.id.TV1);
        TextView TV2 = (TextView) findViewById(R.id.TV2);
        TextView TV3 = (TextView) findViewById(R.id.TV3);
        TextView TV4 = (TextView) findViewById(R.id.TV4);
        TextView TV5 = (TextView) findViewById(R.id.TV5);
        TextView TV6 = (TextView) findViewById(R.id.TV6);
        TextView TV7 = (TextView) findViewById(R.id.TV7);
        TextView TV8 = (TextView) findViewById(R.id.TV8);
        TextView TV9 = (TextView) findViewById(R.id.TV9);
        TextView TV10 = (TextView) findViewById(R.id.TV10);
        TextView TV = (TextView) findViewById(R.id.msje);
        TextView TV0 = (TextView) findViewById(R.id.x);
        TextView TV11 = (TextView) findViewById(R.id.x2);

        TV11.setText("% 2");
        TV0.setText(""+DragActivity.numerores);
        TV.setText("Resumen:\nEn los recuadros anteriores se muestra la relación entre las divisiones realizadas y " +
                "los residuos de cada modulo aplicado, al final de la división (cuando resta 1 o 0) se toman los valores " +
                "de abajo hacia arriba para obtener la conversión binaria, en este caso el resultado es: " + DragActivity.numerores);
        texts.add(TV1);
        texts.add(TV2);
        texts.add(TV3);
        texts.add(TV4);
        texts.add(TV5);
        texts.add(TV6);
        texts.add(TV7);
        texts.add(TV8);
        texts.add(TV9);
        texts.add(TV10);

        texts1.add(tv1);
        texts1.add(tv2);
        texts1.add(tv3);
        texts1.add(tv4);
        texts1.add(tv5);
        texts1.add(tv6);
        texts1.add(tv7);
        texts1.add(tv8);
        texts1.add(tv9);
        texts1.add(tv10);

        String[] arreglo = DragActivity.exp.split(" ");
        int numero = DragActivity.numerores;
        int a = 0;
        for (int i = 0;i<arreglo.length;i++){
            texts.get(i).setText(""+numero%2);
            numero= (int) Math.floor(numero/2);
            texts1.get(i).setText(""+ numero);

        }
        Button btn2 = (Button) findViewById(R.id.Volver);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), DragActivity.class);
                startActivity(intent2);
            }
        });

    }
}
