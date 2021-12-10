package com.example.amars.sparksbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        getSupportActionBar().hide();

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep( 5000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(splash_screen.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }
}