package com.example.AndroidProject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.DialogFragment;

public class ThankYouAlert extends DialogFragment {
    //ThankYou thanks;

 /*   public interface ThankYou {
        void getHelp();

    }

    public void onAttach(Activity act) {
        super.onAttach(act);
        thanks = (ThankYou) act;
    }
*/

    public Dialog onCreateDialog(Bundle sis) {
        super.onCreateDialog(sis);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()); // Factory for an AlertDialog.
        builder.setTitle("Thank you")
                .setMessage("Than you for using our Service")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() { // The an OnClickListener’s onClick() method
                    @Override // is triggered when the button is clicked.
                    public void onClick(DialogInterface dialog, int which) {
                          // thanks.getHelp();
                    }
                });

        return builder.create(); // Tell
    }
}




