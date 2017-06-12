package com.lutpe.hitungluas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HitungLingkaran extends Activity {
    private EditText txtJari;
    private EditText txtLuas;
    private EditText txtKeliling;
    private Button btnHitung;

    /**
     * Method yang dipanggil pada saat applikaasi dijalankan
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);
        txtJari = (EditText) findViewById(R.id.txtJari);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        txtKeliling = (EditText) findViewById(R.id.txtKeliling);
        btnHitung = (Button) findViewById(R.id.btnHitung);

    }

    /**
     * Method untuk Menghitung Luas dan Keliling Lingkaran dipanggil pada saat button
     * Hitung diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {

            int jarijari = Integer.parseInt(txtJari.getText().toString());
            double phi = 3.14;
            double luas =  phi * jarijari * jarijari;
            double keliling = 2 * phi * jarijari;
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
        Intent intent = new Intent(HitungLingkaran.this,MainActivity.class);
        HitungLingkaran.this.startActivity(intent);
        HitungLingkaran.this.finish();
    }
}