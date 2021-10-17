package com.myfistapp.login_form;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HoSo extends AppCompatActivity {

    TextView txtdiachi, txtmatkhau, txtdangxuat, txtxtk;
    ImageView imgvchinhsua, imgvgio6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoso);

        AnhXa();


        //Yêu cầu xóa tài khoản
        txtxtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XoaTK();
            }
        });

        //đến trang địa chỉ
        txtdiachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Dia_Chi.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang mật khẩu
        txtmatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Thiet_Lap_Mat_Khau.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang chỉnh sửa thông tin cá nhân
        imgvchinhsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Chinh_Sua_Thong_Tin.class);
                startActivity(intent);
                finish();
            }
        });


        //đăng xuất, trở về trang đăng nhập
        txtdangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //đến trang giỏ hàng
        imgvgio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoSo.this, Gio_Hang.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void AnhXa() {

        txtxtk = (TextView) findViewById(R.id.tvhosoxoatk);
        txtdangxuat = (TextView) findViewById(R.id.tvhosodangxuat);
        txtdiachi = (TextView) findViewById(R.id.tvhosodiachi);
        txtmatkhau = (TextView) findViewById(R.id.tvhosomatkhau);
        imgvchinhsua = (ImageView) findViewById(R.id.imgvchinhsua);
        imgvgio6 = (ImageView) findViewById(R.id.gio1);

    }

    private void XoaTK() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Xóa tài khoản");
        alert.setMessage("Chúng tôi rất lấy làm tiếc khi bạn muốn rời Shunshine, nhưng xin lưu ý các tài khoản đã bị xóa sẽ không được mở trở lại.");

        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(HoSo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        alert.show();
    }
}