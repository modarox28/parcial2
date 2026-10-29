package com.example.parcial2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InicioFragment extends Fragment {

    private RecyclerView rvPrendas;
    private PrendaAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        rvPrendas = view.findViewById(R.id.rvPrendas);
        rvPrendas.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Prenda> listaPrendas = new ArrayList<>();
        listaPrendas.add(new Prenda("Camiseta básica", "Algodón 100%, varios colores", "$ 45.000", "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab?w=500&q=80"));
        listaPrendas.add(new Prenda("Jean slim", "Denim elástico azul oscuro", "$ 120.000", "https://images.unsplash.com/photo-1542272604-787c3835535d?w=500&q=80"));
        listaPrendas.add(new Prenda("Chaqueta de cuero", "Cuero sintético de alta calidad", "$ 250.000", "https://images.unsplash.com/photo-1551028719-00167b16eac5?w=500&q=80"));
        listaPrendas.add(new Prenda("Hoodie", "Saco con capota color gris", "$ 90.000", "https://images.unsplash.com/photo-1556821840-3a63f95609a7?w=500&q=80"));
        listaPrendas.add(new Prenda("Vestido casual", "Estampado floral primavera", "$ 110.000", "https://images.unsplash.com/photo-1515372039744-b8f02a3ae446?w=500&q=80"));
        listaPrendas.add(new Prenda("Tenis blancos", "Suela de goma, estilo urbano", "$ 180.000", "https://images.unsplash.com/photo-1600269452121-4f2416e55c28?q=80&w=1365&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=NHwxMjA3fDA%3D"));
        listaPrendas.add(new Prenda("Gorra", "Ajustable, logo bordado", "$ 35.000", "https://images.unsplash.com/photo-1588850561407-ed78c282e89b?w=500&q=80"));
        listaPrendas.add(new Prenda("Camisa de lino", "Fresca para clima cálido", "$ 95.000", "https://images.unsplash.com/photo-1596755094514-f87e34085b2c?w=500&q=80"));

        adapter = new PrendaAdapter(listaPrendas, getContext());
        rvPrendas.setAdapter(adapter);

        return view;
    }
}