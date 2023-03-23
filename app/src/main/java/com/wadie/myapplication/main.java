package com.wadie.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class main extends Activity {


    private Button buttonLogin ;
    private EditText emailInput ;
    private EditText pswdInput ;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      buttonLogin=findViewById(R.id.login_button);
      emailInput=findViewById(R.id.email_input);
      pswdInput=findViewById(R.id.emai_input);
  }

}