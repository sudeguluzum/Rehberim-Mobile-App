package com.example.rehberim;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private long kalanZamanMillis;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextView'i layout dosyanızda tanımladıktan sonra
        textView1 = findViewById(R.id.textView1);

// Sınav tarihini belirleyin
        Calendar sınavTarihi = Calendar.getInstance();
        sınavTarihi.set(2024, Calendar.JUNE, 8);

        Calendar şuankiTarih = Calendar.getInstance();
        kalanZamanMillis = sınavTarihi.getTimeInMillis() - şuankiTarih.getTimeInMillis();

// Zamanı gün, saat, dakika ve saniyeye böl
        long gün = kalanZamanMillis / (1000 * 60 * 60 * 24);
        long saat = (kalanZamanMillis % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long dakika = (kalanZamanMillis % (1000 * 60 * 60)) / (1000 * 60);
        long saniye = (kalanZamanMillis % (1000 * 60)) / 1000;

// TextView'in metnini güncelleyin
        textView1.setText("YKS'ye " + gün + " gün " + saat +  " saat\n" + dakika + " dakika " + saniye + " saniye kaldı");

// CountdownTimer'ı başlatın
        new CountDownTimer(kalanZamanMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                kalanZamanMillis = millisUntilFinished;
                long gün = kalanZamanMillis / (1000 * 60 * 60 * 24);
                long saat = (kalanZamanMillis % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
                long dakika = (kalanZamanMillis % (1000 * 60 * 60)) / (1000 * 60);
                long saniye = (kalanZamanMillis % (1000 * 60)) / 1000;

                textView1.setText("YKS'ye " + gün + " gün " + saat + " saat\n" + dakika + " dakika " + saniye + " saniye kaldı");
            }

            @Override
            public void onFinish() {
                textView1.setText("Sınav zamanı geldi!");
            }
        }.start();


        // SharedPreferences nesnesini oluştur
        SharedPreferences preferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

// SharedPreferences'tan "savedText" anahtarına sahip değeri al, eğer yoksa boş string al
        String savedText = preferences.getString("savedText", "");

// EditText'i layout dosyanızda tanımladıktan sonra EditText'in metnini SharedPreferences'tan alınan değerle güncelleyin
        EditText editText = findViewById(R.id.editTextText);
        editText.setText(savedText);

// EditText'e herhangi bir değer girildiğinde bu değeri SharedPreferences'e kaydedin
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                preferences.edit().putString("savedText", editText.getText().toString()).apply();
            }
        });

// textView2 öğesine tıklandığında denemeActivity sayfasını açan Intent oluşturun
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, denemeActivity.class);
            startActivity(intent); // Intent'i başlat
        });

        // textView3 öğesine tıklandığında açılacak sayfayı tanımlayan Intent oluşturuluyor
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, tytActivity.class);
            startActivity(intent); // Intent başlatılıyor
        });

        // textView4 öğesine tıklandığında açılacak sayfayı tanımlayan Intent oluşturuluyor
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, aytActivity.class);
            startActivity(intent); // Intent başlatılıyor
        });

        // textView5 öğesine tıklandığında açılacak sayfayı tanımlayan Intent oluşturuluyor
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, yabanciDilActivity.class);
            startActivity(intent); // Intent başlatılıyor
        });


    }
}
