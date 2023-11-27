package com.example.exintenttoast;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;


import android.os.Bundle;

public class activitytwo extends AppCompatActivity {
    Button prvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        Button prvs = findViewById(R.id.prvs);
        prvs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(activitytwo.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"redirecting to previous page",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
