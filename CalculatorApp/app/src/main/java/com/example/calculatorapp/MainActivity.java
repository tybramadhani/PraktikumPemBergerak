package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button tombol1,tombol2,tombol3,tombol4,tombol5,tombol6,tombol7,tombol8,tombol9,tombol0,tombolplus,tombolminus,tombolkali,tombolbagi,tombolhasil,tombolclear,tomboltitik;
    Boolean doTambah,doKurang,doBagi,doKali,doHasil;
    EditText textTampil;
    Float nilaiSatu,nilaiDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol0 = (Button) findViewById(R.id.tombol0);
        tombol1 = (Button) findViewById(R.id.tombol1);
        tombol2 = (Button) findViewById(R.id.tombol2);
        tombol3 = (Button) findViewById(R.id.tombol3);
        tombol4 = (Button) findViewById(R.id.tombol4);
        tombol5 = (Button) findViewById(R.id.tombol5);
        tombol6 = (Button) findViewById(R.id.tombol6);
        tombol7 = (Button) findViewById(R.id.tombol7);
        tombol8 = (Button) findViewById(R.id.tombol8);
        tombol9 = (Button) findViewById(R.id.tombol9);
        tombolplus = (Button) findViewById(R.id.tombolplus);
        tombolminus = (Button) findViewById(R.id.tombolminus);
        tombolkali = (Button) findViewById(R.id.tombolkali);
        tombolhasil = (Button) findViewById(R.id.tombolbagi);
        tomboltitik = (Button) findViewById(R.id.tomboltitik);
        tombolclear = (Button) findViewById(R.id.tombolclear);
        textTampil = (Button) findViewById(R.id.tombolhasil);

        tombol0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"0");
            }
        });
        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"1");
            }
        });
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"2");
            }
        });
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"3");
            }
        });
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"4");
            }
        });
        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"5");
            }
        });

        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"6");
            }
        });

        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"7");
            }
        });

        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"8");
            }
        });

        tombol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+"9");
            }
        });

        tomboltitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTampil.setText(textTampil.getText()+".");
            }
        });

        tombolclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu=null;
                nilaiDua=null;
                textTampil.setText(null);
            }
        });

        tombolplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu =Float.parseFloat(textTampil.getText().toString());
                doTambah=true;
                textTampil.setText(null);
            }
        });

        tombolhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiDua = Float.parseFloat(textTampil.getText().toString()+"");
                if(doTambah=true){
                    textTampil.setText(nilaiSatu+nilaiDua+"");
                    doTambah=false;
                }
                else if (doKurang=true){
                    textTampil.setText(nilaiSatu-nilaiDua+"");
                    doKurang=false;
                }
            }
        });

        tombolminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu =Float.parseFloat(textTampil.getText().toString());
                doKurang=true;
                textTampil.setText(null);
            }
        });

        tombolkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu =Float.parseFloat(textTampil.getText().toString());
                doKali=true;
                textTampil.setText(null);
            }
        });

        tombolbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu =Float.parseFloat(textTampil.getText().toString());
                doBagi=true;
                textTampil.setText(null);
            }
        });

    }
}
