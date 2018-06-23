package com.senai.ivoluteer.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.senai.ivoluteer.R;
import com.senai.ivoluteer.model.CursoDto;

import java.util.List;

public class CursosAdapter extends RecyclerView.Adapter<CursosAdapter.MyViewHolder> {

    private List<CursoDto> cursos;

    public CursosAdapter(List<CursoDto> cursos) {
        this.cursos = cursos;
    }

    @Override
    public CursosAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_recycler_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CursosAdapter.MyViewHolder holder, int position) {
        CursoDto curso = cursos.get(position);
        holder.cursoTxt.setText(curso.getCurosNome());
        holder.turmaTxt.setText(curso.getTurma());

    }

    @Override
    public int getItemCount() {
        return cursos.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView cursoTxt, turmaTxt;


        public MyViewHolder(View item) {
            super(item);
            this.cursoTxt = item.findViewById(R.id.txt_um);
            this.turmaTxt = item.findViewById(R.id.txt_dois);

        }
    }
}
