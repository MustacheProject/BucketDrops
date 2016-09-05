package com.mustacheproject.bucketdrops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ImageViewTargetFactory;


public class ActivityMain extends AppCompatActivity {
    Toolbar mToolbar;
    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        btn_add = (Button) findViewById(R.id.btn_add);
        setSupportActionBar(mToolbar);
        initBackgroundImage();
    }

    private void initBackgroundImage() {
        /*Create this method to handle the background image
        Class taken from GitHub bumtech\Glide
        Open source media management for android
        */

        ImageView background = (ImageView)findViewById(R.id.iv_background);
        Glide.with(this)
            .load(R.drawable.background)
                .centerCrop()
            .into(background);
    }
}
