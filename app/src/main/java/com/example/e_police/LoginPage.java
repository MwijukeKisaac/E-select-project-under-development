package com.example.e_police;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void GoToCreateAccount(View view) {
        Intent intent = new Intent(LoginPage.this, CreateAccount.class);
        startActivity(intent);
        finish();
    }

    public void GoToForgotAccount(View view) {
        Intent intent = new Intent(LoginPage.this, ForgotPassword.class);
        startActivity(intent);
    }

    public void GoT0CA(View view) {
        Intent intent = new Intent(LoginPage.this, CreateAdvanceUserAccount.class);
        startActivity(intent);
        finish();
    }
}