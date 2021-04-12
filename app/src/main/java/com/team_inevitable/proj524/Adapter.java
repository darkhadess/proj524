package com.team_inevitable.proj524;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<ArrayList> userList;

    public Adapter(ArrayList<ArrayList> ul){
        this.userList = ul;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.displayholder, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        String name = (String)userList.get(position).get(0);
        String email = (String)userList.get(position).get(1);
        String age = (String)userList.get(position).get(2);
        String college = (String)userList.get(position).get(3);
        holder.setData(name, age, email, college);
        System.out.println(name+"----"+age);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView age;
        TextView college;
        TextView email;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.namet);
            age = itemView.findViewById(R.id.aget);
            college = itemView.findViewById(R.id.colleget);
            email = itemView.findViewById(R.id.emailt);


        }
        public void setData(String n, String a, String e, String c){
            name.setText(n);
            age.setText(a);
            college.setText(c);
            email.setText(e);
        }
    }
}
