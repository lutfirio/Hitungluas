package com.lutpe.hitungluas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungBelahKetupat extends Activity {
    private EditText txtDiagonal1;
    private EditText txtDiagonal2;
    private EditText txtLuas;
    private Button btnHitung;
    /**
     * Method yang dipanggil pada saat applikaasi dijalankan
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.belahketupat);
        txtDiagonal1 = (EditText) findViewById(R.id.txtDiagonal1);
        txtDiagonal2 = (EditText) findViewById(R.id.txtDiagonal2);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
    }
    /**

     * Method untuk Menghitung Luas Layang-Layang dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {
            int diagonal1 = Integer.parseInt(txtDiagonal1.getText().toString());
            int diagonal2 = Integer.parseInt(txtDiagonal2.getText().toString());
            int luas = (diagonal1 * diagonal2) / 2;
            txtLuas.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Method untuk menutup activity dan kembali ke menu
     * @param view
     */
    public void backtoMenu(View view){
        Intent intent = new Intent(HitungBelahKetupat.this,MainActivity.class);
        HitungBelahKetupat.this.startActivity(intent);
        HitungBelahKetupat.this.finish();
    }
}