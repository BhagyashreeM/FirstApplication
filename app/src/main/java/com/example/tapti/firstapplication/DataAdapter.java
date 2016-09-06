package com.example.tapti.firstapplication;

/**
 * Created by Tapti on 02/09/16.
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tapti.firstapplication.com.example.tapti.firstapplication.materialDesign.MaterialDesignActivity;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{
    private final Context context;
    private List<Symptom> response;

    public DataAdapter(List<Symptom> response, Context mainActivityClass) {
        this.response = response;
        this.context = mainActivityClass;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.name.setText(response.get(position).getName());
        holder.type.setText(response.get(position).getType());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent materialDesignIntent = new Intent(context,MaterialDesignActivity.class);
                context.startActivity(materialDesignIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return response.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name,type;
        LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
        name = (TextView) itemView.findViewById(R.id.symptom_name);
        type = (TextView) itemView.findViewById(R.id.Symptom_type);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.layout_id);
        }
    }
}
