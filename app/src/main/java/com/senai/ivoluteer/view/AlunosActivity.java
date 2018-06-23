package com.senai.ivoluteer.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.MenuItem;
import com.senai.ivoluteer.R;
import com.senai.ivoluteer.adapter.AlunoAdapter;

import java.util.ArrayList;
import java.util.List;

public class AlunosActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alunos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Turma");

        this.inicializarRecyclerview();
    }

    private void inicializarRecyclerview() {
        this.recyclerView = findViewById(R.id.recyclerView_aluno);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("Aluno-" + i);
        }

        recyclerView.setAdapter(new AlunoAdapter(list));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }
        return true;
//        return super.onOptionsItemSelected(item);
    }


}
