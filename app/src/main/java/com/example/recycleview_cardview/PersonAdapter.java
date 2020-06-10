package com.example.recycleview_cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter <PersonAdapter.ViewHolder>{
    ArrayList<Person>people;

    public PersonAdapter(Context context, ArrayList<Person> people) {
        this.people = people;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName,tvSurname;
        ImageView ivPref;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvSurname=itemView.findViewById(R.id.tvSurname);
            ivPref=itemView.findViewById(R.id.ivPref);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    Context context=parent.getContext();
    View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
    return (new ViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(people.get(position));//pour connaitre l'item courant

        holder.tvSurname.setText(people.get(position).getSurname());
        holder.tvName.setText(people.get(position).getName());
        if (people.get(position).getPreference().equals("bus")){
            holder.ivPref.setImageResource(R.drawable.bus);
        }else holder.ivPref.setImageResource(R.drawable.plane);
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
