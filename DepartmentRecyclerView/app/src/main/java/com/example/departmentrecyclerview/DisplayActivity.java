package com.example.departmentrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
        TextView name;
        TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        name=(TextView)findViewById(R.id.dept_name);
        details=(TextView)findViewById(R.id.details);
        Department dt=(Department) getIntent().getSerializableExtra("dept");
        name.setText(dt.name);
        details.setText(dt.details);
    }
}
