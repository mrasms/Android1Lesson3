package com.example.android1lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imAnimals;
    Button btnCat, btnDog, btnHorse;
    boolean isItCat, isItDog, isItHorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisation();
        setupListener();
    }

    private void initialisation() {
        imAnimals = findViewById(R.id.im_img);
        btnCat = findViewById(R.id.btn_cat);
        btnDog = findViewById(R.id.btn_dog);
        btnHorse = findViewById(R.id.btn_horse);
    }

    private void setupListener() {
        btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation animRotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                final Animation animBackAndForth = AnimationUtils.loadAnimation(MainActivity.this, R.anim.back_and_forth);
                if (isItCat) {
                    view.startAnimation(animRotate);
                    Toast.makeText(MainActivity.this, "Верно!", Toast.LENGTH_SHORT).show();
                } else if (!isItCat) {
                    view.startAnimation(animBackAndForth);
                    Toast.makeText(MainActivity.this, "Нет! Это не котик!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation animRotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                final Animation animBackAndForth = AnimationUtils.loadAnimation(MainActivity.this, R.anim.back_and_forth);
                if (isItDog) {
                    view.startAnimation(animRotate);
                    Toast.makeText(MainActivity.this, "Верно!", Toast.LENGTH_SHORT).show();
                } else if (!isItDog) {
                    view.startAnimation(animBackAndForth);
                    Toast.makeText(MainActivity.this, "Как ты мог не узнать это животное?", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation animRotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                final Animation animBackAndForth = AnimationUtils.loadAnimation(MainActivity.this, R.anim.back_and_forth);
                if (isItHorse) {
                    view.startAnimation(animRotate);
                    Toast.makeText(MainActivity.this, "Верно!", Toast.LENGTH_SHORT).show();
                } else if (!isItHorse) {
                    view.startAnimation(animBackAndForth);
                    Toast.makeText(MainActivity.this, "Это не лошадка", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void changePicture(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                isItCat = true;
                isItDog = false;
                isItHorse = false;
                imAnimals.setImageResource(R.drawable.cat);
                break;
            case R.id.btn_two:
                isItCat = false;
                isItDog = true;
                isItHorse = false;
                imAnimals.setImageResource(R.drawable.dog);
                break;
            case R.id.btn_three:
                isItCat = false;
                isItDog = false;
                isItHorse = true;
                imAnimals.setImageResource(R.drawable.horse);
                break;
        }
    }
}