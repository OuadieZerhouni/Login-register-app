package com.wadie.myapplication.models.actions;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.wadie.myapplication.main;

public class AuthentificationAction implements View.OnClickListener{
    private main mainActivity;
    private EditText login, password;

    public AuthentificationAction(main mainActivity) {

    }


    @Override
    public void onClick(View view) {
        // verification
    /* if(login.getText().toString().equals("") || password.getText().toString().equals("")) {
         Toast.makeText(mainActivity, "all fields are required",
                 Toast.LENGTH_SHORT).show();
         return;
     }
     // authentification
       User user= mainActivity.getServices().login(login.getText().toString()
                ,password.getText().toString());
     if(user!=null)
     {
         Toast.makeText(mainActivity, "Hi"+user.getName(), Toast.LENGTH_SHORT).show();

         Intent intent=new Intent(mainActivity, HomeActivity.class);
         intent.putExtra("user",user.getName());
         mainActivity.startActivity(intent);
         mainActivity.finish();
     }
     else
         Toast.makeText(mainActivity, "error", Toast.LENGTH_SHORT).show();
  */  }

}
