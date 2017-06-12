package com.lutpe.hitungluas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungPersegiEmpat extends Activity {

    private EditText txtSisi1;
    private EditText txtSisi2;
    private EditText txtLuas;
    private EditText txtKeliling;
    private Button btnHitung;

    /**

     * Method yang dipanggil pada saat applikaasi dijalankan

     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegiempat);
        txtSisi1 = (EditText) findViewById(R.id.txtSisi1);
        txtSisi2 = (EditText) findViewById(R.id.txtSisi2);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        txtKeliling = (EditText) findViewById(R.id.txtKeliling);
        btnHitung = (Button) findViewById(R.id.btnHitung);

    }

    /**
     * Method untuk Menghitung Luas Persegi panjang dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {

            int sisi1 = Integer.parseInt(txtSisi1.getText().toString());
            int sisi2 = Integer.parseInt(txtSisi2.getText().toString());
            int luas = sisi1 * sisi2;
            int keliling = 4 * sisi1 * sisi2;

            txtLuas.setText(String.valueOf(luas));
            txtKeliling.setText(String.valueOf(keliling));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method untuk menutup activity dan kembali ke menu
     * @param view
     */
    public void backtoMenu(View view){
        Intent intent = new Intent(HitungPersegiEmpat.this,MainActivity.class);
        HitungPersegiEmpat.this.startActivity(intent);
        HitungPersegiEmpat.this.finish();
    }
}