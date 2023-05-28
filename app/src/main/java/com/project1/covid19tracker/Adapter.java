package com.project1.covid19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    Context context;
    ArrayList<Model> arrayList ;
    public Adapter(Context context, ArrayList<Model> arrayList){
        this.context = context;
        this.arrayList = arrayList ;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.testing,parent,false);
        viewHolder viewholder = new viewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.subkey.setText(arrayList.get(position).subkey);
        holder.active.setText(arrayList.get(position).active);
        holder.confirmed.setText(arrayList.get(position).confirmed);
        holder.migratedother.setText(arrayList.get(position).migratedother);
        holder.recovered.setText(arrayList.get(position).recovered);
        holder.deceased.setText(arrayList.get(position).deceased);
        holder.dconfirmed.setText(arrayList.get(position).deltaConfirmed);
        holder.dDeceased.setText(arrayList.get(position).deltaDeceased);
        holder.dRecovered.setText(arrayList.get(position).deltaRecovered);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView subkey , active, confirmed, migratedother ,deceased, recovered , dconfirmed , dDeceased, dRecovered;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            subkey = itemView.findViewById(R.id.subKey);
            active = itemView.findViewById(R.id.activeNum);
            confirmed = itemView.findViewById(R.id.confirmedNum);
            migratedother = itemView.findViewById(R.id.migratedotherNum);
            deceased = itemView.findViewById(R.id.deceasedNum);
            recovered = itemView.findViewById(R.id.recoveredNum);
            dconfirmed = itemView.findViewById(R.id.deltaconfirmedNum);
            dDeceased = itemView.findViewById(R.id.deltadeceasedNum);
            dRecovered = itemView.findViewById(R.id.deltarecoveredNum);
        }
    }
}
