package com.learn.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListaPrzepisow_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kat = getIntent().getExtras().get(MainActivity.Extra_Kategoria).toString();
        TextView textView = findViewById(R.id.textView2);
        textView.setText(kat);
    }
}