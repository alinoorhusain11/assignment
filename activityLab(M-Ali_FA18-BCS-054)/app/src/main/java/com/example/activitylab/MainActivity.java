package com.example.activitylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected TextView Create,Start,Resume,Restart,Pause;
    protected Button btn2;
    protected String key="Life cycle steps";
    protected static int onC=0,onS=0,onR=0,onP=0,onRe=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(key,"");
        Create=findViewById(R.id.tvCreate2);
        Start=findViewById(R.id.tvStart);
        Resume=findViewById(R.id.tvResume);
        Restart=findViewById(R.id.tvRestart);
        Pause=findViewById(R.id.tvPasue);
        btn2=findViewById(R.id.btnActivity2);
        onC++;
        Create.setText("onCreate is called"+onC);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(t);
            }
        });

    }
    protected void onStart(){
        super.onStart();
        onS++;
        Log.i(key,"onStart Log");
        Start.setText("onStart Call: "+onS);


    }
    protected void onResume(){
        super.onResume();
        onR++;
        Log.i(key,"onResume Log");
        Resume.setText("onResume Call: "+onR);
    }
    protected void onPause(){
        super.onPause();
        onP++;
        Log.i(key,"onPause Log");
        Pause.setText("onPause Call: "+onP);
    }
    protected void onRestart(){
        super.onRestart();
        Log.i(key,"onRestart Log");
        onRe++;
        Restart.setText("onRestart Call: "+onRe);
    }
}