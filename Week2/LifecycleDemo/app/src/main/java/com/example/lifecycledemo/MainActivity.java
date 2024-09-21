package com.example.lifecycledemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleDemo";
    private TextView lifecycleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecycleTextView = findViewById(R.id.lifecycleTextView);

        Log.d(TAG, "onCreate called");
        lifecycleTextView.setText(R.string.activity_state_oncreate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
        lifecycleTextView.setText(R.string.activity_state_onstart);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
        lifecycleTextView.setText(R.string.activity_state_onresume);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
        lifecycleTextView.setText(R.string.activity_state_onpause);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
        lifecycleTextView.setText(R.string.activity_state_onstop);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart called");
        lifecycleTextView.setText(R.string.activity_state_onrestart);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
        lifecycleTextView.setText(R.string.activity_state_ondestroy);
    }
}