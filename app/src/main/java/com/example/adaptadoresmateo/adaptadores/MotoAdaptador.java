package com.example.adaptadoresmateo.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresmateo.MotoDetalle;
import com.example.adaptadoresmateo.R;
import com.example.adaptadoresmateo.clases.Moto;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MotoAdaptador extends RecyclerView.Adapter<MotoAdaptador.ViewHolder> {

    private List<Moto> datos;

    public MotoAdaptador(List<Moto> datos) {
        this.datos = datos;
    }


    @NonNull
    @Override
    public MotoAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_moto,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MotoAdaptador.ViewHolder holder, int position) {
        Moto dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_modelo, txt_year, txt_valor;
        ImageView img_moto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_modelo = itemView.findViewById(R.id.txt_modelo);
            txt_year = itemView.findViewById(R.id.txt_year);
            txt_valor = itemView.findViewById(R.id.txt_valor);
            img_moto = itemView.findViewById(R.id.img_moto);
        }
        public void bind(Moto dato){
            txt_modelo.setText(dato.getModelo());
            txt_year.setText(dato.getYear());
            txt_valor.setText(dato.getValor());
            //libreria de imagenes
            Picasso.get().load(dato.getImagen()).into(img_moto);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), MotoDetalle.class);
                    i.putExtra("modeloD",dato.getModelo());
                    i.putExtra("yearD",dato.getYear());
                    i.putExtra("valorD",dato.getValor());
                    i.putExtra("imagenD",dato.getImagen());
                    view.getContext().startActivity(i);
                }
            });
        }
    }

}
