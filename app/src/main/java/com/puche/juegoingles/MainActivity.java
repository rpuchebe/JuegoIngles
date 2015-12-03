package com.puche.juegoingles;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.LogInCallback;
import com.parse.ParseUser;
import com.puche.juegoingles2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name;
    EditText pass;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.User);
        pass = (EditText) findViewById(R.id.Pass);
        boton = (Button) findViewById(R.id.boton);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.NewUser);
        floatingActionButton.setOnClickListener(this);
        boton.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu Menu) {
        // Inflate the Menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, Menu);
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
    public void onClick(final View view) {

        switch (view.getId()) {

            case R.id.boton:


                if (name.getText().toString().trim().length() == 0) {

                    Snackbar.make(view, "Porfavor introduzca su nombre", Snackbar.LENGTH_SHORT).show();

                } else {

                    if (pass.getText().toString().trim().length() == 0) {

                        Snackbar.make(view, "Porfavor introduzca su contraseña", Snackbar.LENGTH_SHORT).show();

                    } else {
                        final String Usuario = name.getText().toString();
                        final String Password = pass.getText().toString();
                        if (Usuario == "Augusto") {
                            Intent intent = new Intent(MainActivity.this, Teacher.class);
                            intent.putExtra("USER", Usuario);
                            startActivity(intent);
                        } else {

                            ParseUser.logInInBackground(Usuario, Password, new LogInCallback() {
                                @Override
                                public void done(ParseUser user, com.parse.ParseException e) {
                                    if (user != null) {
                                        if (Usuario.equals("Augusto")){
                                            Intent intent = new Intent(MainActivity.this, Teacher.class);
                                            intent.putExtra("USER", Usuario);
                                            startActivity(intent);
                                        }else {
                                            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                            String Usuario = name.getText().toString();
                                            intent.putExtra("USER", Usuario);
                                            startActivity(intent);
                                        }

                                    } else {
                                        Snackbar.make(view, "Usuario o Contraseña invalido", Snackbar.LENGTH_SHORT).show();
                                    }
                                }


                            });

                        }


                    }

                }
                break;
            case R.id.NewUser:

                Intent intent = new Intent(MainActivity.this, NewUser.class);
                startActivity(intent);

                break;
        }

    }

}
