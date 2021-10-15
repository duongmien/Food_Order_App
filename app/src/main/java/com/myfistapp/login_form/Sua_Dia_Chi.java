package com.myfistapp.login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Sua_Dia_Chi extends AppCompatActivity {

    ImageView imgvbacksdc;
    EditText txthoten, txtsdt, txtsonha, txtxa, txthuyen, txtthanhpho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suadiachi);

        AnhXa();

        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("diachi");

        if(bundle != null) {

            txthoten.setText(bundle.getString("hoten"));
            txtsdt.setText(bundle.getString("sdt"));
            txtsonha.setText(bundle.getString("sonha"));
            txtxa.setText(bundle.getString("xa"));
            txthuyen.setText(bundle.getString("huyen"));
            txtthanhpho.setText(bundle.getString("thanhpho"));

        }


        //quay lại trang địa chỉ
        imgvbacksdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sua_Dia_Chi.this, Dia_Chi.class);
                startActivity(intent);
                finish();
            }
        });
    }

        private void AnhXa() {
        imgvbacksdc = (ImageView) findViewById(R.id.imgvbacksdc);
        txthoten = (EditText) findViewById(R.id.edthotensdc);
        txtsdt = (EditText) findViewById(R.id.edtsdtsdc);
        txtxa = (EditText) findViewById(R.id.edtxasdc);
        txthuyen = (EditText) findViewById(R.id.edthuyensdc);
        txtsonha = (EditText) findViewById(R.id.edtsonhasdc);
        txtthanhpho = (EditText) findViewById(R.id.edtthanhphosdc);
    }
}