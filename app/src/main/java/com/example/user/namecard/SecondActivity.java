package com.example.user.namecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textViewName,
            textViewProgramStudy,
            textViewAddress,
            textViewPhoneNumber,
            textViewEmail,
            textViewFacebook,
            textViewInstagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewName = (TextView) findViewById(R.id.tv_name);
        textViewProgramStudy = (TextView) findViewById(R.id.tv_programStudy);
        textViewAddress = (TextView) findViewById(R.id.tv_address);
        textViewPhoneNumber = (TextView) findViewById(R.id.tv_phone);
        textViewEmail = (TextView) findViewById(R.id.tv_email);
        textViewFacebook = (TextView) findViewById(R.id.tv_facebook);
        textViewInstagram = (TextView) findViewById(R.id.tv_instagram);

        Bundle bundle = getIntent().getExtras();
        textViewName.setText(bundle.getString("name"));
        textViewProgramStudy.setText(bundle.getString("programStudy"));
        textViewAddress.setText(bundle.getString("address"));
        textViewPhoneNumber.setText(bundle.getString("phoneNumber"));
        textViewEmail.setText(bundle.getString("email"));
        textViewFacebook.setText(bundle.getString("facebook"));
        textViewInstagram.setText(bundle.getString("instagram"));
    }
}
