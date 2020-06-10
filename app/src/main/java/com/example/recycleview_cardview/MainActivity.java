package com.example.recycleview_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView list;
    PersonAdapter myAdapter;
    LinearLayoutManager manager;
    ArrayList<Person>people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        people=new ArrayList<>();
        list=findViewById(R.id.list);
        manager=new LinearLayoutManager(this);
        people.add(new Person("Rima","Bouazra","plane"));
        people.add(new Person("Mayara","Bouazra","bus"));
        people.add(new Person("Rima","Bouazra","bus"));
        people.add(new Person("Mohamed","Bouazra","plane"));
        people.add(new Person("Rima","Bouazra","bus"));
        people.add(new Person("Ons","Bouazra","plane"));
        people.add(new Person("Rima","Bouazra","plane"));
        people.add(new Person("Ons","Bouazra","bus"));
        people.add(new Person("Rima","Bouazra","plane"));
        people.add(new Person("Rima","Bouazra","plane"));
        people.add(new Person("Mayara","Bouazra","plane"));
        people.add(new Person("Rima","Bouazra","bus"));
        people.add(new Person("Rima","Bouazra","plane"));
        people.add(new Person("Mohamed","Bouazra","bus"));
        manager=new LinearLayoutManager(this);

        myAdapter=new PersonAdapter(this,people);
        list.setAdapter(myAdapter);
        list.setLayoutManager(manager);




    }
}
