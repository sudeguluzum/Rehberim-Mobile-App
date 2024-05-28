package com.example.rehberim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class tytActivity extends AppCompatActivity {
    Button btnTytT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tyt);


        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(view -> finish());

        Button btnTytT = findViewById(R.id.btnTytT);
        btnTytT.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytTurkceActivity.class);
            startActivity(intent);
        });

        Button btnTytM = findViewById(R.id.btnTytM);
        btnTytM.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytMatematikActivity.class);
            startActivity(intent);
        });

        Button btnTytG = findViewById(R.id.btnTytG);
        btnTytG.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytGeometriActivity.class);
            startActivity(intent);
        });

        Button btnTytB = findViewById(R.id.btnTytB);
        btnTytB.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytBiyolojiActivity.class);
            startActivity(intent);
        });

        Button btnTytK = findViewById(R.id.btnTytK);
        btnTytK.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytKimyaActivity.class);
            startActivity(intent);
        });

        Button btnTytF = findViewById(R.id.btnTytF);
        btnTytF.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytFizikActivity.class);
            startActivity(intent);
        });

        Button btnTytC = findViewById(R.id.btnTytC);
        btnTytC.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytCografyaActivity.class);
            startActivity(intent);
        });

        Button btnTytTarih = findViewById(R.id.btnTytTarih);
        btnTytTarih.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytTarihActivity.class);
            startActivity(intent);
        });

        Button btnTytDin = findViewById(R.id.btnTytDin);
        btnTytDin.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytDinKulturuActivity.class);
            startActivity(intent);
        });

        Button btnTytFelsefe = findViewById(R.id.btnTytFelsefe);
        btnTytFelsefe.setOnClickListener(view -> {
            Intent intent = new Intent(tytActivity.this, tytFelsefeActivity.class);
            startActivity(intent);
        });
    }
}
