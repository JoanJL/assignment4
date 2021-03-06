package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DetailViewActivity extends Activity {

    private EditText nameField, emailField;
    BusinessContact receivedPersonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedPersonInfo = (BusinessContact)getIntent().getSerializableExtra("Contact");

        nameField = (EditText) findViewById(R.id.name);
        emailField = (EditText) findViewById(R.id.address);

        if(receivedPersonInfo != null){
            nameField.setText(receivedPersonInfo.busname);
            emailField.setText(receivedPersonInfo.busemail);
        }
    }

    public void updateContact(View v){
        //TODO: Update contact funcionality
    }

    public void eraseContact(View v)
    {
        //TODO: Erase contact functionality
    }
}
