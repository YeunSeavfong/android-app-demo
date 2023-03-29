package com.example.demoapplication.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapplication.adapter.BestSellAdapter;
import com.example.demoapplication.adapter.CategoryAdapter;
import com.example.demoapplication.adapter.DiscountAdapter;
import com.example.demoapplication.databinding.FragmentHomeBinding;
import com.example.demoapplication.model.CategoryModel;
import com.example.demoapplication.model.ProductModel;
import com.example.demoapplication.provider.BestSellProvider;
import com.example.demoapplication.provider.CategoryProvider;
import com.example.demoapplication.provider.ProductProvider;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);


        ArrayList<CategoryModel> categories = new ArrayList<>();
        categories = new CategoryProvider().getProducts();

        //RecyclerView1
        CategoryAdapter categoryAdapter= new CategoryAdapter(categories);
        binding.recycleView1.setAdapter(categoryAdapter);
        binding.recycleView1.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false));

        // RecycleView2
        ArrayList<ProductModel> products = new ArrayList<>();
        products = new ProductProvider().getProductModels();
        DiscountAdapter discountAdapter = new DiscountAdapter(products);
        binding.discountRecycleView.setAdapter(discountAdapter);
        binding.discountRecycleView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false));

        binding.discountRecycleView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(),binding.discountRecycleView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                })
        );

        ArrayList<ProductModel> bestSellProducts = new ArrayList<>();
        bestSellProducts = new BestSellProvider().getProductModels();
        BestSellAdapter bestSellAdapter = new BestSellAdapter(bestSellProducts);
        binding.bestSellRecycleView.setAdapter(bestSellAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,RecyclerView.VERTICAL, false);
        binding.bestSellRecycleView.setLayoutManager(gridLayoutManager);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
