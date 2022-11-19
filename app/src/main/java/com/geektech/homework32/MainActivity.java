package com.geektech.homework32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList nameList = new ArrayList();
    private RecyclerView rvName;
    private NameAdapter adapter = new NameAdapter(nameList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvName = findViewById(R.id.recycler_view);
        rvName.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        nameList.add("Agata");
        nameList.add("Iris");
        nameList.add("Angelina");
        nameList.add("Ann");
        nameList.add("Ariel");
        nameList.add("Barbara");
        nameList.add("Britney");
        nameList.add("Valery");
        nameList.add("Vanessa");
        nameList.add("Gabriel");
        nameList.add("Grace");
        nameList.add("Jane");
        nameList.add("Jessica");
        nameList.add("Judy");
        nameList.add("Eva");
        nameList.add("Zoe");
        nameList.add("Ivy");
        nameList.add("Camilla");
        nameList.add("Karen");
        nameList.add("Kelly");



    }
}