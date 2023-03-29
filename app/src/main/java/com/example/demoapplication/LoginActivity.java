package com.example.demoapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.TextView;

import com.example.demoapplication.databinding.ActivityLoginBinding;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class LoginActivity extends AppCompatActivity {

    TextView signInBtn;
    TextView loginBtn;

    TextView forgetPasswordBtn;
    private ActivityLoginBinding binding;
    boolean isVisitable = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        signInBtn = binding.signInBtn;
        loginBtn = binding.loginBtn;

        if (getIntent() != null && getIntent().hasExtra("name")) {
            String name = getIntent().getStringExtra("name");
            binding.editTextTextEmailAddress.setText(name);

        }

        signInBtn.setOnClickListener(view -> {
            startActivity( new Intent(LoginActivity.this, SignInActivity.class));
        });

        loginBtn.setOnClickListener(v -> {
            Intent intent = new Intent();
            HashMap<String,String> hashMap = new HashMap();
            hashMap.put("name","test");
            intent.putExtra("name",hashMap);
            setResult(RESULT_OK, intent);
            finish();
        });

        binding.forgetPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(LoginActivity.this, ForgetPasswordActivity.class));
            }
        });

        binding.backBtn.setOnClickListener(v -> {
            finish();
        });

        binding.showPassword.setOnClickListener(v -> {
            isVisitable = !isVisitable;
            if(isVisitable){
                binding.showPassword.setImageResource(R.drawable.visibility);
//                binding.editTextPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                binding.editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                binding.editTextPassword.setSelection(binding.editTextPassword.getText().length());
            }
            else{
                binding.showPassword.setImageResource(R.drawable.visitable_off);
                binding.editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                binding.editTextPassword.setSelection(binding.editTextPassword.getText().length());

                //binding.editTextPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}