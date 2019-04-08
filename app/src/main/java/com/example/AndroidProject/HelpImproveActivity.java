package com.example.AndroidProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelpImproveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_improve2);
    }

    public void submit (View v){
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }

    public void cancel (View v){
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }
}
