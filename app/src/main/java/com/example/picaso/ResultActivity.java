package com.example.picaso;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.picaso.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getActionBar().hide();

        binding.image.setImageURI(getIntent().getData());


    }
}