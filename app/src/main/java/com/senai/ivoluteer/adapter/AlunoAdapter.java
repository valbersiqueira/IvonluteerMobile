package com.senai.ivoluteer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.senai.ivoluteer.R;

import java.util.List;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.MyViewHolder> {

    private List<String> alunos;

    public AlunoAdapter(List<String> alunos) {
        this.alunos = alunos;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alunos_item_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        String nome = alunos.get(i);
        myViewHolder.nomeTxt.setText(nome);
    }

    @Override
    public int getItemCount() {
        return alunos.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nomeTxt;

        public MyViewHolder(View itemView) {
            super(itemView);
            nomeTxt = itemView.findViewById(R.id.nome_txt_aluno);
        }
    }
}
