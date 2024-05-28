package com.example.rehberim;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class aytActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayt); // ayt.xml dosyasını buraya bağlayın


        Button btnGeri=findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(view -> finish());

        Button btnAytE = findViewById(R.id.btnIng);
        btnAytE.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytEdebiyatActivity.class);
            startActivity(intent);
        });

        Button btnAytMat = findViewById(R.id.btnAlman);
        btnAytMat.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytMatematikActivity.class);
            startActivity(intent);
        });

        Button btnAytGeometri = findViewById(R.id.btnFran);
        btnAytGeometri.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytGeometriActivity.class);
            startActivity(intent);
        });

        Button btnAytTarih = findViewById(R.id.btnRus);
        btnAytTarih.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytTarihActivity.class);
            startActivity(intent);
        });

        Button btnAytCografya = findViewById(R.id.btnArap);
        btnAytCografya.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytCografyaActivity.class);
            startActivity(intent);
        });

        Button btnAytKimya = findViewById(R.id.btnAytKimya);
        btnAytKimya.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytKimyaActivity.class);
            startActivity(intent);
        });

        Button btnAytDin = findViewById(R.id.btnAytDin);
        btnAytDin.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytDinKulturuActivity.class);
            startActivity(intent);
        });

        Button btnAytBiyoloji = findViewById(R.id.btnAytBiyoloji);
        btnAytBiyoloji.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytBiyolojiActivity.class);
            startActivity(intent);
        });

        Button btnAytFelsefe = findViewById(R.id.btnAytFelsefe);
        btnAytFelsefe.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytFelsefeActivity.class);
            startActivity(intent);
        });

        Button btnAytFizik = findViewById(R.id.btnAytFizik);
        btnAytFizik.setOnClickListener(view -> {
            Intent intent = new Intent(aytActivity.this, aytFizikActivity.class);
            startActivity(intent);
        });
    }
}
