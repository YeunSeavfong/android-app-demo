package com.example.demoapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.demoapplication.databinding.ActivityVerifyOtpCodeBinding;
import com.google.android.material.snackbar.Snackbar;

import java.nio.Buffer;

public class VerifyOtpCodeActivity extends AppCompatActivity {

    ActivityVerifyOtpCodeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerifyOtpCodeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.continueBtn.setOnClickListener(v -> {
            startActivity(new Intent(VerifyOtpCodeActivity.this, ConfirmPasswordActivity.class));
        });

        binding.otp1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().isEmpty()){
                    binding.otp2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        binding.otp2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().isEmpty()){
                    binding.otp3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().isEmpty()){
                    binding.otp1.requestFocus();
                }
            }
        });

        binding.otp3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().isEmpty()){
                    binding.otp4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().isEmpty()){
                    binding.otp2.requestFocus();
                }
            }
        });

        binding.otp4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().isEmpty()){
                    binding.otp3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    static class  GenericTextWatcher implements TextWatcher{

        private EditText[] editTexts;
        private View view;

        private Buffer otpBuffer ;

        private int optCounter = 0;

        public GenericTextWatcher(){
        };

        public GenericTextWatcher(View view, EditText[] editText){
            this.editTexts = editText;
            this.view = view;
        }

        public Buffer getOtpBuffer() {
            return otpBuffer;
        }

        public int getOptCounter() {
            return optCounter;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            String text = s.toString();
            switch (view.getId()){
                case R.id.otp1:
                    if(text.length() == 1){
                        optCounter+=1;
                        editTexts[1].requestFocus();
                    }
                case  R.id.otp2:
                    if(text.length() == 1){
                        optCounter+=1;
                        editTexts[2].requestFocus();
                    } else if (text.length() == 0) {
                        optCounter-=1;
                        editTexts[0].requestFocus();
                    }
                case R.id.otp3:
                    if(text.length() == 1){
                        optCounter += 1;
                        editTexts[3].requestFocus();
                    } else if (text.length() == 0) {
                        optCounter -= 1;
                        editTexts[1].requestFocus();
                    }
                case R.id.otp4:
                    if(text.length() == 1){
                        optCounter += 1;
                    } else if (text.length()==0){
                        optCounter -=1;
                        System.out.println(optCounter);
                        editTexts[2].requestFocus();
                    }
            }
        }
    }
}