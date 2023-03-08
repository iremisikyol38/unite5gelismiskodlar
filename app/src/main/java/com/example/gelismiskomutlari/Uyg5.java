package com.example.gelismiskomutlari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5 extends AppCompatActivity {


    EditText cihazAdi,cihazGucu,Gunluksaat;
    Button btnHesapla;
    TextView sonuc;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5);
        btnHesapla=findViewById(R.id.hesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextCihazAdi = findViewById(R.id.cihazAdi);
                EditText editTextKW = findViewById(R.id.editTextNumber2);
                EditText editTextGunlukKullanimSaat = findViewById(R.id.editTextNumber5);
                TextView textViewSonuc = findViewById(R.id.sonuc);
                String cihazAdi = editTextCihazAdi.getText().toString();
                int kw = Integer.parseInt(editTextKW.getText().toString());
                int saat = Integer.parseInt(editTextGunlukKullanimSaat.getText().toString());
                ElektirikliCihaz cihaz1 = new ElektirikliCihaz();
                cihaz1.cihazAdi = cihazAdi;
                cihaz1.cihazKW = kw;
                cihaz1.gunlukSaatKullanim=saat;
                int sonuc = cihaz1.aylikTuketim();
                textViewSonuc.setText(Integer.toString(sonuc));

            }
        });
    }
}
