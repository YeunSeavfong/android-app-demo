package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.demoapplication.databinding.ActivitySplashPageBinding;

import java.util.Timer;

public class SplashPageActivity extends AppCompatActivity {
    ActivitySplashPageBinding binding;
    Animation imageAnimation ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        imageAnimation = AnimationUtils.loadAnimation(this,R.anim.image_animation);
        binding.imageLogo.setAnimation(imageAnimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashPageActivity.this, MainActivity.class));
            }
        }, 3500);
    }

}