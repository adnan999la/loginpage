package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button button;
private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     button =(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                EditText username=(EditText) findViewById(R.id.usernameid1);
                EditText password=(EditText) findViewById(R.id.passwordid);
                if (username.getText().toString().equals("adnan99")&&password.getText().toString().equals("adnan1234")) {
                    openActivity2();
                }
            }

            private void openActivity2() {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        }));
    }

    private void openActivity3() {
        Intent intent2=new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent2);
    }


}