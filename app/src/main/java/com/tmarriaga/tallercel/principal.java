package com.tmarriaga.tallercel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class principal extends AppCompatActivity {

    private ListView lv;
    private String [] opc;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lv = findViewById(R.id.lstOpciones);
        opc = getResources().getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(principal.this,registro.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(principal.this,listado.class);
                        startActivity(in);
                        break;
                    case 2:
                        String rep4 =getResources().getString(R.string.mensaje_r4)+String.valueOf(datos.NumApple());
                        Toast.makeText(getApplicationContext(),rep4,Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        String rep5 =getResources().getString(R.string.mensaje_r5)+String.valueOf(datos.PromedioNokia());
                        Toast.makeText(getApplicationContext(),rep5,Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}
