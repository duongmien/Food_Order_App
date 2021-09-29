package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Variables
    ImageView home_bg;
    TextView logo , slogan;
    Button login, signup;
    Animation topAnim, bottomAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
//        Animations
        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_ani);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_ani);
        home_bg= findViewById(R.id.img_home);
        logo=findViewById(R.id.logo);
        slogan=findViewById(R.id.slogan);
        login=findViewById(R.id.bt_login);
        signup=findViewById(R.id.bt_singup);
//        Set Animation
        slogan.setAnimation(topAnim);
        logo.setAnimation(topAnim);
        home_bg.setAnimation(topAnim);
        login.setAnimation(bottomAnim);
        signup.setAnimation(bottomAnim);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}