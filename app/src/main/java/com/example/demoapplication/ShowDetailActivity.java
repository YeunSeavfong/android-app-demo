package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demoapplication.R;
import com.example.demoapplication.databinding.ActivityShowDetailBinding;

public class ShowDetailActivity extends AppCompatActivity {
    ActivityShowDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}