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

public class Login extends AppCompatActivity {
    ImageView img_login, img_ig, img_fb, img_gg;
    TextView text_singin, text_sigup, text_forgetpass;
    EditText username, pass;
    Button bt_signin;
    Animation topAnim, bottomAnim, leftAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
//        Set Animation
        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_ani);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_ani);
        leftAnim= AnimationUtils.loadAnimation(this, R.anim.left_ani);
//        Get element
        img_login=findViewById(R.id.img_login);
        img_fb=findViewById(R.id.img_fb);
        img_ig=findViewById(R.id.img_IG);
        img_gg=findViewById(R.id.img_gg);
        text_singin=findViewById(R.id.textDN);
        text_sigup=findViewById(R.id.text_signup);
        text_forgetpass=findViewById(R.id.quenmatkhau);
        username=findViewById(R.id.username);
        pass=findViewById(R.id.pass);
        bt_signin=findViewById(R.id.bt_login);
//        Set Animation
        img_login.setAnimation(topAnim);
        text_singin.setAnimation(topAnim);
//
        bt_signin.setAnimation(leftAnim);
        username.setAnimation(leftAnim);
        pass.setAnimation(leftAnim);
//
        text_sigup.setAnimation(bottomAnim);
        text_forgetpass.setAnimation(bottomAnim);
        img_gg.setAnimation(bottomAnim);
        img_fb.setAnimation(bottomAnim);
        img_ig.setAnimation(bottomAnim);

        text_sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Singup.class);
                startActivity(intent);
                finish();
            }
        });

        //h??? test activity h??? s??
//        Button loginDC = (Button) findViewById(R.id.bt_login);
//        loginDC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Login.this, HoSo.class);
//                startActivity(intent);
//                finish();
//            }
//        });
        // h??? test gi??? h??ng
//        Button loginDC = (Button) findViewById(R.id.bt_login);
//        loginDC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Login.this, Gio_Hang.class);
//                startActivity(intent);
//                finish();
//            }
//        });
        // Linh test dsm
        Button loginDC = (Button) findViewById(R.id.bt_login);
        loginDC.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
               Intent intent = new Intent(Login.this, DanhMucCon.class);
               startActivity(intent);
                finish();
           }
       });

    }
}