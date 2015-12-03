package com.puche.juegoingles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseUser;
import com.parse.SignUpCallback;
import com.puche.juegoingles2.R;

public class NewUser extends AppCompatActivity implements View.OnClickListener{
    EditText name;
    EditText pass;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        name = (EditText) findViewById(R.id.User);
        pass = (EditText) findViewById(R.id.Pass);
        boton = (Button) findViewById(R.id.boton);
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

        switch (view.getId()){

            case R.id.boton:


                if (name.getText().toString().trim().length() == 0)
                {
                    Snackbar.make(view, "Porfavor introduzca su nombre", Snackbar.LENGTH_SHORT).show();

                }
                else {
                        String usuario = name.getText().toString();
                        String clave = pass.getText().toString();
                      ParseUser user = new ParseUser();
                      user.setUsername(usuario);
                      user.setPassword(clave);
                      user.signUpInBackground(new SignUpCallback() {
                          @Override
                          public void done(com.parse.ParseException e) {
                              if (e == null) {
                                  Snackbar.make(view, "Usuario Creado", Snackbar.LENGTH_SHORT).show();
                                  Intent intent = new Intent(NewUser.this, SecondActivity.class);
                                  String Usuario = name.getText().toString();
                                  intent.putExtra("USER", Usuario);
                                  startActivity(intent);
                              } else {
                                  Snackbar.make(view, "Error en la creacion", Snackbar.LENGTH_SHORT).show();
                              }
                          }

                      });

                }
                break;

        }

    }

}
