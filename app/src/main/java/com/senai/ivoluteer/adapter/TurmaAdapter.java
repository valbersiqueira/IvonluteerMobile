package com.senai.ivoluteer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.senai.ivoluteer.R;
import com.senai.ivoluteer.model.TurmaDto;

import java.util.List;

public class TurmaAdapter extends RecyclerView.Adapter<TurmaAdapter.MyViewHolder> {

    private List<TurmaDto> turmas;

    public TurmaAdapter(List<TurmaDto> turmas) {
        this.turmas = turmas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_recycler_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int i) {
        TurmaDto turma = turmas.get(i);

        holder.turmaTxt.setText(turma.getTurmaNome());
        holder.alunoTxt.setText(turma.getAluno());
    }

    @Override
    public int getItemCount() {
        return turmas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView turmaTxt, alunoTxt;

        public MyViewHolder(View item) {
            super(item);

            this.turmaTxt = item.findViewById(R.id.txt_um);
            this.alunoTxt = item.findViewById(R.id.txt_dois);
        }
    }
}
