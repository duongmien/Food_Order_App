package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Singup extends AppCompatActivity {
    TextView text_signin, text_signup;
    ImageView img_signup;
    Button bt_singup;
    EditText email, username, pass;
    Animation topAnim, bottomAnim, leftAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_singup);
//        Set Animation
        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_ani);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_ani);
        leftAnim= AnimationUtils.loadAnimation(this, R.anim.left_ani);
//       Get element
        text_signin=findViewById(R.id.text_signin);
        text_signup=findViewById(R.id.textDK);
        img_signup=findViewById(R.id.img_signup);
        email=findViewById(R.id.email);
        username=findViewById(R.id.username);
        pass=findViewById(R.id.pass);
        bt_singup=findViewById(R.id.bt_singup);
//        Set Animaton for Element
        text_signup.setAnimation(topAnim);
        img_signup.setAnimation(topAnim);
        email.setAnimation(leftAnim);
        username.setAnimation(leftAnim);
        pass.setAnimation(leftAnim);
        bt_singup.setAnimation(leftAnim);
        text_signin.setAnimation(bottomAnim);
        text_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}