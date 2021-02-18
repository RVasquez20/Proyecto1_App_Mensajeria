package com.example.chatproyecto1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdaterMensajes extends RecyclerView.Adapter<HolderMensaje> {

    private List<Mensaje> listMensaje = new ArrayList<>();
    private Context c;

    public AdaterMensajes(Context c) {
        this.c = c;
    }

    public void addMensaje (Mensaje m){
        listMensaje.add(m);
    }

    @NonNull
    @Override
    public HolderMensaje onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.card_view_mensajes,parent,false);
        return new HolderMensaje(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderMensaje holder, int position) {
        holder.getNombre().setText(listMensaje.get(position).getNombre());
        holder.getMensaje().setText(listMensaje.get(position).getMensaje());
        holder.getHora().setText(listMensaje.get(position).getHora());

    }

    @Override
    public int getItemCount() {
        return listMensaje.size();
    }
}
