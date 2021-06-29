package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mFirebaseAuth;
    EditText userID;
    public int id_number = 1;

    public int userID(){
        id_number++;
        return id_number;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userID=findViewById(R.id.userID);
        userID.setText("Hello User "+id_number);

        //탈퇴
        //mFirebaseAuth.getCurrentUser().delete();

    }
}