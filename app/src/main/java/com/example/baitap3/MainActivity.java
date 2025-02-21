package com.example.baitap3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private Switch switchBackground;
    private int[] backgroundImages = {
            R.drawable.background1,
            R.drawable.background2,
            R.drawable.bottom_btn1,
            R.drawable.bottom_btn2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        switchBackground = findViewById(R.id.switchBackground);

        changeBackground();

        switchBackground.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    changeBackground();
                }
            }
        });
    }

    private void changeBackground() {
        Random random = new Random();
        int randomIndex = random.nextInt(backgroundImages.length);
        layout.setBackgroundResource(backgroundImages[randomIndex]);
    }
}

