package com.example.minaxipc.myapplicationintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        TextView mtv = (TextView) findViewById(R.id.tv1);
        EditText editText;
        Button mbtn;
        mbtn=(Button)findViewById(R.id.button4) ;
        editText=(EditText)findViewById(R.id.et1);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String data = bundle.getString("data");
            int age = bundle.getInt("age", 0);
            mtv.setText(data + "     Age is   :  " + age);
        }

       mbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent();
               i.putExtra("roll_no.",123);
               setResult(RESULT_OK,i);
               finish();

           }
       });


    }




    }





