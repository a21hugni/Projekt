package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a21hugni";
    private RecyclerView recyclerView;
    private List<Grejer> listan;
    private SkitAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask( this).execute(JSON_URL);

        recyclerView = findViewById(R.id.recycler_view);
        listan = new ArrayList<Grejer>();
        adapter = new SkitAdapter(listan);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onPostExecute(String json) {

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Grejer>>(){}.getType();
        ArrayList<Grejer> skit = gson.fromJson(json, type);
        listan.addAll(skit);
        adapter.notifyDataSetChanged();
    }
}