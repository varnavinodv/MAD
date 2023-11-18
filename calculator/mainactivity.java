package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2,ans;
    Button addbtn,subbtn,mulbtn,divbtn;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        ans=findViewById(R.id.ans);
        addbtn=findViewById(R.id.addbtn);
        subbtn=findViewById(R.id.subbtn);
        mulbtn=findViewById(R.id.mulbtn);
        divbtn=findViewById(R.id.divbtn);
        addbtn. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                int sum=x+y;
                ans.setText(String.valueOf(sum));
            }
        });
        subbtn. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                int sub=x-y;
                ans.setText(String.valueOf(sub));
            }
        });
        mulbtn. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                int pro=x*y;
                ans.setText(String.valueOf(pro));
            }
        });
        divbtn. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(num1.getText().toString());
                int y=Integer.parseInt(num2.getText().toString());
                int quo=x/y;
                ans.setText(String.valueOf(quo));
            }
        });

    }
}
