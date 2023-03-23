package com.wadie.myapplication.actions;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wadie.myapplication.Sign_up_Activity;
package com.wadie.myapplication.actions;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wadie.myapplication.Sign_up_Activity;

public class RegisterAction implements View.OnClickListener{
    private Sign_up_Activity signActivity;
    private Button registerBtn;
    private EditText emailInput;
    private EditText fullNameInput;
    private EditText phoneInput;
    private EditText passwordInput;

    public RegisterAction(Sign_up_Activity signActivity){
        this.signActivity = signActivity;
        this.registerBtn = signActivity.getRegisterBtn();
        this.emailInput = signActivity.getEmailInput();
        this.fullNameInput = signActivity.getFullNameInput();
        this.phoneInput = signActivity.getPhoneInput();
        this.passwordInput = signActivity.getPasswordInput();
    }
@Override
public void onClick(View view) {
    String fullName = signActivity.getFullNameInput().getText().toString();
    String email = signActivity.getEmailInput().getText().toString();
    String password = signActivity.getPasswordInput().getText().toString();
    String phone = signActivity.getPhoneInput().getText().toString();

    User newUser = services.addUser(fullName, email, password, phone);

}
}