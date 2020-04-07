package com.example.aj_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  String Tag = "MainActivityLog";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(Tag,"OnCreate");

        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,
//                        "Bạn bấm vào nút bấm",
//                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,
                        SecondActivity.class);
                startActivity(intent);
            }
        });

//        Log.i("Tag","a");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"onDestroy");
    }
}
