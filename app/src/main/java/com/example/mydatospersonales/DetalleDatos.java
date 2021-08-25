package com.example.mydatospersonales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DetalleDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_datos);

        Bundle parametros = getIntent().getExtras();
        CharSequence nombrecito = parametros.getCharSequence("Nombre");
        CharSequence telefonito = parametros.getCharSequence("Telefono");
        CharSequence correito = parametros.getCharSequence("Email");
        CharSequence descrip = parametros.getCharSequence("Desc");
        CharSequence fechitita = parametros.getCharSequence("Fechita");


        TextView Name = (TextView) findViewById(R.id.tvNombreDetalle);
        Name.setText(nombrecito);
        TextView tel = (TextView) findViewById(R.id.tvTelefonoDetalle);
        tel.setText(telefonito);
        TextView correo = (TextView) findViewById(R.id.tvEmailDetalle);
        correo.setText(correito);
        TextView descripc = (TextView) findViewById(R.id.tvDescDetalle);
        descripc.setText(descrip);
        TextView fec = (TextView) findViewById(R.id.tvFechaDetalle);
        fec.setText(fechitita);

    }
}