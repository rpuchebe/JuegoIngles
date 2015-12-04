package com.puche.juegoingles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.ParseObject;
import com.puche.juegoingles2.R;

public class NewCurso extends AppCompatActivity implements View.OnClickListener{
    CheckBox a, b, c, d, ec, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    Button save;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_curso);
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(this);
        edittext = (EditText) findViewById(R.id.cursoname);
        a = (CheckBox) findViewById(R.id.checkBox);
        b = (CheckBox) findViewById(R.id.checkBox2);
        c = (CheckBox) findViewById(R.id.checkBox3);
        d = (CheckBox) findViewById(R.id.checkBox4);
        ec = (CheckBox) findViewById(R.id.checkBox5);
        f = (CheckBox) findViewById(R.id.checkBox6);
        g = (CheckBox) findViewById(R.id.checkBox7);
        h = (CheckBox) findViewById(R.id.checkBox8);
        i = (CheckBox) findViewById(R.id.checkBox9);
        j = (CheckBox) findViewById(R.id.checkBox10);
        k = (CheckBox) findViewById(R.id.checkBox11);
        l = (CheckBox) findViewById(R.id.checkBox12);
        m = (CheckBox) findViewById(R.id.checkBox13);
        n = (CheckBox) findViewById(R.id.checkBox14);
        o = (CheckBox) findViewById(R.id.checkBox15);
        p = (CheckBox) findViewById(R.id.checkBox16);
        q = (CheckBox) findViewById(R.id.checkBox17);
        r = (CheckBox) findViewById(R.id.checkBox18);
        s = (CheckBox) findViewById(R.id.checkBox19);
        t = (CheckBox) findViewById(R.id.checkBox20);
        u = (CheckBox) findViewById(R.id.checkBox21);
        v = (CheckBox) findViewById(R.id.checkBox22);
        w = (CheckBox) findViewById(R.id.checkBox23);
        x = (CheckBox) findViewById(R.id.checkBox24);
        y = (CheckBox) findViewById(R.id.checkBox25);
        z = (CheckBox) findViewById(R.id.checkBox26);

    }

    public void crear(){


        ParseObject gameScore = new ParseObject("Curso");
        String Id = edittext.getText().toString();
        gameScore.put("CursoId", Id);
        if (a.isChecked() == true) {
            gameScore.put("a", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("a", false);
            gameScore.saveInBackground();

        }
        if (b.isChecked() == true) {
            gameScore.put("b", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("b", false);
            gameScore.saveInBackground();

        }if (c.isChecked() == true) {
            gameScore.put("c", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("c", false);
            gameScore.saveInBackground();

        }if (d.isChecked() == true) {
            gameScore.put("d", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("d", false);
            gameScore.saveInBackground();

        }if (ec.isChecked() == true) {
            gameScore.put("e", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("e", false);
            gameScore.saveInBackground();

        }if (f.isChecked() == true) {
            gameScore.put("f", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("f", false);
            gameScore.saveInBackground();

        }if (g.isChecked() == true) {
            gameScore.put("g", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("g", false);
            gameScore.saveInBackground();

        }if (h.isChecked() == true) {
            gameScore.put("h", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("h", false);
            gameScore.saveInBackground();

        }if (i.isChecked() == true) {
            gameScore.put("i", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("i", false);
            gameScore.saveInBackground();

        }if (j.isChecked() == true) {
            gameScore.put("j", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("j", false);
            gameScore.saveInBackground();

        }if (k.isChecked() == true) {
            gameScore.put("k", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("k", false);
            gameScore.saveInBackground();

        }if (l.isChecked() == true) {
            gameScore.put("l", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("l", false);
            gameScore.saveInBackground();

        }if (m.isChecked() == true) {
            gameScore.put("m", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("m", false);
            gameScore.saveInBackground();

        }if (n.isChecked() == true) {
            gameScore.put("n", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("n", false);
            gameScore.saveInBackground();

        }if (o.isChecked() == true) {
            gameScore.put("o", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("o", false);
            gameScore.saveInBackground();

        }if (p.isChecked() == true) {
            gameScore.put("p", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("p", false);
            gameScore.saveInBackground();

        }if (q.isChecked() == true) {
            gameScore.put("q", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("q", false);
            gameScore.saveInBackground();
        }if (r.isChecked() == true) {
            gameScore.put("r", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("r", false);
            gameScore.saveInBackground();

        }if (s.isChecked() == true) {
            gameScore.put("s", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("s", false);
            gameScore.saveInBackground();

        }if (t.isChecked() == true) {
            gameScore.put("t", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("t", false);
            gameScore.saveInBackground();

        }if (u.isChecked() == true) {
            gameScore.put("u", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("u", false);
            gameScore.saveInBackground();

        }if (v.isChecked() == true) {
            gameScore.put("v", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("v", false);
            gameScore.saveInBackground();

        }if (w.isChecked() == true) {
            gameScore.put("w", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("w", false);
            gameScore.saveInBackground();

        }
        if (x.isChecked() == true) {
            gameScore.put("x", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("x", false);
            gameScore.saveInBackground();

        }if (y.isChecked() == true) {
            gameScore.put("y", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("y", false);
            gameScore.saveInBackground();

        }if (z.isChecked() == true) {
            gameScore.put("z", true);
            gameScore.saveInBackground();
        } else {
            gameScore.put("z", false);
            gameScore.saveInBackground();

        }




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.save:

                if (edittext.getText().toString().trim().length() == 0) {

                    Snackbar.make(v, "Porfavor introduzca el nombre del curso", Snackbar.LENGTH_SHORT).show();

                } else {
                    crear();
                }
                Intent intent = new Intent(NewCurso.this, Teacher.class);
                startActivity(intent);
                break;


        }

    }
}
