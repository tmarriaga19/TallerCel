package com.tmarriaga.tallercel;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class listado extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<celular> celulares;
    private String marca[];
    private String color[];
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        tabla = findViewById(R.id.tabla);
        celulares = datos.obtener();

        recursos = this.getResources();

        marca = recursos.getStringArray(R.array.listamarca);
        color = recursos.getStringArray(R.array.listacolor);

        for (int i = 0; i < celulares.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+(i + 1));
            c2.setText(marca[celulares.get(i).getMarca()]);
            c3.setText(color[celulares.get(i).getColor()]);
            c4.setText(""+(celulares.get(i).getPrecio()));

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);
        }

    }
}
