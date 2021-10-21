package com.example.lab05_milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText username = findViewById(R.id.username);
        String s = username.getText().toString();

        login(s);
    }

    public void login(String S) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Message", S);
        startActivity(intent);
    }
}