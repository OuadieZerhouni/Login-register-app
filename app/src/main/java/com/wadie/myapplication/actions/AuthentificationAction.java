package com.wadie.myapplication.actions;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import com.wadie.myapplication.HomeActivity;
import com.wadie.myapplication.R;
import com.wadie.myapplication.Sign_up_Activity;
import com.wadie.myapplication.main;

public class AuthentificationAction implements View.OnClickListener{
    private main mainActivity;
    private EditText emailInput, pswdInput;

    public AuthentificationAction(main mainActivity) {
        this.mainActivity = mainActivity;
        emailInput = mainActivity.findViewById(R.id.email_input);
        pswdInput = mainActivity.findViewById(R.id.password_input);
    }

    @Override
    public void onClick(View v) {
        String email = emailInput.getText().toString();
        String password = pswdInput.getText().toString();
        Intent intent = new Intent(mainActivity, HomeActivity.class);
        mainActivity.startActivity(intent);
        Toast.makeText(mainActivity, "Sign-in clicked", Toast.LENGTH_SHORT).show();
    }
}