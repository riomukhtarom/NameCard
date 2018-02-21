package com.example.user.namecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText editTextName,
            editTextProgramStudy,
            editTextAddress,
            editTextPhoneNumber,
            editTextEmail,
            editTextFacebook,
            editTextInstagram;

    Button buttonMakeNameCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editTextName = (EditText) findViewById(R.id.input_name);
        editTextProgramStudy = (EditText) findViewById(R.id.input_programStudy);
        editTextAddress = (EditText) findViewById(R.id.input_address);
        editTextPhoneNumber = (EditText) findViewById(R.id.input_phoneNumber);
        editTextEmail = (EditText) findViewById(R.id.input_email);
        editTextFacebook = (EditText) findViewById(R.id.input_facebook);
        editTextInstagram = (EditText) findViewById(R.id.input_instagram);

//        buttonMakeNameCard = (Button) findViewById(R.id.btn_makeNameCard);
//
//        buttonMakeNameCard.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intentToSecondActivity = new Intent(this, SecondActivity.class);
//                intentToSecondActivity.putExtra("name", editTextName.getText().toString());
//                startActivity(intentToSecondActivity);
//            }
//        });

    }

    public void move(View view){
        Intent intentToSecondActivity = new Intent(this, SecondActivity.class);
        intentToSecondActivity.putExtra("name", editTextName.getText().toString());
        intentToSecondActivity.putExtra("programStudy", editTextProgramStudy.getText().toString());
        intentToSecondActivity.putExtra("address", editTextAddress.getText().toString());
        intentToSecondActivity.putExtra("phoneNumber", editTextPhoneNumber.getText().toString());
        intentToSecondActivity.putExtra("email", editTextEmail.getText().toString());
        intentToSecondActivity.putExtra("facebook", editTextFacebook.getText().toString());
        intentToSecondActivity.putExtra("instagram", editTextInstagram.getText().toString());
        startActivity(intentToSecondActivity);
    }

}
