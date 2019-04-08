package com.example.AndroidProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;

public class FeedbackPage extends AppCompatActivity {
    RatingBar rate;
    Button Submit;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_page);

     /*   Parse.initialize(new Parse.Configuration.Builder(this)
                        .applicationId(getString(R.string.back4app_app_id))
                        // if defined
                        .clientKey(getString(R.string.back4app_client_key))
                        .server(getString(R.string.back4app_server_url))
                        .build()
        );
        ParseUser.enableRevocableSessionInBackground();
        ParseUser.getCurrentUser().logOut();

        ParseInstallation.getCurrentInstallation().saveInBackground();*/

        rate = (RatingBar) findViewById(R.id.ratingBar);
        tv1=(TextView) findViewById(R.id.editText2);
        Submit = (Button) findViewById(R.id.submit);


    }


    public void submit(View v) {

        if (rate.getRating() == 0) {
            PleaseEnterFeedBack fb = new PleaseEnterFeedBack();
            fb.show(getSupportFragmentManager(), "TAG");
        } else if (rate.getRating() <= 3 && rate.getRating() > 0) {
            Intent sn = new Intent(this, HelpImproveActivity.class);
            startActivity(sn);
        } else if (rate.getRating() > 3) {
            ThankYouAlert TY = new ThankYouAlert();
            TY.show(getSupportFragmentManager(), "TAG");

        }

    }
}

