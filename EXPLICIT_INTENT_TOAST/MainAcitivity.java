package com.example.exintenttoast;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view){
                                        Intent intent= new Intent(MainActivity.this,activitytwo.class);
                                        startActivity(intent);
                                        Toast.makeText(getApplicationContext(),"redirecting to next page",Toast.LENGTH_SHORT).show();
                                    }
                                }
        );
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                    Toast.makeText(getApplicationContext(),"redirecting..",Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}
