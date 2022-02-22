package com.bentechprotv.android.tp01calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button _btnSom;
    EditText _edtPremier,_edtSecond;
    TextView _txtResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //liaison entre contrôles XML et variables Java
        _btnSom = findViewById(R.id.btnSom);
        _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);
        // traitements
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,somme;
                n1 = Integer.parseInt(_edtPremier.getText().toString());
                n2 = Integer.parseInt(_edtSecond.getText().toString());
                somme = n1 + n2;
                _txtResultat.setText("Le résultat est : " + String.valueOf(somme));
            }
        });

    }
}