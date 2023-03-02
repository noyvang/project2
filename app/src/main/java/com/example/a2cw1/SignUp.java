package com.example.a2cw1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    EditText ETusernmae,ETpassword,ETphone,ETemail;
    Button buttonsigin,buttonSubmit;
    String usrename,password,phone,email;
    MyDatabase myDatabase;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_signup);
        myDatabase = new MyDatabase(this);

        ETusernmae = findViewById(R.id.txtUsername);
        ETpassword = findViewById(R.id.txtPassword);
        ETphone = findViewById(R.id.txtPhone);
        ETemail = findViewById(R.id.txtEmail);

        buttonsigin = findViewById(R.id.btnling);
       buttonSubmit = findViewById(R.id.btnsubmit);

        buttonsigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginInten = new Intent(getApplication(),MainActivity.class);
                startActivity(LoginInten);
            }
        });
        //set Even onclick hai kup poum submit
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usrename = ETusernmae.getText().toString();
                password = ETpassword.getText().toString();
                phone=  ETphone.getText().toString();
                email = ETemail.getText().toString();
                boolean insertData = myDatabase.InsertData(usrename,password,phone,email);
                if (insertData == true){
                    Toast.makeText(getApplication(),"ທ່ານໄດ້ລົງຖະບຽນຮຽບນຮ້ອຍແລ້ວ",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplication(),"ທ່ານລົງຖະບຽນບໍ່ສຳເລັດ ກລູນາລອງໃໝ່",Toast.LENGTH_LONG).show();
                }
                clearData();
            }
        });
    }

    private void clearData() {
        ETusernmae.setText("");
        ETpassword.setText("");
        ETphone.setText("");
        ETemail.setText("");
    }
}