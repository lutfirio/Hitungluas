package com.lutpe.hitungluas;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungTrapesium extends Activity {
    private EditText txtAlas1;
    private EditText txtAlas2;
    private EditText txtTinggi;
    private EditText txtLuas;
    private Button btnHitung;
    /**
     * Method yang dipanggil pada saat applikaasi dijalankan
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.trapesium);
        txtAlas1 = (EditText) findViewById(R.id.txtAlas1);
        txtAlas2 = (EditText) findViewById(R.id.txtAlas2);
        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
    }
    /**

     * Method untuk Menghitung Luas Segitiga dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {
            int alas1 = Integer.parseInt(txtAlas1.getText().toString());
            int alas2 = Integer.parseInt(txtAlas2.getText().toString());
            int tinggi = Integer.parseInt(txtTinggi.getText().toString());
            int luas = ((alas1+alas2)/2) * tinggi;
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
        Intent intent = new Intent(HitungTrapesium.this,MainActivity.class);
        HitungTrapesium.this.startActivity(intent);
        HitungTrapesium.this.finish();
    }
}