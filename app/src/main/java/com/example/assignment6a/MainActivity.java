package com.example.assignment6a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText editn,editph,edite,editpass,editcpass;
   Button btn;
   RadioGroup radioGroup;
   RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Registration Form");
        editn=findViewById(R.id.editname);
        editph=findViewById(R.id.editphone);
        edite=findViewById(R.id.editemail);
        editpass=findViewById(R.id.editpass);
        editcpass=findViewById(R.id.editcpass);

        btn=findViewById(R.id.buttonr);
        radioGroup=findViewById(R.id.radiogroup1);
        radioButton=findViewById(R.id.radiomale);
        radioButton=findViewById(R.id.radiofemale);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
    private void CheckAllVallidation(){
        String username=editn.getText().toString().trim();
        String userphone=editph.getText().toString().trim();
        String useremail=edite.getText().toString().trim();
        String userpass=editpass.getText().toString().trim();
        String usercpass=editcpass.getText().toString().trim();
        if (TextUtils.isEmpty(username)){
           editn.setError("please enter your name");
        }
         else if (TextUtils.isEmpty(userphone)){
            editph.setError("please enter your phone");
        }
        else if (TextUtils.isEmpty(useremail)){
            edite.setError("please enter your email");
        }
          else if (TextUtils.isEmpty(userpass)){
            editpass.setError("please re_enter  password");
        }else if (!(userpass.equals(usercpass))){
            Toast.makeText(this, "please inter right password", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(usercpass)){
            Toast.makeText(this, "please enter your confirmpassword ", Toast.LENGTH_SHORT).show();
        }
        else {
            int selectedID=radioGroup.getCheckedRadioButtonId();
            radioButton=findViewById(selectedID);
            String usergender=radioButton.getText().toString();

        }

    }

}