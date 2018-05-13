
package com.gocards.gocards;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity  {

    private Button ver;
    private TextView textView;
    private EditText editText;
private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        ver = (Button) findViewById(R.id.verify);
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText().toString().equals("nanthini1331@gmail.com")) {

                    Intent i = new Intent(MainActivity3.this, MainActivity21.class);

                    startActivity(i);
                } else {

                    Toast.makeText(v.getContext(),"Invalid Mail-id", Toast.LENGTH_LONG).show();
                    /*CountDownTimer toastCountDown;
                    toastCountDown = new CountDownTimer(10000, 1000 ) {
                        public void onTick(long millisUntilFinished) {
                            toast.show();
                        }

                        public void onFinish() {
                            toast.cancel();
                        }
                    };
                    toast.show();
                    toastCountDown.start();*/
                    Intent i = new Intent(MainActivity3.this, MainActivity.class);

                    startActivity(i);
                }
            }
        });


    }
}
