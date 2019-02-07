package com.example.hp.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Spla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spla);
        Thread background=new  Thread()
        {
            public void run()
            {
                try {
                    sleep(3000);
                    Intent i=new Intent(Spla.this,Main.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
        }
        };
        background.start();
    }
}
