package com.puche.juegoingles;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.puche.juegoingles2.R;

import java.util.List;
import java.util.Random;

public class Option3 extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    int temp;
    ImageView img;
    Button btn;
    EditText editText;
    private String respuesta = "";
    int puntaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option3);
        img = (ImageView) findViewById(R.id.img);
        texto = (TextView) findViewById(R.id.texto);
        editText = (EditText) findViewById(R.id.editText2);

        btn = (Button) findViewById(R.id.submit);
        btn.setOnClickListener(this);
        Intent intent =getIntent();
        Bundle extras = intent.getExtras();
        temp = 0;
        puntaje = 0;
        if(extras!=null){

            String dato = extras.getString("USER");
            texto.setText(dato);
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.logout);
        floatingActionButton.setOnClickListener(this);
        next();

    }

    public void next() {

        ParseQuery<ParseObject> query2 = ParseQuery.getQuery("attributes");
        query2.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> score, ParseException e) {

                if (e == null) {

                    if (temp==15){


                        Intent intent = new Intent(Option3.this,Puntaje.class);
                        String puntajet = ""+puntaje;
                        ParseObject gameScore = new ParseObject("Puntaje");
                        String user = texto.getText().toString();
                        gameScore.put("user",user);
                        gameScore.put("score", puntaje);
                        gameScore.saveInBackground();
                        intent.putExtra("Puntaje",puntajet);
                        startActivity(intent);

                    }else {
                        ParseObject ps = score.get(temp);
                        String pal = ps.getString("Palabra");
                        int Loc = getResources().getIdentifier(pal, "drawable", getPackageName());
                        img.setImageResource(Loc);
                        respuesta = pal;
                    }
                }
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_option3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.submit:

                temp++;
                Snackbar.make(v, "test"+temp, Snackbar.LENGTH_SHORT).show();

                if (respuesta == editText.getText().toString()) {

                    Snackbar.make(v, "Good Job", Snackbar.LENGTH_SHORT).show();
                    puntaje++;
                    next();

                } else {

                    Snackbar.make(v, "Keep Trying", Snackbar.LENGTH_SHORT).show();
                    next();
                }

                break;

            case R.id.logout:

                Intent intent = new Intent(Option3.this,MainActivity.class);
                startActivity(intent);
                break;
        }

    }
}
