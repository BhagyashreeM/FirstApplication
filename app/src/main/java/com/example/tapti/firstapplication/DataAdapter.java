package com.example.tapti.firstapplication;

/**
 * Created by Tapti on 02/09/16.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{
    private List<Symptom> response;

    public DataAdapter(List<Symptom> response) {
        this.response = response;
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
    }

    @Override
    public int getItemCount() {
        return response.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name,type;
        public ViewHolder(View itemView) {

            super(itemView);
        name = (TextView) itemView.findViewById(R.id.symptom_name);
        type = (TextView) itemView.findViewById(R.id.Symptom_type);
        }
    }
}
