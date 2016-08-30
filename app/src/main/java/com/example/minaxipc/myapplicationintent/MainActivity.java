package com.example.minaxipc.myapplicationintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3;
    EditText med1, med2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv3);

        b1 = (Button) findViewById(R.id.button);
        b3 = (Button) findViewById(R.id.button3);
        med1 = (EditText) findViewById(R.id.et1);

        med2 = (EditText) findViewById(R.id.et2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/"));
                startActivity(i);
            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.minaxipc.myapplicationintent.LAUNCH", Uri.parse("https://www.flipkart.com"));
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), NewActivity.class);

                i.putExtra("data", med2.getText().toString());
                int age = Integer.parseInt(med1.getText().toString());
                i.putExtra("age", age);
                startActivityForResult(i, 1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 1) {
            if (requestCode == RESULT_OK) {
                Bundle bundle = getIntent().getExtras();
                if (bundle != null) {
                    int roll_no = bundle.getInt("roll_no", 0);
                    textView.setText(data + "     Roll No. is   :  " + roll_no);
                }
            }
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}