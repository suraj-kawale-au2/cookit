package com.example.nikhil.recipeshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Nikhil on 18-02-2017.
 */

public class UserRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_register);
    }

    public void Userregister(View U){

        if(U.getId()==R.id.Buserregister);
        {

            EditText name = (EditText) findViewById(R.id.TFrusername);
            EditText email = (EditText) findViewById(R.id.TFruseremail);
            EditText phone = (EditText) findViewById(R.id.TFruserphone);
            EditText pass1 = (EditText) findViewById(R.id.TFruserpass1);
            EditText pass2 = (EditText) findViewById(R.id.TFruserpass2);

            if (pass1.equals(pass2)) {

                //PopUp message
                Toast pass = Toast.makeText(UserRegister.this, "Password don't match!", Toast.LENGTH_SHORT);
                pass.show();
            }
        }
    }
}
