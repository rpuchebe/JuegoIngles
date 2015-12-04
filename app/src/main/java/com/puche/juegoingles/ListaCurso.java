package com.puche.juegoingles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.puche.juegoingles2.R;

import java.util.List;

public class ListaCurso extends AppCompatActivity implements View.OnClickListener {

    CheckBox a, b, c, d, ec, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    Button save;
    Button students;
    TextView cursoname;
    String idtemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_curso);
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(this);
        students = (Button) findViewById(R.id.students);
        students.setOnClickListener(this);
        cursoname = (TextView) findViewById(R.id.cursoname);
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

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {

            String dato = extras.getString("CursoId");
            cursoname.setText(dato);
        }
        check();

    }

    public void check() {

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Curso");
        query.whereEqualTo("CursoId", cursoname.getText().toString());
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> curso, ParseException e) {

                if (e == null) {

                    ParseObject ps = curso.get(0);
                    Boolean al = ps.getBoolean("a");
                    Boolean bl = ps.getBoolean("b");
                    Boolean cl = ps.getBoolean("c");
                    Boolean dl = ps.getBoolean("d");
                    Boolean el = ps.getBoolean("e");
                    Boolean fl = ps.getBoolean("f");
                    Boolean gl = ps.getBoolean("g");
                    Boolean hl = ps.getBoolean("h");
                    Boolean il = ps.getBoolean("i");
                    Boolean jl = ps.getBoolean("j");
                    Boolean kl = ps.getBoolean("k");
                    Boolean ll = ps.getBoolean("l");
                    Boolean ml = ps.getBoolean("m");
                    Boolean nl = ps.getBoolean("n");
                    Boolean ol = ps.getBoolean("o");
                    Boolean pl = ps.getBoolean("p");
                    Boolean ql = ps.getBoolean("q");
                    Boolean rl = ps.getBoolean("r");
                    Boolean sl = ps.getBoolean("s");
                    Boolean tl = ps.getBoolean("t");
                    Boolean ul = ps.getBoolean("u");
                    Boolean vl = ps.getBoolean("v");
                    Boolean wl = ps.getBoolean("w");
                    Boolean xl = ps.getBoolean("x");
                    Boolean yl = ps.getBoolean("y");
                    Boolean zl = ps.getBoolean("z");

                    if (al == true) {
                        a.setChecked(true);
                    } else {
                        a.setChecked(false);
                    }
                    if (bl == true) {
                        b.setChecked(true);
                    } else {
                        b.setChecked(false);
                    }
                    if (cl == true) {
                        c.setChecked(true);
                    } else {
                        c.setChecked(false);
                    }
                    if (dl == true) {
                        d.setChecked(true);
                    } else {
                        d.setChecked(false);
                    }
                    if (el == true) {
                        ec.setChecked(true);
                    } else {
                        ec.setChecked(false);
                    }
                    if (fl == true) {
                        f.setChecked(true);
                    } else {
                        f.setChecked(false);
                    }
                    if (gl == true) {
                        g.setChecked(true);
                    } else {
                        g.setChecked(false);
                    }
                    if (hl == true) {
                        h.setChecked(true);
                    } else {
                        h.setChecked(false);
                    }
                    if (il == true) {
                        i.setChecked(true);
                    } else {
                        i.setChecked(false);
                    }
                    if (jl == true) {
                        j.setChecked(true);
                    } else {
                        j.setChecked(false);
                    }
                    if (kl == true) {
                        k.setChecked(true);
                    } else {
                        k.setChecked(false);
                    }
                    if (ll == true) {
                        l.setChecked(true);
                    } else {
                        l.setChecked(false);
                    }
                    if (ml == true) {
                        m.setChecked(true);
                    } else {
                        m.setChecked(false);
                    }
                    if (nl == true) {
                        n.setChecked(true);
                    } else {
                        n.setChecked(false);
                    }
                    if (ol == true) {
                        o.setChecked(true);
                    } else {
                        o.setChecked(false);
                    }
                    if (pl == true) {
                        p.setChecked(true);
                    } else {
                        p.setChecked(false);
                    }
                    if (ql == true) {
                        q.setChecked(true);
                    } else {
                        q.setChecked(false);
                    }
                    if (rl == true) {
                        r.setChecked(true);
                    } else {
                        r.setChecked(false);
                    }
                    if (sl == true) {
                        s.setChecked(true);
                    } else {
                        s.setChecked(false);
                    }
                    if (tl == true) {
                        t.setChecked(true);
                    } else {
                        t.setChecked(false);
                    }
                    if (ul == true) {
                        u.setChecked(true);
                    } else {
                        u.setChecked(false);
                    }
                    if (vl == true) {
                        v.setChecked(true);
                    } else {
                        v.setChecked(false);
                    }
                    if (wl == true) {
                        w.setChecked(true);
                    } else {
                        w.setChecked(false);
                    }
                    if (xl == true) {
                        x.setChecked(true);
                    } else {
                        x.setChecked(false);
                    }
                    if (yl == true) {
                        y.setChecked(true);
                    } else {
                        y.setChecked(false);
                    }
                    if (zl == true) {
                        z.setChecked(true);
                    } else {
                        z.setChecked(false);
                    }

                }
            }

        });

    }

    public void save() {

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Curso");
        query.whereEqualTo("CursoId", cursoname.getText().toString());
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> curso, ParseException e) {

                if (e == null) {

                    ParseObject tempo = curso.get(0);
                    idtemp = tempo.getString("objectId");

                }

            }
        });

        ParseQuery<ParseObject> query1 = ParseQuery.getQuery("Curso");
        query1.getInBackground(idtemp, new GetCallback<ParseObject>() {
            public void done(ParseObject object, ParseException e) {
                if (e == null)

                {
                    if (a.isChecked() == true) {
                        object.put("a", true);
                        object.saveInBackground();
                    } else {
                        object.put("a", false);
                        object.saveInBackground();

                    }
                    if (b.isChecked() == true) {
                        object.put("b", true);
                        object.saveInBackground();
                    } else {
                        object.put("b", false);
                        object.saveInBackground();

                    }
                    if (c.isChecked() == true) {
                        object.put("c", true);
                        object.saveInBackground();
                    } else {
                        object.put("c", false);
                        object.saveInBackground();

                    }
                    if (d.isChecked() == true) {
                        object.put("d", true);
                        object.saveInBackground();
                    } else {
                        object.put("d", false);
                        object.saveInBackground();

                    }
                    if (ec.isChecked() == true) {
                        object.put("e", true);
                        object.saveInBackground();
                    } else {
                        object.put("e", false);
                        object.saveInBackground();

                    }
                    if (f.isChecked() == true) {
                        object.put("f", true);
                        object.saveInBackground();
                    } else {
                        object.put("f", false);
                        object.saveInBackground();

                    }
                    if (g.isChecked() == true) {
                        object.put("g", true);
                        object.saveInBackground();
                    } else {
                        object.put("g", false);
                        object.saveInBackground();

                    }
                    if (h.isChecked() == true) {
                        object.put("h", true);
                        object.saveInBackground();
                    } else {
                        object.put("h", false);
                        object.saveInBackground();

                    }
                    if (k.isChecked() == true) {
                        object.put("k", true);
                        object.saveInBackground();
                    } else {
                        object.put("k", false);
                        object.saveInBackground();

                    }
                    if (l.isChecked() == true) {
                        object.put("l", true);
                        object.saveInBackground();
                    } else {
                        object.put("l", false);
                        object.saveInBackground();

                    }
                    if (m.isChecked() == true) {
                        object.put("m", true);
                        object.saveInBackground();
                    } else {
                        object.put("m", false);
                        object.saveInBackground();

                    }
                    if (n.isChecked() == true) {
                        object.put("n", true);
                        object.saveInBackground();
                    } else {
                        object.put("n", false);
                        object.saveInBackground();

                    }
                    if (o.isChecked() == true) {
                        object.put("o", true);
                        object.saveInBackground();
                    } else {
                        object.put("o", false);
                        object.saveInBackground();

                    }
                    if (p.isChecked() == true) {
                        object.put("p", true);
                        object.saveInBackground();
                    } else {
                        object.put("p", false);
                        object.saveInBackground();

                    }
                    if (q.isChecked() == true) {
                        object.put("q", true);
                        object.saveInBackground();
                    } else {
                        object.put("q", false);
                        object.saveInBackground();

                    }
                    if (r.isChecked() == true) {
                        object.put("r", true);
                        object.saveInBackground();
                    } else {
                        object.put("r", false);
                        object.saveInBackground();

                    }
                    if (s.isChecked() == true) {
                        object.put("s", true);
                        object.saveInBackground();
                    } else {
                        object.put("s", false);
                        object.saveInBackground();

                    }
                    if (t.isChecked() == true) {
                        object.put("t", true);
                        object.saveInBackground();
                    } else {
                        object.put("t", false);
                        object.saveInBackground();

                    }
                    if (u.isChecked() == true) {
                        object.put("u", true);
                        object.saveInBackground();
                    } else {
                        object.put("u", false);
                        object.saveInBackground();

                    }
                    if (v.isChecked() == true) {
                        object.put("v", true);
                        object.saveInBackground();
                    } else {
                        object.put("v", false);
                        object.saveInBackground();

                    }
                    if (w.isChecked() == true) {
                        object.put("w", true);
                        object.saveInBackground();
                    } else {
                        object.put("w", false);
                        object.saveInBackground();

                    }
                    if (x.isChecked() == true) {
                        object.put("x", true);
                        object.saveInBackground();
                    } else {
                        object.put("x", false);
                        object.saveInBackground();

                    }
                    if (y.isChecked() == true) {
                        object.put("y", true);
                        object.saveInBackground();
                    } else {
                        object.put("y", false);
                        object.saveInBackground();

                    }
                    if (z.isChecked() == true) {
                        object.put("z", true);
                        object.saveInBackground();
                    } else {
                        object.put("z", false);
                        object.saveInBackground();

                    }

                }
            }
        });

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.save:

                save();
                Intent intent = new Intent(ListaCurso.this, Teacher.class);
                startActivity(intent);
                break;

            case R.id.students:

                intent = new Intent(ListaCurso.this, Student.class);
                String cursona = cursoname.getText().toString();
                intent.putExtra("CursoId", cursona);
                startActivity(intent);
                break;
        }

    }
}
