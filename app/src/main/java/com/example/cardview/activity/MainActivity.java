package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.cardview.Model.Postagem;
import com.example.cardview.R;
import com.example.cardview.adapter.AdapterPost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerPostagem = findViewById(R.id.RecyclerPost);

//        Define Layout - Aqui definimos que e para baixo
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager );

        // para os lados
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
//        recyclerPostagem.setLayoutManager(layoutManager );

        //Fazendo varios um do lado do outro
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
//        recyclerPostagem.setLayoutManager(layoutManager );

        //define o adaptador
        this.preparandoPostagem();
        AdapterPost adapter = new AdapterPost(postagem);//puxando a class AdapterPost
        recyclerPostagem.setAdapter(adapter);

    }

     public void preparandoPostagem(){

         Postagem p;

        p = new Postagem("rafael Debroi","Paris... #TBT", R.drawable.imagem3 );
        this.postagem.add(p);

        p = new Postagem("Julia Delamura","new City", R.drawable.imagem2 );
        postagem.add(p);

        p = new Postagem("Aline","#TBTVIAJEM", R.drawable.imagem1 );
        postagem.add(p);

        p = new Postagem("Sandra Debroi","Natureza", R.drawable.imagem4 );
        postagem.add(p);
      }
}