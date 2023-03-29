package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.demoapplication.R;
import com.example.demoapplication.databinding.ActivityForgetPasswordBinding;

public class ForgetPasswordActivity extends AppCompatActivity {

    ActivityForgetPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backToSigInBtn.setOnClickListener(v -> {
            finish();
        });
        binding.createAccountBtn.setOnClickListener(v -> {
            startActivity(new Intent(ForgetPasswordActivity.this, SignInActivity.class));
        });

        binding.continueBtn.setOnClickListener(v -> {
            startActivity(new Intent(ForgetPasswordActivity.this, VerifyOtpCodeActivity.class));
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
    //    @Override
//    public void onBackPressed() {
//        finishAffinity();
//    }
}