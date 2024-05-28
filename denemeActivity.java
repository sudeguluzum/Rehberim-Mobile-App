package com.example.rehberim;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class denemeActivity extends AppCompatActivity {

    EditText tyt_t_d, tyt_t_y, tyt_t_n,
            tyt_m_d, tyt_m_y, tyt_m_n,
            tyt_s_d, tyt_s_y, tyt_s_n,
            tyt_f_d, tyt_f_y, tyt_f_n, tytHesapla,
            ayt_e_d, ayt_e_y, ayt_e_n,
            ayt_m_d, ayt_m_y, ayt_m_n,
            ayt_s_d, ayt_s_y, ayt_s_n,
            ayt_f_d, ayt_f_y, ayt_f_n, aytHesapla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deneme_takip);

        Button btnGeri=findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(view -> finish());

        // Türkçe
        tyt_t_d = findViewById(R.id.tyt_t_d);
        tyt_t_y = findViewById(R.id.tyt_t_y);
        tyt_t_n = findViewById(R.id.tyt_t_n);
        // Matematik
        tyt_m_d = findViewById(R.id.tyt_m_d);
        tyt_m_y = findViewById(R.id.tyt_m_y);
        tyt_m_n = findViewById(R.id.tyt_m_n);
        // Sosyal
        tyt_s_d = findViewById(R.id.tyt_s_d);
        tyt_s_y = findViewById(R.id.tyt_s_y);
        tyt_s_n = findViewById(R.id.tyt_s_n);
        // Fen
        tyt_f_d = findViewById(R.id.tyt_f_d);
        tyt_f_y = findViewById(R.id.tyt_f_y);
        tyt_f_n = findViewById(R.id.tyt_f_n);

        tytHesapla = findViewById(R.id.tytHesapla);

        // Edebiyat
        ayt_e_d = findViewById(R.id.ayt_e_d);
        ayt_e_y = findViewById(R.id.ayt_e_y);
        ayt_e_n = findViewById(R.id.ayt_e_n);
        // Matematik
        ayt_m_d = findViewById(R.id.ayt_m_d);
        ayt_m_y = findViewById(R.id.ayt_m_y);
        ayt_m_n = findViewById(R.id.ayt_m_n);
        // Sosyal
        ayt_s_d = findViewById(R.id.ayt_s_d);
        ayt_s_y = findViewById(R.id.ayt_s_y);
        ayt_s_n = findViewById(R.id.ayt_s_n);
        // Fen
        ayt_f_d = findViewById(R.id.ayt_f_d);
        ayt_f_y = findViewById(R.id.ayt_f_y);
        ayt_f_n = findViewById(R.id.ayt_f_n);

        aytHesapla = findViewById(R.id.aytHesapla);

        findViewById(R.id.btnTytHesapla).setOnClickListener(view -> {
            // Türkçe net hesaplama
            //Eğer dönüştürme işlemi başarısız olursa, yani metin bir sayıya çevrilemezse, varsayılan bir değer döndürür.
            int dogruT = parseOrDefault(tyt_t_d.getText().toString());
            int yanlisT = parseOrDefault(tyt_t_y.getText().toString());
            double netDogruT = dogruT - (yanlisT * 0.25);
            tyt_t_n.setText(String.valueOf(netDogruT));

            // Matematik net hesaplama
            int dogruM = parseOrDefault(tyt_m_d.getText().toString());
            int yanlisM = parseOrDefault(tyt_m_y.getText().toString());
            double netDogruM = dogruM - (yanlisM * 0.25);
            tyt_m_n.setText(String.valueOf(netDogruM));

            // Sosyal net hesaplama
            int dogruS = parseOrDefault(tyt_s_d.getText().toString());
            int yanlisS = parseOrDefault(tyt_s_y.getText().toString());
            double netDogruS = dogruS - (yanlisS * 0.25);
            tyt_s_n.setText(String.valueOf(netDogruS));

            // Fen net hesaplama
            int dogruF = parseOrDefault(tyt_f_d.getText().toString());
            int yanlisF = parseOrDefault(tyt_f_y.getText().toString());
            double netDogruF = dogruF - (yanlisF * 0.25);
            tyt_f_n.setText(String.valueOf(netDogruF));

            // Toplam net hesaplama
            double toplamNet = netDogruT + netDogruM + netDogruS + netDogruF;
            tytHesapla.setText(String.valueOf(toplamNet));
        });

        findViewById(R.id.btnAytHesapla).setOnClickListener(view -> {
            // Edebiyat net hesaplama
            int dogruT = parseOrDefault(ayt_e_d.getText().toString());
            int yanlisT = parseOrDefault(ayt_e_y.getText().toString());
            double netDogruT = dogruT - (yanlisT * 0.25);
            ayt_e_n.setText(String.valueOf(netDogruT));

            // Matematik net hesaplama
            int dogruM = parseOrDefault(ayt_m_d.getText().toString());
            int yanlisM = parseOrDefault(ayt_m_y.getText().toString());
            double netDogruM = dogruM - (yanlisM * 0.25);
            ayt_m_n.setText(String.valueOf(netDogruM));

            // Sosyal net hesaplama
            int dogruS = parseOrDefault(ayt_s_d.getText().toString());
            int yanlisS = parseOrDefault(ayt_s_y.getText().toString());
            double netDogruS = dogruS - (yanlisS * 0.25);
            ayt_s_n.setText(String.valueOf(netDogruS));

            // Fen net hesaplama
            int dogruF = parseOrDefault(ayt_f_d.getText().toString());
            int yanlisF = parseOrDefault(ayt_f_y.getText().toString());
            double netDogruF = dogruF - (yanlisF * 0.25);
            ayt_f_n.setText(String.valueOf(netDogruF));

            // Toplam net hesaplama
            double toplamNet = netDogruT + netDogruM + netDogruS + netDogruF;
            aytHesapla.setText(String.valueOf(toplamNet));
        });
    }

    private int parseOrDefault(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /*Bu metod, bir metin değerini tam sayıya (int) dönüştürmeye çalışır.
    Eğer dönüşüm başarılı olursa, metni tam sayıya dönüştürüp döndürür.
    Ancak, eğer metin bir tam sayıya dönüştürülemezse (yapısal bir hata varsa veya metin boşsa),
    NumberFormatException hatası alınır. Bu hatayı yakalar ve 0 değerini döndürür.
    Özetle, parseOrDefault metodu, verilen metin değerini tam sayıya dönüştürmeye çalışır.
    Eğer dönüşüm başarılı olursa dönüştürülen tam sayı değerini, başarısız olursa 0 değerini döndürür.*/
}








