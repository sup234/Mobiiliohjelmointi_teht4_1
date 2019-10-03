package com.example.teht4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnEnableDisable;
    private EditText editteksti;
    private String teksti;
    private boolean enabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            teksti = savedInstanceState.getString("editteksti");
            enabled = savedInstanceState.getBoolean("enabled");
        }
        btnEnableDisable = findViewById(R.id.btn1);
        editteksti = findViewById(R.id.edittext1);
        editteksti.setText(teksti);
        editteksti.setEnabled(enabled);
    }

    public void btnEnableDisableClick(View view) {
        if (editteksti.isEnabled() == true) {
            editteksti.setEnabled(false);
            enabled = false;
        }
        else {
            editteksti.setEnabled(true);
            enabled = true;
        }

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("editteksti", teksti);
        savedInstanceState.putBoolean("enabled", enabled);
        super.onSaveInstanceState(savedInstanceState);

    }
}
