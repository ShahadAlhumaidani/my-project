package com.example.shahadlap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button wh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wh = findViewById(R.id.bh);
        wh.setOnClickListener(this);
        wh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this,"workhours :\n" +
                        "Sunday-Thursday.\n" +
                        "8 am - 10 pm",1000).show();

                return true;
            }
        });


    }

    public void About(View view) {
        Intent i = new Intent(this, Activity_sec.class);
        startActivity(i);
    }

    public void Callus(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+966590003100"));
        startActivity(i);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this,"Please long press!",1000).show();
    }
}