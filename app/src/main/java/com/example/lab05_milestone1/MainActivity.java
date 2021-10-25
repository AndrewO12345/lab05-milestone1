package com.example.lab05_milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String usernameKey = "username";

        SharedPreferences sharedPreferences = getSharedPreferences("com.example.lab05_milestone1", Context.MODE_PRIVATE);

        if (!sharedPreferences.getString(usernameKey, "").equals("")) {
            String user = sharedPreferences.getString(usernameKey, "");
            login(user);
        } else {
            setContentView(R.layout.activity_main);
        }

    }

    public void clickFunction(View view) {
        EditText username = findViewById(R.id.username);
        String s = username.getText().toString();

        SharedPreferences sharedPreferences = getSharedPreferences("com.example.lab05_milestone1", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username", s).apply();

        login(s);
    }

    public void login(String S) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Message", S);
        startActivity(intent);
    }
}