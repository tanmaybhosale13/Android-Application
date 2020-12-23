package com.example.projectdemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;


import android.os.Bundle;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogBox extends AppCompatDialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_DARK);


        builder.setTitle("HealthCare Info:-")
                .setMessage("This application helps to provide their services and care or increased patient interaction in order to get the best facility of health.")


                   .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                           dialog.dismiss();

                    }
                });



        return builder.create();


    }
}
