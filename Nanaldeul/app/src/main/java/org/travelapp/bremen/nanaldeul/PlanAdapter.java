package org.travelapp.bremen.nanaldeul;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlanAdapter extends RecyclerView.Adapter<PlanAdapter.ViewHolder> {

    private ArrayList<Plan> items = new ArrayList<>();

    @NonNull
    @Override
    public PlanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plan, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Plan item = items.get(position);

        Glide.with(viewHolder.itemView.getContext())
                .load(item.getUrl())
                .into(viewHolder.ivPlan);

        viewHolder.tvPlace.setText(item.getTitle());
        viewHolder.tvDday.setText(item.getdDay());
        viewHolder.tvDate.setText(item.getDate());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(ArrayList<Plan> items) {
        this.items = items;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPlan;
        TextView tvPlace, tvDday, tvDate;

        ViewHolder(View itemView) {
            super(itemView);

            ivPlan = itemView.findViewById(R.id.iv_item_plan);

            tvPlace = itemView.findViewById(R.id.tv_item_plan_place);
            tvDday = itemView.findViewById(R.id.tv_item_plan_dday);
            tvDate = itemView.findViewById(R.id.tv_item_plan_date);
        }
    }
}