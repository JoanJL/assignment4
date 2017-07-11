package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateContactAcitivity extends Activity {

    private Button submitButton;
    // private EditText nameField, emailField;
    private MyApplicationData appState;
    private EditText busidField;  //???
    private EditText busnumberField; // phone number
    private EditText busnameField; // name
    private EditText primarybusinessField; // fisher, distributor...
    private EditText busaddressField; // address
    private EditText busprovinceField; // province
    private EditText busemailField; // email


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact_acitivity);
        //Get the app wide shared variables
        appState = ((MyApplicationData) getApplicationContext());

        submitButton = (Button) findViewById(R.id.submitButton);
        //nameField = (EditText) findViewById(R.id.name);
        //emailField = (EditText) findViewById(R.id.email);

        busidField = (EditText)           findViewById(R.id.id);
        busnumberField = (EditText)       findViewById(R.id.number);
        busnameField = (EditText)         findViewById(R.id.name);
        primarybusinessField = (EditText) findViewById(R.id.primarybus);
        busaddressField = (EditText)      findViewById(R.id.address);
        busprovinceField = (EditText)     findViewById(R.id.province);
        busemailField = (EditText)        findViewById(R.id.email);

    }

    public void submitInfoButton(View v) {
        //each entry needs a unique ID
        String personID = appState.firebaseReference.push().getKey();
        //String name = nameField.getText().toString();
        //String email = emailField.getText().toString();



        String busid = busidField.getText().toString();
        String busnumber = busnumberField.getText().toString();
        String busname = busnameField.getText().toString();
        String primarybusiness= primarybusinessField.getText().toString();
        String busaddress= busaddressField.getText().toString();
        String busprovince = busprovinceField.getText().toString();
        String busemail= busemailField.getText().toString();

        BusinessContact person = new BusinessContact(busid, busnumber, busname, primarybusiness, busaddress, busprovince, busemail);

        appState.firebaseReference.child(personID).setValue(person);

        finish();

    }
}
