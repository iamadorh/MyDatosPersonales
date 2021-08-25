package com.example.mydatospersonales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.DatePicker;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNombre = (EditText) findViewById(R.id.etNombre);
        EditText etPhone = (EditText) findViewById(R.id.etPhone);
        EditText etMail = (EditText) findViewById(R.id.etEmailAddress);
        EditText etDesc = (EditText) findViewById(R.id.etDesc);
        EditText etFechaNac= (EditText) findViewById(R.id.etFechaNac);

        Button btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalleDatos.class);
                intent.putExtra("Nombre", etNombre.getText());
                intent.putExtra("Telefono", etPhone.getText());
                intent.putExtra("Email", etMail.getText());
                intent.putExtra("Desc", etDesc.getText());
                intent.putExtra("Fechita", etFechaNac.getText());
                startActivity(intent);
            }


        });
    }

}