package com.example.learningtask41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstvalue,secondvalue,thirdvalue;
    Button btnadd,btnsubtract,btnmultiply,btndivide;
    double num1,num2,num3;
    TextView showresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstvalue=findViewById(R.id.firstvalue);
        secondvalue=findViewById(R.id.secondvalue);
        thirdvalue=findViewById(R.id.thirdvalue);
        btnadd=findViewById(R.id.btnadd);
        btnsubtract=findViewById(R.id.btnsubtract);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivide=findViewById(R.id.btndivide);
        showresult=findViewById(R.id.showresult);
        ClickListener();


    }
    public void ClickListener(){
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(firstvalue.getText().toString());
                num2=Double.parseDouble(secondvalue.getText().toString());
                num3=Double.parseDouble(thirdvalue.getText().toString());
                Double result=num1+num2+num3;
                firstvalue = (EditText) findViewById(R.id.firstvalue);
                secondvalue = (EditText) findViewById(R.id.secondvalue);
                thirdvalue = (EditText) findViewById(R.id.thirdvalue);
                if(firstvalue.getText().toString().isEmpty() ||  secondvalue.getText().toString().isEmpty() ||  thirdvalue.getText().toString().isEmpty()){
                    num1 = 0;
                    num2 = 0;
                    num3 = 0;
                }else{
                    num1 = Double.parseDouble(firstvalue.getText().toString());
                    num2 = Double.parseDouble(secondvalue.getText().toString());
                    num3 = Double.parseDouble(thirdvalue.getText().toString());
                }

                result = num1+num2+num3;
                showresult.setText(String.valueOf(result));


            }
        });
        btnsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(firstvalue.getText().toString());
                num2=Double.parseDouble(secondvalue.getText().toString());
                num3=Double.parseDouble(thirdvalue.getText().toString());
                Double result=num1-num2-num3;

                firstvalue = (EditText) findViewById(R.id.firstvalue);
                secondvalue = (EditText) findViewById(R.id.secondvalue);
                thirdvalue = (EditText) findViewById(R.id.thirdvalue);
                if(firstvalue.getText().toString().isEmpty() ||  secondvalue.getText().toString().isEmpty() ||  thirdvalue.getText().toString().isEmpty()){
                    num1 = 0;
                    num2 = 0;
                    num3 = 0;
                }else{
                    num1 = Double.parseDouble(firstvalue.getText().toString());
                    num2 = Double.parseDouble(secondvalue.getText().toString());
                    num3 = Double.parseDouble(thirdvalue.getText().toString());
                }

                result = num1-num2-num3;
                showresult.setText(String.valueOf(result));
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(firstvalue.getText().toString());
                num2=Double.parseDouble(secondvalue.getText().toString());
                num3=Double.parseDouble(thirdvalue.getText().toString());
                Double result=num1*num2*num3;
                firstvalue = (EditText) findViewById(R.id.firstvalue);
                secondvalue = (EditText) findViewById(R.id.secondvalue);
                thirdvalue = (EditText) findViewById(R.id.thirdvalue);
                if(firstvalue.getText().toString().isEmpty() ||  secondvalue.getText().toString().isEmpty() ||  thirdvalue.getText().toString().isEmpty()){
                    num1 = 0;
                    num2 = 0;
                    num3 = 0;
                }else{
                    num1 = Double.parseDouble(firstvalue.getText().toString());
                    num2 = Double.parseDouble(secondvalue.getText().toString());
                    num3 = Double.parseDouble(thirdvalue.getText().toString());
                }

                result = num1*num2*num3;

                showresult.setText(String.valueOf(result));
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(firstvalue.getText().toString());
                num2=Double.parseDouble(secondvalue.getText().toString());
                num3=Double.parseDouble(thirdvalue.getText().toString());
                Double result=num1/num2/num3;
                firstvalue = (EditText) findViewById(R.id.firstvalue);
                secondvalue = (EditText) findViewById(R.id.secondvalue);
                thirdvalue = (EditText) findViewById(R.id.thirdvalue);
                if(firstvalue.getText().toString().isEmpty() ||  secondvalue.getText().toString().isEmpty() ||  thirdvalue.getText().toString().isEmpty()){
                    num1 = 0;
                    num2 = 0;
                    num3 = 0;
                }else{
                    num1 = Double.parseDouble(firstvalue.getText().toString());
                    num2 = Double.parseDouble(secondvalue.getText().toString());
                    num3 = Double.parseDouble(thirdvalue.getText().toString());
                }

                result = num1/num2/num3;
                showresult.setText(String.valueOf(result));
            }
        });
    }
}