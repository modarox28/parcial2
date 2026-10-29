package com.example.parcial2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PrendaAdapter extends RecyclerView.Adapter<PrendaAdapter.ViewHolder> {

    private List<Prenda> prendas;
    private Context context;

    public PrendaAdapter(List<Prenda> prendas, Context context) {
        this.prendas = prendas;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prenda, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Prenda prenda = prendas.get(position);
        holder.tvNombre.setText(prenda.getNombre());
        holder.tvDescripcion.setText(prenda.getDescripcion());
        holder.tvPrecio.setText(prenda.getPrecio());

        Picasso.with(context)
                .load(prenda.getUrlImagen())
                .placeholder(R.drawable.ic_app_logo)
                .error(R.drawable.ic_app_logo)
                .into(holder.imgPrenda);
    }

    @Override
    public int getItemCount() {
        return prendas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgPrenda;
        TextView tvNombre, tvDescripcion, tvPrecio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPrenda = itemView.findViewById(R.id.imgPrenda);
            tvNombre = itemView.findViewById(R.id.tvNombrePrenda);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcionPrenda);
            tvPrecio = itemView.findViewById(R.id.tvPrecioPrenda);
        }
    }
}