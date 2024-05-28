package com.example.rehberim;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class aytGeometriActivity extends AppCompatActivity {
    // SharedPreferences'ta kullanılacak isim
    private static final String PREFS_NAME = "AytGeometriPrefs";
    // CheckBox'ların SharedPreferences'taki anahtarları için önek
    private static final String CHECKBOX_KEY_PREFIX = "AytGeometriCheckBox";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayt_geometri);

        // SharedPreferences nesnesini oluştur
        final SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        // CheckBox'ların durumunu SharedPreferences'tan al ve ayarla
        for (int i = 1; i <= 27; i++) {
            String key = CHECKBOX_KEY_PREFIX + i;
            boolean isChecked = sharedPreferences.getBoolean(key, false);
            CheckBox checkBox = findViewById(getResources().getIdentifier("checkBox" + i, "id", getPackageName()));
            checkBox.setChecked(isChecked);
        }

        // Geri butonuna tıklama olayını dinle
        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Activity'yi sonlandır
            }
        });

        // CheckBox'lara tıklama olayını dinleyen bir listener oluştur
        View.OnClickListener checkBoxClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                // CheckBox durumlarını SharedPreferences'e kaydet
                for (int i = 1; i <= 27; i++) {
                    String key = CHECKBOX_KEY_PREFIX + i;
                    CheckBox checkBox = findViewById(getResources().getIdentifier("checkBox" + i, "id", getPackageName()));
                    editor.putBoolean(key, checkBox.isChecked());
                }
                editor.apply(); // Değişiklikleri uygula
            }
        };

        // CheckBox'ları dinlemek için tıklama olayını ata
        for (int i = 1; i <= 27; i++) {
            CheckBox checkBox = findViewById(getResources().getIdentifier("checkBox" + i, "id", getPackageName()));
            checkBox.setOnClickListener(checkBoxClickListener);
        }
    }
}
