package com.puche.juegoingles;
import java.util.List;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.puche.juegoingles2.R;

public class Teacher  extends AppCompatActivity implements View.OnClickListener {
    // Declare Variables
    ListView listview;
    List<ParseObject> ob;
    ProgressDialog mProgressDialog;
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from listview_main.xml
        setContentView(R.layout.activity_teacher);
        FloatingActionButton floatingActionButton1 = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton1.setOnClickListener(this);
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(R.id.logout);
        floatingActionButton2.setOnClickListener(this);
        // Execute RemoteDataTask AsyncTask
        new RemoteDataTask().execute();
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.fab:

                Intent intent = new Intent(Teacher.this,ListaCurso.class);
                startActivity(intent);
                break;
            case R.id.logout:

                intent = new Intent(Teacher.this,MainActivity.class);
                startActivity(intent);
                break;
        }

    }

    // RemoteDataTask AsyncTask
    private class RemoteDataTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Create a progressdialog
            mProgressDialog = new ProgressDialog(Teacher.this);
            // Set progressdialog title
            mProgressDialog.setTitle("Parse.com Simple ListView Tutorial");
            // Set progressdialog message
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            // Show progressdialog
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            // Locate the class table named "Country" in Parse.com
            ParseQuery<ParseObject> query = new ParseQuery<ParseObject>(
                    "Curso");
            try {
                ob = query.find();
            } catch (ParseException e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Locate the listview in listview_main.xml
            listview = (ListView) findViewById(R.id.listView);
            // Pass the results into an ArrayAdapter
            adapter = new ArrayAdapter<String>(Teacher.this,
                    R.layout.listview_item);
            // Retrieve object "name" from Parse.com database
            for (ParseObject Curso : ob) {
                adapter.add((String) Curso.get("CursoId"));
            }
            // Binds the Adapter to the ListView
            listview.setAdapter(adapter);
            // Close the progressdialog
            mProgressDialog.dismiss();
            // Capture button clicks on ListView items
            listview.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    // Send single item click data to SingleItemView Class
                    Intent i = new Intent(Teacher.this,
                            ListaCurso.class);
                    // Pass data "name" followed by the position
                    i.putExtra("CursoId", ob.get(position).getString("CursoId")
                            .toString());
                    // Open SingleItemView.java Activity
                    startActivity(i);
                }
            });
        }
    }
}