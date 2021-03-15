package com.example.activitylab;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    protected TextView tvCreate2, tvStart2, tvRusme2, tvRestart2;
    protected Button btnClose;
    protected static int onC2, onS2, onR2, onRe2;
    protected String key2 = "Life Cycle Steps ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(key2, "");
        tvCreate2 = findViewById(R.id.tvCreate2);
        tvStart2 = findViewById(R.id.tvStart2);
        tvRusme2 = findViewById(R.id.tvRusme2);
        tvRestart2 = findViewById(R.id.tvRestart2);
        btnClose=findViewById(R.id.btnClose);
        onC2++;
        tvCreate2.setText("onCreate() Call: " + onC2);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent2);
            }
        });
    }
    protected void onStart(){
        super.onStart();
        onS2++;
        Log.i(key2,"onStart Log");
        tvStart2.setText("onStart() Call: "+onS2);
    }
    protected void onResume(){
        super.onResume();
        onR2++;
        Log.i(key2,"onResume Log");
        tvRusme2.setText("onResume Call: "+onR2);
    }
    protected void onRestart(){
        super.onRestart();
        onRe2++;
        Log.i(key2,"onRestart Log");
        tvRestart2.setText("onRestart Call: "+onRe2);
    }
}