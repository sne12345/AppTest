package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    //private FirebaseAuth mFirebaseAuth;
    Button btn_result, btn_P1, btn_P2,btn_P3,btn_P4,btn_P5,btn_P6, btn_levelup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_result = (Button)findViewById(R.id.btn_result); // = Fragment0
        btn_P1 = (Button)findViewById(R.id.btn_P1);
        btn_P2 = (Button)findViewById(R.id.btn_P2);
        btn_P3 = (Button)findViewById(R.id.btn_P3);
        btn_P4 = (Button)findViewById(R.id.btn_P4);
        btn_P5 = (Button)findViewById(R.id.btn_P5);
        btn_P6 = (Button)findViewById(R.id.btn_P6);
        btn_levelup = (Button)findViewById(R.id.btn_levelup); // = Fragment7

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment0 fragment0 = new Fragment0();

                transaction.replace(R.id.frame, fragment0);
                transaction.commit();
            }
        });

        btn_P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment1 fragment1 = new Fragment1();

                transaction.replace(R.id.frame, fragment1);
                transaction.commit();
            }
        });

        btn_P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();

                transaction.replace(R.id.frame, fragment2);
                transaction.commit();
            }
        });

        btn_P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment3 fragment3 = new Fragment3();

                transaction.replace(R.id.frame, fragment3);
                transaction.commit();
            }
        });

        btn_P4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment4 fragment4 = new Fragment4();

                transaction.replace(R.id.frame, fragment4);
                transaction.commit();
            }
        });

        btn_P5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment5 fragment5 = new Fragment5();

                transaction.replace(R.id.frame, fragment5);
                transaction.commit();
            }
        });

        btn_P6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment6 fragment6 = new Fragment6();

                transaction.replace(R.id.frame, fragment6);
                transaction.commit();
            }
        });

        btn_levelup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment7 fragment7 = new Fragment7();

                transaction.replace(R.id.frame, fragment7);
                transaction.commit();
            }
        });





    }



}