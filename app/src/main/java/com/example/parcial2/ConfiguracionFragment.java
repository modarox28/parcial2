package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ConfiguracionFragment extends Fragment {

    private TextView tvBienvenida;
    private Button btnCerrarSesion;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_configuracion, container, false);

        tvBienvenida = view.findViewById(R.id.tvBienvenida);
        btnCerrarSesion = view.findViewById(R.id.btnCerrarSesion);

        if (getActivity() != null && getActivity().getIntent() != null) {
            String usuario = getActivity().getIntent().getStringExtra("usuario");
            tvBienvenida.setText(getString(R.string.bienvenido, usuario));
        }

        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        return view;
    }
}