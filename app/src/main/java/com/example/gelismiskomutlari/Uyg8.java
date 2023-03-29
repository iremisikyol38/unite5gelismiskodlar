package com.example.gelismiskomutlari;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8 extends AppCompatActivity {

    Button Arackapisi,Arabahiz,Arabacaliştir,Arabaisegit,minibuskapi,minibushiz,minibuscalistir,minibusisegit;
    TextView bilgi;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8);
        bilgi = findViewById(R.id.bilgi);
        Arackapisi = findViewById(R.id.Arackapisi);
        Arabahiz = findViewById(R.id.Arabahiz);
        Arabacaliştir = findViewById(R.id.Arabacalistir);
        Arabaisegit = findViewById(R.id.Arabaisegit);
        minibuskapi = findViewById(R.id.minibuskapi);
        minibushiz = findViewById(R.id.minibushiz);
        minibuscalistir = findViewById(R.id.minibuscalistir);
        minibusisegit = findViewById(R.id.minibusisegit);

        Araba araba = new Araba();
        araba.setkapisayisi(5);
        araba.setMaksimumhiz(160);


        Minibus minibus = new Minibus();
        minibus.setkapisayisi(3);
        minibus.setMaksimumhiz(120);

        Arabacaliştir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    bilgi.setText(araba.maksimumHizGoster());
            }

        });
        Arackapisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bilgi.setText(araba.kapiSayisiGoster());

            }
        });
        Arabahiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilgi.setText(araba.maksimumHizGoster());
            }
        });
        Arabaisegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilgi.setText(araba.iseGit());
            }
        });
        minibuskapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilgi.setText(minibus.kapiSayisiGoster());
            }
        });
        minibushiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilgi.setText(minibus.maksimumHizGoster());
            }
        });
        minibuscalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilgi.setText(minibus.calistir());
            }
        });
        minibusisegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilgi.setText(minibus.yolcuIndir());
            }
        });
    }
}
