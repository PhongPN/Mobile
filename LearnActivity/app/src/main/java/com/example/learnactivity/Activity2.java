package com.example.learnactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    public static  int TRAVETU_ACTIVITY2 = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity2);

        Intent i = getIntent();
        String dulieu = i.getStringExtra("dulieu");

        final EditText editText = findViewById(R.id.edittext);
        editText.setText(dulieu);

        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                String s = editText.getText().toString();
                i.putExtra("dulieu",s);
                setResult(TRAVETU_ACTIVITY2, i);

                finish();
            }
        });

    }
}
