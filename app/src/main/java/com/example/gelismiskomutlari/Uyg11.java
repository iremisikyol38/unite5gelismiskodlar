package com.example.gelismiskomutlari;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11 extends AppCompatActivity {
    public Integer[] notlar = new Integer[6];
    public int index=0;
    TextView txtindex1,txttoplam;
    Button btnEkle,btnSifirla;
    EditText txtsayi1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11);
        txtindex1 = findViewById(R.id.index1);
        txttoplam = findViewById(R.id.toplam1);
        txtsayi1 = findViewById(R.id.txtsayi1);
        btnEkle = findViewById(R.id.btnekle);
        btnSifirla = findViewById(R.id.btnsifirla);
       btnEkle.setOnClickListener(view -> {
            if (index <6){
                int sayi;
                sayi = Integer.parseInt(txtsayi1.getText().toString());
                notlar[index]=sayi;
                index++;
                txtindex1.setText("index: " + Integer.toString(index));
                int toplam = 0;
                for (int i = 0; i < index; i++) {
                    toplam += notlar[i];
                }
                txttoplam.setText("Toplam: " + Integer.toString(toplam));
                txtsayi1.getText().clear();
            }
            else{
                txtindex1.setText("Dizi dolu");
            }
        });
        btnSifirla.setOnClickListener(view -> {
            index=0;
            txtindex1.setText("index: 0");
            txttoplam.setText("Toplam: 0");
            notlar = new Integer[6];
        });
    }
}

