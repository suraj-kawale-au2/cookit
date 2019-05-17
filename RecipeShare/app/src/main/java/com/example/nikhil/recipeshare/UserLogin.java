package com.example.nikhil.recipeshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nikhil on 17-02-2017.
 */

public class UserLogin extends AppCompatActivity {

    Button UserR,UserL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);
        UserL=(Button)findViewById(R.id.Buserlogin);
        UserR=(Button)findViewById(R.id.Buserreg);
    }

    public void Userreg(View UR){

        Intent i= new Intent(UserLogin.this,UserRegister.class);
        startActivity(i);
    }
}
