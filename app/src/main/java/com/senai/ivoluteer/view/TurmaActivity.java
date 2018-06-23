package com.senai.ivoluteer.view;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.senai.ivoluteer.R;
import com.senai.ivoluteer.adapter.TurmaAdapter;
import com.senai.ivoluteer.model.TurmaDto;
import com.senai.ivoluteer.utils.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class TurmaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turma);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Curso X");

        this.inicializarRecyclerview();
    }

    private void inicializarRecyclerview() {
        recyclerView = findViewById(R.id.recyclerView_turma);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        final List<TurmaDto> list = new ArrayList<>();

        for (int i=0; i<10; i++){
            list.add(new TurmaDto(1, "Turma-"+i, "aluno-"+i));
        }

        TurmaAdapter adapter = new TurmaAdapter(list);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(TurmaActivity.this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
//                        Toast.makeText(TurmaActivity.this, "Click "+list.get(position), Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(TurmaActivity.this, AlunosActivity.class);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            default: break;
        }
        return true;
//        return super.onOptionsItemSelected(item);
    }



}
