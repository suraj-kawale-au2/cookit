package com.example.nikhil.recipeshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Nikhil on 17-02-2017.
 */

public class ChiefLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chief_login);
    }

    public void Chiefreg(View CR){

        Intent i= new Intent(ChiefLogin.this,ChiefRegister.class);
        startActivity(i);
    }
}
