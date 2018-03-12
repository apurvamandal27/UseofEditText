package com.example.android.useofedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    EditText et_username,et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login=findViewById(R.id.btn_login);
        et_username=findViewById(R.id.et_username);
        et_password=findViewById(R.id.et_password);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_username.getText().toString().equals("") || et_password.getText().toString().equals(""))
                {
                    if(et_username.getText().toString().equals(""))
                        et_username.setError("Please enter username");
                    if(et_password.getText().toString().equals(""))
                        et_password.setError("Please enter password");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login successful "+et_username.getText(), Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
