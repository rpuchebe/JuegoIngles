package com.puche.juegoingles;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.puche.juegoingles2.R;

import java.util.ArrayList;
import java.util.List;

public class Option1 extends AppCompatActivity implements ViewAdapter.RecyclerClickListner{
    private ArrayList values;
    private List<ParseObject> ob;

    TextView texto;
    private ViewAdapter viewAdapter;
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);
        texto = (TextView) findViewById(R.id.texto);

        Intent intent =getIntent();
        Bundle extras = intent.getExtras();

        if(extras!=null){

            String dato = extras.getString("USER");
            texto.setText(dato);
        }

        new GetData().execute();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycle);

        List<Information> data = new ArrayList<>();
        String[] titulo = getResources().getStringArray(R.array.data);


        for (int i = 0; i < titulo.length;i++){
            Information info = new Information(titulo[i]);
            data.add(info);
        }
        viewAdapter= new ViewAdapter(this,data);
        viewAdapter.setRecyclerClickListner(this);
        mRecyclerView.setAdapter(viewAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        new GetData().execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_option1, menu);
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
    public void itemClick(View view, int position) {

        Log.d("Recyclerview", "Click position "+position);
    }

    public class GetData extends AsyncTask<Void,Void,Void> {

        @Override
        protected Void doInBackground(Void... params) {
            values= new ArrayList<String>();
            try{
                ParseQuery<ParseObject> query=new ParseQuery<ParseObject>("attributes");
                ob = query.find();
                for (ParseObject dato : ob){

                    //values.add(dato.get("Palabra") + " " + dato.get("Imagen") + " ");
                    values.add(dato.get("Palabra") + " ");


                }
                Log.e("GETDATA", "" + values.size());
            } catch (com.parse.ParseException e) {
                Log.e("Error",e.getMessage());
                e.printStackTrace();
            }
            return null;
        }

        /*@Override
        protected void onPostExecute(Void result){
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(Option1.this,android.R.layout.simple_list_item_1,android.R.id.text1,values);
            dataList.setAdapter(adapter);
        }
        */
    }
}
