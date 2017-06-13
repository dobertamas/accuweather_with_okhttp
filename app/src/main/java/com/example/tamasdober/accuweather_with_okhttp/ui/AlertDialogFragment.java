
package com.example.tamasdober.accuweather_with_okhttp.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.example.tamasdober.accuweather_with_okhttp.R;

public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.error_title)
                .setMessage(R.string.error_messagge)
                .setPositiveButton(R.string.error_positive_button, null); // Just to close the dialog.

        return builder.create();
        // Instead of AlertDialog dialog = builder.create(); return dialog;
    }
}