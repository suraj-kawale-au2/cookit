package com.example.nikhil.recipeshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Nikhil on 17-02-2017.
 */

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_login);
    }

    public void Adminreg(View AR){

        Intent i= new Intent(AdminLogin.this,AdminRegister.class);
        startActivity(i);
    }
}
