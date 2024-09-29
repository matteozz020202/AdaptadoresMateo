package com.example.adaptadoresmateo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresmateo.adaptadores.MotoAdaptador;
import com.example.adaptadoresmateo.clases.Moto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_moto;
    List<Moto> listaMotos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_moto = findViewById(R.id.rcv_moto);

        Moto moto1 = new Moto("https://http2.mlstatic.com/D_NQ_NP_2X_620166-MCO79007476995_092024-F.webp","BMW S1000RR","2023","$110,850,000 COP");
        Moto moto2 = new Moto("https://http2.mlstatic.com/D_NQ_NP_2X_894425-MCO77995860970_082024-F.webp","Ducati Panigale V4","2023","$116,200,000 COP");
        Moto moto3 = new Moto("https://http2.mlstatic.com/D_NQ_NP_2X_719670-MCO79104944181_092024-F.webp","Yamaha YZF-R1","2023","$72,210,000 COP");
        Moto moto4 = new Moto("https://http2.mlstatic.com/D_NQ_NP_2X_925736-MCO70464756845_072023-F.webp","Kawasaki Ninja H2","2023","$124,500,000 COP");
        Moto moto5 = new Moto("https://http2.mlstatic.com/D_NQ_NP_2X_708962-MCO79098895386_092024-F.webp","Yamaha MT-15","2025","$16,000,000 COP");
        Moto moto6 = new Moto("https://http2.mlstatic.com/D_NQ_NP_2X_750007-MCO79396478802_092024-F.webp","Honda Cbr1000rr","2024","$85,000,000 COP");
        Moto moto7 = new Moto("https://http2.mlstatic.com/D_NQ_NP_2X_927451-MCO78844159060_092024-F.webp","Yamaha R6","2003","$26,000,000 COP");

        listaMotos.add(moto1);
        listaMotos.add(moto2);
        listaMotos.add(moto3);
        listaMotos.add(moto4);
        listaMotos.add(moto5);
        listaMotos.add(moto6);
        listaMotos.add(moto7);

        rcv_moto.setLayoutManager(new LinearLayoutManager(this));
        rcv_moto.setAdapter(new MotoAdaptador(listaMotos));
    }
}