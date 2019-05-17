package com.example.nikhil.recipeshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Nikhil on 18-02-2017.
 */

public class AdminRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_register);
    }

    public void Adminregister(View A){

        if(A.getId()==R.id.Badminregister);

        EditText name=(EditText)findViewById(R.id.TFradminname);
        EditText email=(EditText)findViewById(R.id.TFradminemail);
        EditText phone=(EditText)findViewById(R.id.TFradminphone);
        EditText pass1=(EditText)findViewById(R.id.TFradminpass1);
        EditText pass2=(EditText)findViewById(R.id.TFradminpass2);

        if(pass1.equals(pass2)){

            //PopUp message
            Toast pass=Toast.makeText(AdminRegister.this,"Password don't match!",Toast.LENGTH_SHORT);
            pass.show();
        }

    }
}
