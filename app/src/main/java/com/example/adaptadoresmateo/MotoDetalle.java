package com.example.adaptadoresmateo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MotoDetalle extends AppCompatActivity {

    TextView txt_modelo_detalle, txt_year_detalle, txt_valor_detalle;
    ImageView img_moto_detalle;
    Button btn_atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto_detalle);


        txt_modelo_detalle = findViewById(R.id.txt_modelo_detalle);
        txt_year_detalle = findViewById(R.id.txt_year_detalle);
        txt_valor_detalle = findViewById(R.id.txt_valor_detalle);
        img_moto_detalle = findViewById(R.id.img_moto_detalle);
        btn_atras = findViewById(R.id.btn_atras);

        String modelo = getIntent().getStringExtra("modeloD");
        String year = getIntent().getStringExtra("yearD");
        String valor = getIntent().getStringExtra("valorD");
        String imagen = getIntent().getStringExtra("imagenD");

        txt_modelo_detalle.setText(modelo);
        txt_year_detalle.setText(year);
        txt_valor_detalle.setText(valor);
        Picasso.get().load(imagen).into(img_moto_detalle);

        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MotoDetalle.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}