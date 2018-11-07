package com.grupo1.puceeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moodle_button = findViewById(R.id.aulavirtual);
        Button biblioteca_button = findViewById(R.id.biblioteca);
        Button intranet_button = findViewById(R.id.intranet);
        Button ubicacion_button = findViewById(R.id.ubicacion);
        ImageView congreso_imgView = findViewById(R.id.congreso);

        moodle_button.setOnClickListener(this);
        biblioteca_button.setOnClickListener(this);
        intranet_button.setOnClickListener(this);
        ubicacion_button.setOnClickListener(this);
        congreso_imgView.setOnClickListener(this);


    }



    @Override
    public void onClick(View view) {
        Class activityObjetivo = null;

        switch (view.getId()) {
            case R.id.aulavirtual:
                activityObjetivo = AulaVirtual.class;
                break;
            case R.id.biblioteca:
                activityObjetivo = Biblioteca.class;
                break;
            case R.id.intranet:
                activityObjetivo = Intranet.class;
                break;
            case R.id.ubicacion:
                activityObjetivo = Ubicacion.class;
                break;

            case R.id.congreso:
                activityObjetivo = Congreso.class;
                break;
        }

        Intent intent = new Intent(MainActivity.this, activityObjetivo);
        startActivity(intent);
    }


    private void ir_a_actividad(Class actividadDestino) {
        startActivity(new Intent(this, actividadDestino));
    }

}
