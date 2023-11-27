package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


import android.os.Bundle;

public class activity2 extends AppCompatActivity {
    Button prvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        Button prvs = findViewById(R.id.prvs);
        prvs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
