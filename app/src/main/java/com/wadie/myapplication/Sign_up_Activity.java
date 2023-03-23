package com.wadie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wadie.myapplication.actions.RegisterAction;

public class Sign_up_Activity extends Activity {
    private Button registerBtn;
    private EditText emailInput;
    private EditText fullNameInput;
    private EditText phoneInput;
    private EditText passwordInput;
    private TextView Sign_in_link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        registerBtn = findViewById(R.id.Register_button);
        emailInput = findViewById(R.id.email_input);
        fullNameInput = findViewById(R.id.FullName_input);
        phoneInput = findViewById(R.id.Phone_input);
        passwordInput = findViewById(R.id.password_input);
        Sign_in_link=findViewById(R.id.Sign_in_link);
        Sign_in_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_Activity.this, main.class);
                startActivity(intent);
            }
        });
        RegisterAction registerAction=new RegisterAction(this);
        registerBtn.setOnClickListener(registerAction);

    }

     public Button getRegisterBtn() {
        return registerBtn;
    }

     public void setRegisterBtn(Button registerBtn) {
        this.registerBtn = registerBtn;
    }

     public EditText getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(EditText emailInput) {
        this.emailInput = emailInput;
    }

    public EditText getFullNameInput() {
        return fullNameInput;
    }

    public void setFullNameInput(EditText fullNameInput) {
        this.fullNameInput = fullNameInput;
    }

    public EditText getPhoneInput() {
        return phoneInput;
    }

    public void setPhoneInput(EditText phoneInput) {
        this.phoneInput = phoneInput;
    }

     public EditText getPasswordInput() {
        return passwordInput;
    }

     public void setPasswordInput(EditText passwordInput) {
        this.passwordInput = passwordInput;
    }
}