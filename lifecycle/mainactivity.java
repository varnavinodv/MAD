package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("onRestart Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("onResume Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy Called");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
