package com.example.minaxipc.myapplicationintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      Button b1,b2,b3;
      EditText med1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button)findViewById(R.id.button);
        b3=(Button)findViewById(R.id.button3);
        med1=(EditText)findViewById(R.id.et1);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/"));
                startActivity(i);
            }
        });

        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.minaxipc.myapplicationintent.LAUNCH",Uri.parse("https://www.flipkart.com"));
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),NewActivity.class);

                int age = Integer.parseInt(med1.getText().toString());
                i.putExtra("age",age);
                startActivity(i);
            }
        });


    }
}
