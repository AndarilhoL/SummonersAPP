package com.example.summonersapp.fragment;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.summonersapp.R;
import com.example.summonersapp.adapter.AdapterPessoa;
import com.example.summonersapp.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Pessoa> listaPessoa = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewLista);

        this.criarPessoas();

        AdapterPessoa adapter = new AdapterPessoa(listaPessoa);

        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void  criarPessoas(){
        Pessoa pessoa = new Pessoa( R.drawable.ic_guilherme, "Rlxaaaaaaxz", R.drawable.top, R.drawable.gold);
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_leozin, "AndarilhoL", R.drawable.mid, R.drawable.iron);
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.avatar_m, "Clavous", R.drawable.mid, R.drawable.bronze);
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.avatar_m, "GeoLaia", R.drawable.bottom, R.drawable.iron);
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.avatar_f, "Bia07", R.drawable.sup, R.drawable.iron);
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.avatar_m, "figueira do rodo", R.drawable.top, R.drawable.bronze);
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.avatar_f, "ysmnmendess", R.drawable.mid, R.drawable.iron);
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.avatar_m, "MonkeyBlasterBR", R.drawable.top, R.drawable.diamond);
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.avatar_m, "MatlosL", R.drawable.mid, R.drawable.grand_master);
        this.listaPessoa.add(pessoa);
    }
}