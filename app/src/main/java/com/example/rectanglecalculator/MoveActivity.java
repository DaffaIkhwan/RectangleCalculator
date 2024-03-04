package com.example.rectanglecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivity extends AppCompatActivity {

    private TextView tvHasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        tvHasil = findViewById(R.id.tv_data_received);

        double panjang = getIntent().getDoubleExtra("Panjang",0);
        double lebar = getIntent().getDoubleExtra("Lebar",0);
        double luas = getIntent().getDoubleExtra("Luas",0);
        double keliling = getIntent().getDoubleExtra("Keliling",0);

        tvHasil.setText("Panjang : " + panjang + " cm\nLebar : " + lebar + " cm\nLuas : " + luas + " cm\u00B2\nKeliling : " + keliling + " cm");
    }


}