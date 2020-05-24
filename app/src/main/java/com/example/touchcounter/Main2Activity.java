package com.example.touchcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button10=(Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_LONG).show();
                Intent myintent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(myintent);
                finish();
            }
        });
    }

    public void onBackPressed(){
        Intent myintent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(myintent);
        super.onBackPressed();
    }
}
