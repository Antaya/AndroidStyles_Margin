package com.example.androidstyles_margin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Spinner languagesSpinner;
    private Spinner marginSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        languagesSpinner = findViewById(R.id.language);
        marginSpinner = findViewById(R.id.spinner_margin);

    }

    public void onClick(View v) {
        String selected = languagesSpinner.getSelectedItem().toString();

        if (selected.equals("Английский")) {
            Locale locale = new Locale("en");
            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        }

        if (selected.equals("Russian")) {
            Locale locale = new Locale("ru");

            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        }
    }

    public void changeTheme(View v) {
        String selected = marginSpinner.getSelectedItem().toString();

        switch (selected) {
            case "Мелкие":
                Utils.changeToTheme(this, Utils.THEME_MARGIN1);
                break;
            case "Small":
                Utils.changeToTheme(this, Utils.THEME_MARGIN1);
                break;
            case "Средние":
                Utils.changeToTheme(this, Utils.THEME_MARGIN2);
                break;
            case "Medium":
                Utils.changeToTheme(this, Utils.THEME_MARGIN2);
                break;
            case "Большие":
                Utils.changeToTheme(this, Utils.THEME_MARGIN3);
                break;
            case "Big":
                Utils.changeToTheme(this, Utils.THEME_MARGIN3);
                break;
        }
    }
}
