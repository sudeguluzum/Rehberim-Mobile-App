package com.example.rehberim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class yabanciDilActivity extends AppCompatActivity {
    Button btnTytT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yabanci_dil);


        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(view -> finish());

        Button btnIng = findViewById(R.id.btnIng);
        btnIng.setOnClickListener(view -> {
            Intent intent = new Intent(yabanciDilActivity.this, ingilizceActivity.class);
            startActivity(intent);
        });

   Button btnAlman = findViewById(R.id.btnAlman);
        btnAlman.setOnClickListener(view -> {
            Intent intent = new Intent(yabanciDilActivity.this, almancaActivity.class);
            startActivity(intent);
        });

      Button btnFran = findViewById(R.id.btnFran);
        btnFran.setOnClickListener(view -> {
            Intent intent = new Intent(yabanciDilActivity.this, fransizcaActivity.class);
            startActivity(intent);
        });

        Button btnRus = findViewById(R.id.btnRus);
        btnRus.setOnClickListener(view -> {
            Intent intent = new Intent(yabanciDilActivity.this, ruscaActivity.class);
            startActivity(intent);
        });

        Button btnArap = findViewById(R.id.btnArap);
        btnArap.setOnClickListener(view -> {
            Intent intent = new Intent(yabanciDilActivity.this, arapcaActivity.class);
            startActivity(intent);
        });


    }
}
