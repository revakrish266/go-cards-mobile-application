package com.gocards.gocards;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity21 extends AppCompatActivity{
    Button btn;
    EditText edt;
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        edt=(EditText) findViewById(R.id.editText);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    if (edt.getText().toString().equals("101")) {

                        Intent i = new Intent(MainActivity21.this, MainActivity31.class);
                        startActivity(i);
                    } else {

                        Toast.makeText(v.getContext(), "INVALID PASSCODE", Toast.LENGTH_LONG).show();
                        Intent i=new Intent(MainActivity21.this,MainActivity.class);

                        startActivity(i);
                    }

            }
        });
    }


        }

