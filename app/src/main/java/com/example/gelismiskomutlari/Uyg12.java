package com.example.gelismiskomutlari;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Uyg12 extends AppCompatActivity {
    Button btnekle;
    EditText txtad;
    ListView adlar;
    ArrayList<String> isimlerListesi = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg12);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, isimlerListesi);
        btnekle = findViewById(R.id.btnekle2);
        txtad = findViewById(R.id.txtAd2);
        adlar = findViewById(R.id.Adlar);
        adlar.setAdapter(adapter);
        btnekle.setOnClickListener(view -> {
            String ad = txtad.getText().toString();
            isimlerListesi.add(ad);
            adapter.notifyDataSetChanged();
            txtad.getText().clear();
        });
        adlar.setOnItemClickListener((adapterView, view, i, l) -> {
            isimlerListesi.remove(i);
            adapter.notifyDataSetChanged();
        });
    }
}
