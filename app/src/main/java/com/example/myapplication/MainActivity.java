package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.application.HomeApplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        String url = "https://static.toiimg.com//photo/83890825/83890825.jpg?imgsize=134489";


        Glide.with(HomeApplication.getAppContext())
                        .load(url)
                        .apply(new RequestOptions().override(600))
                        .into(imageView);
        //Glide.with(this).load("https://goo.gl/gEgYUd").into(imageView);
    }
}