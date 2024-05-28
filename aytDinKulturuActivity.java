package com.example.rehberim;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class aytDinKulturuActivity extends AppCompatActivity {
    private static final String PREFS_NAME = "AytDinPrefs";
    private static final String CHECKBOX_KEY_PREFIX = "AytDinCheckBox";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayt_din);

        final SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        for (int i = 1; i <= 10; i++) {
            String key = CHECKBOX_KEY_PREFIX + i;
            boolean isChecked = sharedPreferences.getBoolean(key, false);
            CheckBox checkBox = findViewById(getResources().getIdentifier("checkBox" + i, "id", getPackageName()));
            checkBox.setChecked(isChecked);
        }

        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        View.OnClickListener checkBoxClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                for (int i = 1; i <= 10; i++) {
                    String key = CHECKBOX_KEY_PREFIX + i;
                    CheckBox checkBox = findViewById(getResources().getIdentifier("checkBox" + i, "id", getPackageName()));
                    editor.putBoolean(key, checkBox.isChecked());
                }
                editor.apply();
            }
        };

        for (int i = 1; i <= 10; i++) {
            CheckBox checkBox = findViewById(getResources().getIdentifier("checkBox" + i, "id", getPackageName()));
            checkBox.setOnClickListener(checkBoxClickListener);
        }
    }
}
