package com.example.rectanglecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etPanjang, etLebar;
    private Button btnHitung;
    private TextView tvHasil;
    double panjang, lebar, luas, keliling;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMoveActivity = findViewById(R.id.btn_hitung);

        etPanjang = findViewById(R.id.et_panjang);
        etLebar = findViewById(R.id.et_lebar);
        btnHitung = findViewById(R.id.btn_hitung);


        btnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung) {
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(etPanjang.getText().toString().trim())){
                isEmptyFields = true;
                etPanjang.setError("Field harus diisi");
            }
            if (TextUtils.isEmpty(etLebar.getText().toString().trim())){
                isEmptyFields = true;
                etLebar.setError("Field harus diisi");
            }
            if (!isEmptyFields){
                panjang = Double.parseDouble(etPanjang.getText().toString().trim());
                lebar = Double.parseDouble(etLebar.getText().toString().trim());
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                moveIntent.putExtra("Panjang", panjang);
                moveIntent.putExtra("Lebar", lebar);
                moveIntent.putExtra("Luas", luas);
                moveIntent.putExtra("Keliling", keliling);
                startActivity(moveIntent);
            }




        }
    }
}