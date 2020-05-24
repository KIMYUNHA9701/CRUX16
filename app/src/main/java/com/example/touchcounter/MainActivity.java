package com.example.touchcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backBtnTime=0;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button9=(Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"다음페이지",Toast.LENGTH_LONG).show();
                Intent myintent =new Intent(MainActivity.this, Main2Activity.class);
                startActivity(myintent);
                finish();
            }
        });

    }
    public void onBackPressed(){
            long curTime = System.currentTimeMillis();
            long gapTime=curTime-backBtnTime;

            if(0<=gapTime && 2000>=gapTime){
                super.onBackPressed();
            }
            else{
                backBtnTime=curTime;
                Toast.makeText(this,"한번더 누르면 종료됩니다",Toast.LENGTH_SHORT).show();

            }
    }

}
