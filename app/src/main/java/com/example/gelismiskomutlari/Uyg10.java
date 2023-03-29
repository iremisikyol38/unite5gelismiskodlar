package com.example.gelismiskomutlari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10 extends AppCompatActivity {

    Button btnAsker,btnTank;
    TextView txtMesaj;
    public Asker asker;
    public Tank tankci;
    String mesaj = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10);
        btnAsker = findViewById(R.id.asker);
        btnTank = findViewById(R.id.tank);
        txtMesaj = findViewById(R.id.mesaj);
        asker = new Asker();
        tankci = new Tank();
        btnAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                txtMesaj.setText(mesaj);
            }
        });
        btnTank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tankci.atesEt();
                txtMesaj.setText(mesaj);
            }
        });
    }
}
