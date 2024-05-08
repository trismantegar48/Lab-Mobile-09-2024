package com.example.pertemuan7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class HomeActivity extends AppCompatActivity {

    TextView tv_welcome;
    Button btn_logout, btn_setting;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_welcome = findViewById(R.id.tv_welcome);
        btn_logout = findViewById(R.id.btn_logout);
        btn_setting = findViewById(R.id.btn_setting);

        sharedPreferences = getSharedPreferences("user_pref", MODE_PRIVATE);
        String nim = sharedPreferences.getString("nim", "");

        // Menetapkan teks selamat datang dengan nim yang login
        tv_welcome.setText("Selamat Datang " + nim);

        btn_logout.setOnClickListener(view -> {
            // Menghapus status login (logout) dari SharedPreferences
            saveLoginStatus(false);

            // Mengarahkan kembali ke MainActivity
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });

        // Pengaturan tema berdasarkan preferensi yang tersimpan
        sharedPreferences = getSharedPreferences("theme_pref", MODE_PRIVATE);
        boolean isDarkTheme = sharedPreferences.getBoolean("is_dark_theme", false);
        if (isDarkTheme) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }

    // Method untuk menyimpan status login ke SharedPreferences
    private void saveLoginStatus(boolean isLoggedIn) {
        SharedPreferences sharedPreferences = getSharedPreferences("user_pref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isLoggedIn", isLoggedIn);
        editor.apply();
    }
}
