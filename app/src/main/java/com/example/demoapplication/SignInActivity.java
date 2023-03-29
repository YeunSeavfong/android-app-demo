package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.demoapplication.R;
import com.example.demoapplication.databinding.ActivitySigninBinding;

public class SignInActivity extends AppCompatActivity {

    ActivitySigninBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loginBtn.setOnClickListener(v ->{
            startActivity(new Intent(SignInActivity.this, LoginActivity.class));
        });
        binding.signInBtn.setOnClickListener(v -> {
            startActivity(new Intent(SignInActivity.this, MainActivity.class));
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}