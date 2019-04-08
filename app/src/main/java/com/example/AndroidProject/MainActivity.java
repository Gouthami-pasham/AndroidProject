package com.example.AndroidProject;


import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Parse.initialize(new Parse.Configuration.Builder(this)
//                .applicationId(getString(R.string.back4app_app_id))
//                // if defined
//                .clientKey(getString(R.string.back4app_client_key))
//                .server(getString(R.string.back4app_server_url))
//                .build()
//        );
//
//        // Save the current Installation to Back4App
//        ParseInstallation.getCurrentInstallation().saveInBackground();
    }





    public void Button_SignUp (View v){
        Intent in = new Intent(this, SignUpPage.class);
        startActivity(in);
    }

    public void Button_Feedback (View v){
        Intent fb = new Intent(this, FeedbackPage.class);
        startActivity(fb);
    }


    public void Button_SignIn(View v){
        Intent sn = new Intent(this,SignInPage.class);
        startActivity(sn);
    }

}
