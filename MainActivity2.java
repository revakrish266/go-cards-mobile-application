
package com.gocards.gocards;
import org.json.JSONException;
import org.json.JSONObject;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;



//implementing onclicklistener
public class MainActivity2 extends AppCompatActivity  {

    //View Objects
    private Button buttonScan;
    private TextView textViewName;

    //qr code scanner object
    private IntentIntegrator qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //View objects
        buttonScan = (Button) findViewById(R.id.buttonScan);
        textViewName = (TextView) findViewById(R.id.textViewName);

        //intializing scan object
        qrScan = new IntentIntegrator(this);

        //attaching onclick listener
        buttonScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qrScan.initiateScan();
            }
        });
    }

    //Getting the scan results
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Result Not Found", Toast.LENGTH_LONG).show();
            } else {
                    if(result.getContents().equals("9524826106")) {
                        textViewName.setText("Ragu Nanthini");
                        Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                        Intent i=new Intent(MainActivity2.this,MainActivity21.class);

                        startActivity(i);
                    }
                    else{
                        Toast.makeText(this, "Invalid QR Code", Toast.LENGTH_LONG).show();
                        Intent i=new Intent(MainActivity2.this,MainActivity.class);

                        startActivity(i);
                    }

            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }



}
