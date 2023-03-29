package com.example.demoapplication.ui.profile;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.demoapplication.LoginActivity;
import com.example.demoapplication.R;
import com.example.demoapplication.databinding.FragmentProfileBinding;

import java.util.HashMap;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;

    boolean isLogOut = false;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentProfileBinding.inflate(inflater, container, false);

        binding.logOutBtn.setOnClickListener(v -> {
            isLogOut =! isLogOut;
            if(isLogOut) {
                logout();
            }else {
                Intent intent = new Intent(getContext(),LoginActivity.class);
                intent.putExtra("name","user test");
                someActivityResultLauncher.launch(intent);
            }
        });

        return binding.getRoot();
    }

    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    HashMap<String,String> name = (HashMap<String, String>) result.getData().getSerializableExtra("name");

                    login(name.get("name"));
                }
            });

    private void login (String name){
        binding.imageView1.setImageResource(R.drawable.account_icon);
        binding.name.setText(name);
        binding.email.setVisibility(View.VISIBLE);
        binding.shopping.setVisibility(View.VISIBLE);
        binding.editIcon.setVisibility(View.VISIBLE);
        binding.payment.setVisibility(View.VISIBLE);
        binding.orderHistory.setVisibility(View.VISIBLE);
        binding.textBtn.setText("Log In");
        binding.logOutBtn.setPadding(0,50,0,0);
        binding.iconLogout.setVisibility(View.GONE);
    }

    private void logout () {
        binding.imageView1.setImageResource(R.drawable.account_icon);
        binding.name.setText("Sign In");
        binding.email.setVisibility(View.GONE);
        binding.shopping.setVisibility(View.GONE);
        binding.editIcon.setVisibility(View.GONE);
        binding.payment.setVisibility(View.GONE);
        binding.orderHistory.setVisibility(View.GONE);
        binding.textBtn.setText("Log In");
        binding.logOutBtn.setPadding(0,50,0,0);
        binding.iconLogout.setVisibility(View.GONE);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}