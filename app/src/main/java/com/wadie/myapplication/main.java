package com.wadie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wadie.myapplication.actions.AuthentificationAction;

import org.w3c.dom.Text;

public class main extends Activity {

    private Button buttonLogin;
    private EditText emailInput;
    private EditText pswdInput;
    private Button fb_btn;
    private Button google_btn;
    private TextView Sign_up_link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.login_button);
        emailInput = findViewById(R.id.email_input);
        pswdInput = findViewById(R.id.password_input);
        fb_btn=findViewById(R.id.fb_btn);
        google_btn=findViewById(R.id.google_btn);
        Sign_up_link = findViewById(R.id.Sign_up_link);
        Sign_up_link.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(main.this, Sign_up_Activity.class);
               startActivity(intent);
           }
       });
        AuthentificationAction authentificationAction=new AuthentificationAction(this);
        buttonLogin.setOnClickListener(authentificationAction);

    }

    public Button getButtonLogin() {
        return buttonLogin;
    }

    public void setButtonLogin(Button buttonLogin) {
        this.buttonLogin = buttonLogin;
    }

    public EditText getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(EditText emailInput) {
        this.emailInput = emailInput;
    }
}