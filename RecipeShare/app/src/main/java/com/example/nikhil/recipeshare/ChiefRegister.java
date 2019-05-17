package com.example.nikhil.recipeshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Nikhil on 18-02-2017.
 */

public class ChiefRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chief_register);
    }

    public void Chiefregister(View C){

        if(C.getId()==R.id.Buserregister);

        EditText name=(EditText)findViewById(R.id.TFrchiefname);
        EditText email=(EditText)findViewById(R.id.TFrchiefemail);
        EditText phone=(EditText)findViewById(R.id.TFrchiefphone);
        EditText pass1=(EditText)findViewById(R.id.TFrchiefpass1);
        EditText pass2=(EditText)findViewById(R.id.TFrchiefpass2);

        if(pass1.equals(pass2)){

            //PopUp message
            Toast pass=Toast.makeText(ChiefRegister.this,"Password don't match!",Toast.LENGTH_SHORT);
            pass.show();
        }

    }
}
