package com.example.demoapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapplication.adapter.ProductAdapter;
import com.example.demoapplication.databinding.FragmentHomeBinding;
import com.example.demoapplication.model.Product;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);


        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Shoes", "@drawable/shoes", 100));
        products.add(new Product("Jean", "@drawable/jean", 100));
        products.add(new Product("Red Shirt", "@drawable/shirt_red", 100));
        products.add(new Product("Sport Shoes", "@drawable/sport_shoes", 100));
        products.add(new Product("T-Shirt", "@drawable/t_shirt", 100));
        ProductAdapter adapter = new ProductAdapter(products);
        binding.recycleView1.setAdapter(adapter);
        binding.recycleView1.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}