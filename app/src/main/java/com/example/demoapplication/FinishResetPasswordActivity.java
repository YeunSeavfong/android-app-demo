package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.demoapplication.databinding.ActivityConfirmPasswordBinding;
import com.example.demoapplication.databinding.ActivityFinishResetPasswordBinding;

public class FinishResetPasswordActivity extends AppCompatActivity {

    ActivityFinishResetPasswordBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFinishResetPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.doneBtn.setOnClickListener(v -> {
            startActivity(new Intent(FinishResetPasswordActivity.this, MainActivity.class));
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(FinishResetPasswordActivity.this, MainActivity.class));
    }
}