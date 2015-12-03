package com.puche.juegoingles;

import android.app.Application;

import com.parse.Parse;


/**
 * Created by Raimundo Puche on 29/10/2015.
 */
public class Db extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "CgsVMSxzSz6poZNu1uxVT3mEXXpAc2FEUkMoop0w", "6NJPcAYTNLlzBUVNuNtUv4bMYCFBskIT5cauZP68");

    }



}
