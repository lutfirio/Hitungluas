package com.lutpe.hitungluas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button_segiempat);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HitungPersegiEmpat.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        button2 = (Button)findViewById(R.id.button_segitiga);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HitungSegitiga.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        button3 = (Button)findViewById(R.id.button_lingkaran);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HitungLingkaran.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        button4 = (Button)findViewById(R.id.button_persegipanjang);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HitungPersegiPanjang.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        button5 = (Button)findViewById(R.id.button_jajargenjang);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HitungJajarGenjang.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        button6 = (Button)findViewById(R.id.button_layanglayang);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HitungLayangLayang.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        button7 = (Button)findViewById(R.id.button_trapesium);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HitungTrapesium.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        button8 = (Button)findViewById(R.id.button_belahketupat);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HitungBelahKetupat.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        button9 = (Button)findViewById(R.id.button_exit);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Apakah anda ingin keluar dari Aplikasi ini?");
        builder.setCancelable(true);
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
