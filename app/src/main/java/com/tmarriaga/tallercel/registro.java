package com.tmarriaga.tallercel;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class registro extends AppCompatActivity {

    private EditText precio;
    private Resources recursos;
    private Spinner marca_sp,color_sp;
    private String marca[],color[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        precio = findViewById(R.id.txtPrecio);
        recursos = this.getResources();

        marca_sp = findViewById(R.id.cmbMarca);
        marca = recursos.getStringArray(R.array.listamarca);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,marca);
        marca_sp.setAdapter(adapter);

        color_sp = findViewById(R.id.cmbColor);
        color = recursos.getStringArray(R.array.listacolor);
        ArrayAdapter<String> adapter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,color);
        color_sp.setAdapter(adapter1);
    }

    public boolean validar(){

        if (marca_sp.getSelectedItemPosition() <= 0) {
            marca_sp.requestFocus();
            Toast.makeText(this,getResources().getString(R.string.error_numero2),Toast.LENGTH_SHORT).show();
            return false;
        }

        if (color_sp.getSelectedItemPosition() <= 0) {
            color_sp.requestFocus();
            Toast.makeText(this,getResources().getString(R.string.error_numero2),Toast.LENGTH_SHORT).show();
            return false;
        }

        if (precio.getText().toString().isEmpty() ){
            precio.requestFocus();
            precio.setError(recursos.getString(R.string.error_numero1));
            return false;
        }

        if ( Double.parseDouble(precio.getText().toString()) <= 0 ){
            precio.requestFocus();
            precio.setError(recursos.getString(R.string.error_numero1));
            return false;
        }

        return  true;
    }

    public void guardar(View v){

        if (validar()) {
            int opmarca, opcolor;
            double opprecio;

            opmarca = marca_sp.getSelectedItemPosition();
            opcolor = color_sp.getSelectedItemPosition();
            opprecio = Double.parseDouble(precio.getText().toString());

            celular c = new celular(opmarca,opcolor,opprecio);
            c.guardar();
            Toast.makeText(this,getResources().getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();
            borrar();
        }
    }

    public void limpiar(View v){
        borrar();
    }

    public void  borrar (){
        precio.setText("");
        marca_sp.setSelection(0);
        color_sp.setSelection(0);
    }

}
