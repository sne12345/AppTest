package com.example.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;


public class MockTestActivity extends AppCompatActivity {

    Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mocktest_home);

        btn_start = (Button)findViewById(R.id.btn_startTest);

//        btn_start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MockTestActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}