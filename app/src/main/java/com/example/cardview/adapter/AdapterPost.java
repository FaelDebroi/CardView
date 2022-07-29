package com.example.cardview.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.Model.Postagem;
import com.example.cardview.R;

import java.util.List;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.MyViewHolder> {

    private List<Postagem> postagens;

    public AdapterPost(List<Postagem>listaPostagens) {
        this.postagens = listaPostagens;
    }

    //coloca na lista
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe,parent,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull AdapterPost.MyViewHolder holder, int position) {

        Postagem postagem = postagens.get( position );
        holder.textNome.setText(postagem.getNome());
        holder.textComentario.setText(postagem.getPostagem());
        holder.imagemPostagem.setImageResource(postagem.getImagem());
        ///Ctrol + click encima doq voce quer ver, mostra a pag que voce esta querendo ir


    }

    @Override   // quantidades de vezes que quer que multiplique
    public int getItemCount() {
        return postagens.size() ;
    }

    //variavel e o que cada um guarda
    public class MyViewHolder extends RecyclerView.ViewHolder{
    private TextView textNome;
    private TextView textComentario;
    private ImageView imagemPostagem;

        public MyViewHolder(View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textComentario = itemView.findViewById(R.id.textPostagem);
            imagemPostagem = itemView.findViewById(R.id.imagePostagem);

        }
    }

}
