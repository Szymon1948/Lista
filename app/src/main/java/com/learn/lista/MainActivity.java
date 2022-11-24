package com.learn.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    public final static String Extra_Kategoria="nazwa_kategorii";
    public final static String Extra_id_kat = "id_kategorii";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView,
                                            View view,
                                            int i,
                                            long l) {
                        String kat = adapterView.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity.this,
                                kat,
                                Toast.LENGTH_SHORT).show();
                        Intent intencja = new Intent(MainActivity.this,
                                ListaPrzepisow_Activity.class);
                        intencja.putExtra(Extra_Kategoria,kat);
                        intencja.putExtra(Extra_id_kat,i);
                        startActivity(intencja);
                    }
                }
        );
    }
}