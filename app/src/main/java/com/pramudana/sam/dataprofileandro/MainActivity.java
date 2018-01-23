package com.pramudana.sam.dataprofileandro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFullName, etAddress, etEmail, etTelp;
    Button btnInput;
    TextView txtFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFullName = (EditText) findViewById(R.id.etFullName);
        etAddress = (EditText) findViewById(R.id.etAddress);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etTelp = (EditText) findViewById(R.id.etTelp);
        txtFullName = (TextView) findViewById(R.id.txtFullName);
        btnInput = (Button) findViewById(R.id.btnInput);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sFullName = etFullName.getText().toString();
                String sAddress = etAddress.getText().toString();
                String sEmail = etEmail.getText().toString();
                String sTelp = etTelp.getText().toString();

                if (sFullName.isEmpty()){
                    etFullName.setError("Name Can Not Be Empty");
                }else if (sEmail.isEmpty()){
                    etEmail.setError("Email Can Not Be Empty");
                }else if (sAddress.isEmpty()){
                    etAddress.setError("Address Can Not Be Empty");
                }else if (sTelp.isEmpty()){
                    etTelp.setError("Telphone Cant Not Be Empty");
                }
                    txtFullName.setText("Name : " + sFullName + " \nEmail : " + sEmail + " \nAddress : " + sAddress + " \nTelphone : " + sTelp);
            }
        });
    }
}
