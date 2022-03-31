package com.example.myapplication90;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Model> movies;

    public RecyclerViewAdapter(Context context, List<Model> movies){

        this.movies = movies;
        this.inflater=LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Model model = movies.get(position);
        holder.nameMovie.setText(model.getName());
         holder.nameMovie1.setText(model.getName1());
        holder.nameMovie2.setText(model.getName2());
        holder.nameMovie3.setText(model.getName3());
        holder.nameMovie4.setText(model.getName4());
        holder.nameMovie5.setText(model.getName5());
        holder.nameMovie6.setText(model.getName6());
        holder.nameMovie7.setText(model.getName7());
        holder.nameMovie8.setText(model.getName8());
        holder.nameMovie9.setText(model.getNamee1());
        holder.nameMovie10.setText(model.getNamee2());
        holder.nameMovie11.setText(model.getNamee3());
        holder.nameMovie12.setText(model.getNamee4());
        holder.nameMovie13.setText(model.getNamee5());
        holder.nameMovie14.setText(model.getNamee6());
    }

    @Override
    public int getItemCount() { return  movies.size();}



        public static class ViewHolder extends RecyclerView.ViewHolder {
            final TextView nameMovie;
            final TextView nameMovie1;
            final TextView nameMovie2;
            final TextView nameMovie3;
            final TextView nameMovie4;
            final TextView nameMovie5;
            final TextView nameMovie6;
            final TextView nameMovie7;
            final TextView nameMovie8;
            final TextView nameMovie9;
            final TextView nameMovie10;
            final TextView nameMovie11;
            final TextView nameMovie12;
            final TextView nameMovie13;
            final TextView nameMovie14;

            ViewHolder(View view) {
                super(view);
                nameMovie = view.findViewById(R.id.txt);
                nameMovie1 = view.findViewById(R.id.txt8);
                nameMovie2 = view.findViewById(R.id.txt0);
                nameMovie3 = view.findViewById(R.id.txt1);
                nameMovie4 = view.findViewById(R.id.txt2);
                nameMovie5 = view.findViewById(R.id.txt3);
                nameMovie6 = view.findViewById(R.id.txt4);
                nameMovie7 = view.findViewById(R.id.txt5);
                nameMovie8 = view.findViewById(R.id.txt6);

                nameMovie9 = view.findViewById(R.id.txtl1);
                nameMovie10 = view.findViewById(R.id.txtl2);
                nameMovie11 = view.findViewById(R.id.txtl3);
                nameMovie12 = view.findViewById(R.id.txtl4);
                nameMovie13 = view.findViewById(R.id.txtl5);
                nameMovie14 = view.findViewById(R.id.txtl6);


            }
        }
}
