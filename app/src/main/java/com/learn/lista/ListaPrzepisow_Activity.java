package com.learn.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaPrzepisow_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kat = getIntent().getExtras().get(MainActivity.Extra_Kategoria).toString();
        TextView textView = findViewById(R.id.textView2);
        textView.setText(kat);
        int id = getIntent().getIntExtra(MainActivity.Extra_id_kat,0);

        ArrayList<Przepis> wybranePrzepisy = RepozytoriumPrzepisow.wybierz(id);
        ArrayAdapter<Przepis> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                wybranePrzepisy
                );

        ListView listaPrzepisowListView = findViewById(R.id.listView2);
        listaPrzepisowListView.setAdapter(adapter);
    }

}