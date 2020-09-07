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
        Pessoa pessoa = new Pessoa( R.drawable.ic_guilherme, "Rlxaaaaaaxz", "Top e JG");
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_leozin, "AndarilhoL", "Mid" );
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_baseline_add_a_photo_24, "Clavous", "Mid e JG" );
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_baseline_add_a_photo_24, "GeoLaia", "ADC e Sup" );
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_baseline_add_a_photo_24, "Bia07", "Sup e ADC" );
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_baseline_add_a_photo_24, "figueira do rodo", "Top" );
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_baseline_add_a_photo_24, "ysmnmendess", "Mid" );
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_baseline_add_a_photo_24, "MonkeyBlasterBR", "Top" );
        this.listaPessoa.add(pessoa);

        pessoa = new Pessoa(R.drawable.ic_baseline_add_a_photo_24, "MatlosL", "Mid e JG" );
        this.listaPessoa.add(pessoa);
    }
}