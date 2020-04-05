package com.example.departmentrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycle;
    ArrayList<Department> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<Department>();
        list.add(new Department("cse","top notch department"));
        list.add(new Department("mech","known fro popularisim"));
        list.add(new Department("it","also one of the popular department"));
        list.add(new Department("ece","collabrates both cse and electronics"));
        recycle=(RecyclerView)findViewById(R.id.recycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setAdapter(new DepartmentAdapter(list, new DepartmentAdapter.OnListItemClick() {
            @Override
            public void onClick(int position) {
                    Intent intnt=new Intent(MainActivity.this,DisplayActivity.class);
                    intnt.putExtra("dept",new Department(list.get(position)));
                    startActivity(intnt);
            }
        }));
        recycle.setHasFixedSize(true);
    }
}
