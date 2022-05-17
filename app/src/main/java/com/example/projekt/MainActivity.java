package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a21hugni";
    private RecyclerView recyclerView;
    private List<Grejer> listan;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onPostExecute(String json) {

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Grejer>(){}.getType();
        ArrayList<Grejer> skit = gson.fromJson(json, type);
        mountainsList.addAll(skit);
        adapter.notifyDataSetChanged();
    }
}