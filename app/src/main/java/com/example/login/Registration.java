package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity {
    private FirebaseAuth mFirebaseAuth; //파이어베이스 인증
    private DatabaseReference mDatabaseRef; //실시간 데이터베이스
    private EditText mEtEmail, mEtPwd, mEtPwd2;
    private Button mBtnRegister;
    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();

        mEtEmail = findViewById(R.id.et_email);
        mEtPwd = findViewById(R.id.et_pwd);
        mEtPwd2 = findViewById(R.id.et_pwd2);

        mBtnRegister=findViewById(R.id.btn_register);

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //회원가입 처리 시작
                String strEmail = mEtEmail.getText().toString();
                String strPwd = mEtPwd.getText().toString();
                String strPwd2 =mEtPwd2.getText().toString();

                //파이어베이스어스 진행
                if (strPwd==strPwd2){
                mFirebaseAuth.createUserWithEmailAndPassword(strEmail,strPwd).addOnCompleteListener(Registration.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            FirebaseUser firebaseuser = mFirebaseAuth.getCurrentUser();
                            UserAccount account = new UserAccount();
                            account.setIdtoken(firebaseuser.getUid());
                            account.setEmailId((firebaseuser.getEmail()));
                            account.setPassword(strPwd);
                            //setValue = database에 insert함
                            mDatabaseRef.child("UserAccount").child(firebaseuser.getUid()).setValue(account);

                            Toast.makeText(Registration.this,"Success!",Toast.LENGTH_SHORT).show();

                        }else{
                            Toast.makeText(Registration.this,"Failed. Try Again",Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }

                else {
                    toast = Toast.makeText(Registration.this, "Incorrect Password", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, -200);
                    toast.show();
                }
            }
        });


    }
}