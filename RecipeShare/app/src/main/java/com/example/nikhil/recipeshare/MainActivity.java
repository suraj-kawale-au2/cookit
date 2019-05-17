package com.example.nikhil.recipeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button User,Chief,Admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User=(Button)findViewById(R.id.Buser);
        Chief=(Button)findViewById(R.id.Bchief);
        Admin=(Button)findViewById(R.id.Badmin);
    }

    public void Userlogin(View u){

        Intent i=new Intent(MainActivity.this,UserLogin.class);
        startActivity(i);
    }

    public void Chieflogin(View c){

        Intent i=new Intent(MainActivity.this,ChiefLogin.class);
        startActivity(i);
    }

    public void Adminlogin(View a){
        Intent i=new Intent(MainActivity.this,AdminLogin.class);
        startActivity(i);
    }

}
