package com.example.demoapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.example.demoapplication.databinding.ActivityConfirmPasswordBinding;

public class ConfirmPasswordActivity extends AppCompatActivity {

    ActivityConfirmPasswordBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConfirmPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.continueBtn.setOnClickListener(v -> {
            startActivity(new Intent(ConfirmPasswordActivity.this, FinishResetPasswordActivity.class));
        });
    }
}