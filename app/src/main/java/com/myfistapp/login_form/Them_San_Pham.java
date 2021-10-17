package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Them_San_Pham extends AppCompatActivity {

    Button btnthemsp;
    TextView txtcongtsp, txttrutsp, txtsltsp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themsanpham);

        AnhXa();

        //tăng số lượng sản phẩm
        txtcongtsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int slht = Integer.parseInt((String) txtsltsp.getText());
                txtsltsp.setText(slht+1+"");
            }
        });
        //giảm số lượng sản phẩm
        txttrutsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int slht = Integer.parseInt((String) txtsltsp.getText());
                if(slht > 1)
                    txtsltsp.setText(slht-1+"");
            }
        });

        //thêm sản phẩm vào giỏ hàng
        btnthemsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Them_San_Pham.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void AnhXa() {
        txtcongtsp = (TextView) findViewById(R.id.tvconglsp);
        txttrutsp = (TextView) findViewById(R.id.tvtrulsp);
        txtsltsp = (TextView) findViewById(R.id.tvsllsp);

        btnthemsp = (Button) findViewById(R.id.btntsp);
    }
}