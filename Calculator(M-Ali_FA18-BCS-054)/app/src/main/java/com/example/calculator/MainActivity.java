package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText etValue1,etValue2,etResult;
    private Button btnCalulate;
    private TextView tvResult;
    private Spinner spinner;
    protected String result;
    protected int value1,value2,operator;

                Logic log=new Logic();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etValue1=findViewById(R.id.etValue1);
        etValue2=findViewById(R.id.etValue2);
        btnCalulate=findViewById(R.id.btnCalculate);
        tvResult=findViewById(R.id.tvResult);
        spinner=findViewById(R.id.spinner);
        ArrayList<String> list=new ArrayList<>();
        list.add(" Select Operator");
        list.add("Addition");
        list.add("Substruction");
        list.add("Multiply");
        list.add("Division");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               spinner.setSelection(position);
                operator=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnCalulate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                value1=Integer.parseInt(etValue1.getText().toString());
                value2=Integer.parseInt(etValue2.getText().toString());
                result=log.process(value1,value2,operator);
                tvResult.setText(result);
            }
        });

    }

}