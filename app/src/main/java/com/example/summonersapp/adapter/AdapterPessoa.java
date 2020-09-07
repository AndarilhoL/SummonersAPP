package com.example.summonersapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.summonersapp.R;
import com.example.summonersapp.model.Pessoa;

import java.util.List;

public class AdapterPessoa extends RecyclerView.Adapter<AdapterPessoa.MyViewHolder> {

    private  List<Pessoa> listaPessoa;

    public AdapterPessoa(List<Pessoa> lista) {
        this.listaPessoa = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_pessoa, parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Pessoa pessoa = listaPessoa.get(position);
        holder.foto.setImageResource(pessoa.getImagem());
        holder.nome.setText(pessoa.getNome());
        holder.funcao.setText(pessoa.getFuncao());
    }

    @Override
    public int getItemCount() {
        return listaPessoa.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView foto;
        TextView nome;
        TextView funcao;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            foto = itemView.findViewById(R.id.imageViewFoto);
            nome = itemView.findViewById(R.id.textViewNome);
            funcao = itemView.findViewById(R.id.textViewFuncao);
        }
    }
}
