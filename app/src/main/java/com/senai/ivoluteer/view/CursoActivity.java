package com.senai.ivoluteer.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.senai.ivoluteer.R;
import com.senai.ivoluteer.adapter.CursosAdapter;
import com.senai.ivoluteer.model.CursoDto;
import com.senai.ivoluteer.utils.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class CursoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        this.inicializarRecyclerView();
    }

    private void inicializarRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView_curso);
        getSupportActionBar().setTitle("Cursos");


        final List<CursoDto> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new CursoDto(i, "Curso-" + i, "Truma-" + i));
        }

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        CursosAdapter adapter = new CursosAdapter(list);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
//                        Toast.makeText(CursoActivity.this, "Click " + list.get(position), Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(CursoActivity.this, TurmaActivity.class);
                        intent.putExtra("turmas", list.get(position));
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                })
        );

    }
}
