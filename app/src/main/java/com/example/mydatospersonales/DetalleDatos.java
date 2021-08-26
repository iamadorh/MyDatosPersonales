package com.example.mydatospersonales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button btnEditar = (Button) findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalleDatos.this, MainActivity.class);
                intent.putExtra("Nombre2", Name.getText());
                intent.putExtra("Telefono2", tel.getText());
                intent.putExtra("Email2", correo.getText());
                intent.putExtra("Desc2", descripc.getText());
                intent.putExtra("Fechita2", fec.getText());
                startActivity(intent);
            }


        });

    }
}