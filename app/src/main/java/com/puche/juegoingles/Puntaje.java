package com.puche.juegoingles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.puche.juegoingles2.R;

public class Puntaje extends AppCompatActivity implements View.OnClickListener{
    TextView puntaje;
    Button newgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntaje);
        puntaje = (TextView) findViewById(R.id.puntaje);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {

            String dato = extras.getString("Puntaje");
            puntaje.setText(dato);
        }

        newgame = (Button) findViewById(R.id.newgame);
        newgame.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.newgame:

                Intent intent = new Intent(Puntaje.this,SecondActivity.class);
                Intent intent2 =getIntent();
                Bundle extras = intent.getExtras();

                if(extras!=null){

                    String dato = extras.getString("USER");
                    intent.putExtra("USER",dato);
                }

                startActivity(intent);

                break;
        }

    }
}
