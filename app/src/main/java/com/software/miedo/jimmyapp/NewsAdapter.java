package com.software.miedo.jimmyapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.software.miedo.jimmyapp.model.Mensaje;
import com.software.miedo.jimmyapp.model.Noticia;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MensajeViewHolder> {

    private List<Noticia> mData;

    public NewsAdapter(List<Noticia> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public MensajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_item, parent, false);
        return new MensajeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MensajeViewHolder holder, int position) {

        // TODO Bindar tu view holder
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MensajeViewHolder extends RecyclerView.ViewHolder {

        public ImageView iv_foto;
        public TextView tv_titulo, tv_categoria, tv_descripcion, tv_fecha;

        public MensajeViewHolder(View itemView) {
            super(itemView);

            iv_foto = (ImageView) itemView.findViewById(R.id.iv_foto);
            tv_categoria = (TextView) itemView.findViewById(R.id.tv_categoria);
            tv_titulo = (TextView) itemView.findViewById(R.id.tv_titulo);
            tv_descripcion = (TextView) itemView.findViewById(R.id.tv_descripcion);
            tv_fecha = (TextView) itemView.findViewById(R.id.tv_fecha);
        }
    }
}
