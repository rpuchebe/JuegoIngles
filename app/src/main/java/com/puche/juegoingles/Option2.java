package com.puche.juegoingles;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.puche.juegoingles2.R;

import java.util.List;
import java.util.Random;

public class Option2 extends Activity implements View.OnClickListener{

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    ImageView img;
    public int boton1;
    private String respuesta = "";
    private int puntuacion = 0;
    TextView texto;
    int red = Color.parseColor("#FF5722");
    int normal = Color.parseColor("#5D4037");
    int green = Color.parseColor("#00FFBF");


    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);
        img = (ImageView) findViewById(R.id.img);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        texto = (TextView) findViewById(R.id.texto);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.logout);
        floatingActionButton.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        Intent intent =getIntent();
        Bundle extras = intent.getExtras();
        if(extras!=null){

            String dato = extras.getString("USER");
            texto.setText(dato);
        }

        ParseQuery<ParseObject> query2 = ParseQuery.getQuery("attributes");
        query2.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> score, ParseException e) {

                if (e == null) {

                    int bot = 1;
                    int bot2 = 4;

                    Random t = new Random();
                    int btn = t.nextInt(bot2 - bot) + bot;
                    boton1 = btn;


                    int min = 1;
                    int max = 15;

                    Random r = new Random();
                    int random = r.nextInt(max - min + 1) + min;


                    ParseObject ps = score.get(random);

                    String pal = ps.getString("Palabra");
                    int Loc = getResources().getIdentifier(pal, "drawable", getPackageName());
                    img.setImageResource(Loc);

                    respuesta = pal;
                    if (boton1 == 1) {
                        btn1.setText(pal);
                    }
                    if (boton1 == 2) {
                        btn2.setText(pal);
                    }
                    if (boton1 == 3) {
                        btn3.setText(pal);
                    }
                    if (boton1 == 4) {
                        btn4.setText(pal);
                    }


                }

            }


        });


        ParseQuery<ParseObject> query = ParseQuery.getQuery("Falsos");
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> falses, ParseException e) {

                int f1 = 1;
                int f2 = 16;
                Random fake = new Random();
                int fakes = fake.nextInt(f2 - f1 + 1) + f1;
                int fakes2 = fake.nextInt(f2 - f1 + 1) + f1;
                int fakes3 = fake.nextInt(f2 - f1 + 1) + f1;


                ParseObject ps2 = falses.get(fakes);

                String pal2 = ps2.getString("Pal");


                ParseObject ps3 = falses.get(fakes2);

                String pal3 = ps3.getString("Pal");


                ParseObject ps4 = falses.get(fakes3);

                String pal4 = ps4.getString("Pal");


                btn2.setText(pal2);
                btn3.setText(pal3);
                btn4.setText(pal4);


                if (btn1.getText() != "") {


                    btn2.setText(pal2);
                    btn3.setText(pal3);
                    btn4.setText(pal4);

                }
                if (btn2.getText() != "") {
                    btn3.setText(pal2);
                    btn1.setText(pal3);
                    btn4.setText(pal4);
                }


                if (btn3.getText() != "") {
                    btn1.setText(pal2);
                    btn2.setText(pal3);
                    btn4.setText(pal4);

                }

            }
        });
    }
    public void random() {

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn1.setBackgroundColor(normal);
        btn2.setBackgroundColor(normal);
        btn3.setBackgroundColor(normal);
        btn4.setBackgroundColor(normal);


        ParseQuery<ParseObject> query2 = ParseQuery.getQuery("attributes");
        query2.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> score, ParseException e) {

                if (e == null) {

                    int bot = 1;
                    int bot2 = 4;

                    Random t = new Random();
                    int btn = t.nextInt(bot2 - bot) + bot;
                    boton1 = btn;


                    int min = 1;
                    int max = 14;

                    Random r = new Random();
                    int random = r.nextInt(max - min + 1) + min;


                    ParseObject ps = score.get(random);

                    String pal = ps.getString("Palabra");
                    int Loc = getResources().getIdentifier(pal, "drawable", getPackageName());
                    img.setImageResource(Loc);


                    respuesta = pal;

                    if (boton1 == 1) {
                        btn1.setText(pal);


                    }

                    if (boton1 == 2) {
                        btn2.setText(pal);
                    }
                    if (boton1 == 3) {
                        btn3.setText(pal);
                    }
                    if (boton1 == 4) {
                        btn4.setText(pal);
                    }


                }

            }


        });


        ParseQuery<ParseObject> query = ParseQuery.getQuery("Falsos");
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> falses, ParseException e) {

                int f1 = 1;
                int f2 = 15;
                Random fake = new Random();
                int fakes = fake.nextInt(f2 - f1 + 1) + f1;
                int fakes2 = fake.nextInt(f2 - f1 + 1) + f1;
                int fakes3 = fake.nextInt(f2 - f1 + 1) + f1;


                ParseObject ps2 = falses.get(fakes);

                String pal2 = ps2.getString("Pal");


                ParseObject ps3 = falses.get(fakes2);

                String pal3 = ps3.getString("Pal");


                ParseObject ps4 = falses.get(fakes3);

                String pal4 = ps4.getString("Pal");


                btn2.setText(pal2);
                btn3.setText(pal3);
                btn4.setText(pal4);


                if (btn1.getText() != "") {


                    btn2.setText(pal2);
                    btn3.setText(pal3);
                    btn4.setText(pal4);

                }
                if (btn2.getText() != "") {
                    btn3.setText(pal2);
                    btn1.setText(pal3);
                    btn4.setText(pal4);
                }


                if (btn3.getText() != "") {
                    btn1.setText(pal2);
                    btn2.setText(pal3);
                    btn4.setText(pal4);

                }

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_option2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn1:
                if (respuesta == btn1.getText()) {

                    btn1.setBackgroundColor(green);
                    Snackbar.make(v, "Good Job", Snackbar.LENGTH_SHORT).show();
                    random();

                } else {
                    btn1.setBackgroundColor(red);
                    Snackbar.make(v, "Keep Trying", Snackbar.LENGTH_SHORT).show();
                    random();
                }

                break;
            case R.id.btn2:
                if (respuesta == btn2.getText()) {

                    btn2.setBackgroundColor(green);
                    Snackbar.make(v, "Good Job", Snackbar.LENGTH_SHORT).show();
                    random();

                } else {
                    btn2.setBackgroundColor(red);
                    Snackbar.make(v, "Keep Trying", Snackbar.LENGTH_SHORT).show();
                    random();
                }

                break;
            case R.id.btn3:
                if (respuesta == btn3.getText()) {

                    btn3.setBackgroundColor(green);
                    Snackbar.make(v, "Good Job", Snackbar.LENGTH_SHORT).show();
                    random();

                } else {
                    btn3.setBackgroundColor(red);
                    Snackbar.make(v, "Keep Trying", Snackbar.LENGTH_SHORT).show();
                    random();
                }

                break;
            case R.id.btn4:
                if (respuesta == btn4.getText()) {

                    btn4.setBackgroundColor(green);
                    Snackbar.make(v, "Good Job", Snackbar.LENGTH_SHORT).show();
                    random();

                } else {
                    btn4.setBackgroundColor(red);
                    Snackbar.make(v, "Keep Trying", Snackbar.LENGTH_SHORT).show();
                    random();
                }

                break;
            case R.id.logout:

                Intent intent = new Intent(Option2.this,MainActivity.class);
                startActivity(intent);
                break;
        }

    }
}