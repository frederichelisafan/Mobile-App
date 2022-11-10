package id.ac.umn.financialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signuphere(View view)
    {
        Intent signuphere = new Intent(Login.this, Signup.class);
        startActivity(signuphere);
    }
}