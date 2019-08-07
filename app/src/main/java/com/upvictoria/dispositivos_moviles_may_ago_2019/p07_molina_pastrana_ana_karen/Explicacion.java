package com.upvictoria.dispositivos_moviles_may_ago_2019.p07_molina_pastrana_ana_karen;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

//import androidx.appcompat.app.AppCompatActivity;

public class Explicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicacion);

        ArrayList<TextView> texts = new ArrayList<>();

        TextView TV1 = (TextView) findViewById(R.id.TV4);
        TextView TV2 = (TextView) findViewById(R.id.TV5);
        TextView TV3 = (TextView) findViewById(R.id.TV6);
        TextView TV4 = (TextView) findViewById(R.id.TV7);
        TextView TV5 = (TextView) findViewById(R.id.TV8);
        TextView TV = (TextView) findViewById(R.id.msje);
        TV.setText("Resumen:\nEn los recuadros anteriores se muestra la relación entre las potencias de la conversión " +
                "para obtener el resultado final se suman las cantidades correspondientes a las casillas que " +
                "tengan el número uno debajo de ellas, en este caso el resultado es: " + DragActivity2.numerores);
        texts.add(TV5);
        texts.add(TV4);
        texts.add(TV3);
        texts.add(TV2);
        texts.add(TV1);

        String[] arreglo = DragActivity2.exp.split(" ");
        int a = 0;
        for (int i = arreglo.length - 1;i>=0;i--){
            texts.get(a).setText(arreglo[i]);
            a++;
        }
        Button btn2 = (Button) findViewById(R.id.Volver);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), DragActivity2.class);
                startActivity(intent2);
            }
        });

    }
}
