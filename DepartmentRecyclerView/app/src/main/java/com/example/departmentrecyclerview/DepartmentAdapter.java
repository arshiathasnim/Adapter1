package com.example.departmentrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentAdapter.DepartmentHolder> {
    public interface OnListItemClick
    {
        public void onClick(int position);
    }
    class DepartmentHolder extends RecyclerView.ViewHolder {
        TextView txt;
        public DepartmentHolder(@NonNull View itemView) {
            super(itemView);
            txt=itemView.findViewById(R.id.name);
        }
    }
    ArrayList<Department> list;
    OnListItemClick listener;
    public DepartmentAdapter(ArrayList<Department> list,OnListItemClick listener) {
        this.list=list;
        this.listener=listener;
    }

    @NonNull
    @Override
    public DepartmentAdapter.DepartmentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate=LayoutInflater.from(parent.getContext());
        View view=inflate.inflate(R.layout.department_list,parent,false);
        return new DepartmentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DepartmentAdapter.DepartmentHolder holder, int position) {
        holder.txt.setText(list.get(position).name);
        final int pos=position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        listener.onClick(pos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
