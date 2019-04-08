package com.example.AndroidProject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.DialogFragment;

public class PleaseEnterFeedBack extends DialogFragment {
    public Dialog onCreateDialog(Bundle sis){
        super.onCreateDialog(sis);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()); // Factory for an AlertDialog.
        builder.setTitle("Please Enter FeedBack")
                .setNegativeButton("Ask Me Later", new DialogInterface.OnClickListener() { // The an OnClickListener’s onClick() method
                    @Override // is triggered when the button is clicked.
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })

                .setPositiveButton("OK", new DialogInterface.OnClickListener() { // The an OnClickListener’s onClick() method
                    @Override // is triggered when the button is clicked.
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        return builder.create(); // Tell
    }




}
