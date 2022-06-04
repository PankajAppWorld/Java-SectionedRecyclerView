package com.androidappworld.sectionedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterSectionRecycler adapterRecycler;
    private List<SectionHeader> sectionHeaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //setLayout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        //Create a List of Child DataModel
        List<Child> childList = new ArrayList<>();
        childList.add(new Child("Item 0"));
        childList.add(new Child("Item 1"));
        childList.add(new Child("Item 2"));
        childList.add(new Child("Item 3"));
        childList.add(new Child("Item 4"));
        childList.add(new Child("Item 5"));

        //Create a List of SectionHeader DataModel implements SectionHeader
        sectionHeaders = new ArrayList<>();
        sectionHeaders.add(new SectionHeader(childList, "Header 1", 6));

        childList = new ArrayList<>();
        childList.add(new Child("Item 0"));
        childList.add(new Child("Item 1"));
        childList.add(new Child("Item 2"));
        childList.add(new Child("Item 3"));
        sectionHeaders.add(new SectionHeader(childList, "Header 2", 2));

        childList = new ArrayList<>();
        childList.add(new Child("Item 0"));
        childList.add(new Child("Item 1"));
        sectionHeaders.add(new SectionHeader(childList, "Header 3", 1));

        childList = new ArrayList<>();
        childList.add(new Child("Item 0"));
        childList.add(new Child("Item 1"));
        sectionHeaders.add(new SectionHeader(childList, "Header 4", 4));

        childList = new ArrayList<>();
        childList.add(new Child("Item 0"));
        sectionHeaders.add(new SectionHeader(childList, "Header 5", 3));

        childList = new ArrayList<>();
        childList.add(new Child("Item 0"));
        childList.add(new Child("Item 1"));
        sectionHeaders.add(new SectionHeader(childList, "Header 6", 5));


        adapterRecycler = new AdapterSectionRecycler(this, sectionHeaders);
        recyclerView.setAdapter(adapterRecycler);

    }
}