package org.travelapp.bremen.nanaldeul;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

class HorizontalAdapter extends RecyclerView.Adapter<HorizontalViewHolder> {

    private ArrayList<HorizontalData> verticalDatas;

    public void setData(ArrayList<HorizontalData> list){
        verticalDatas = list;
    }

    @Override
    public HorizontalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

// 사용할 아이템의 뷰를 생성해준다.
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.horizon_recycler_item, parent, false);

        HorizontalViewHolder holder = new HorizontalViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(HorizontalViewHolder holder, int position) {
        HorizontalData data = verticalDatas.get(position);

        holder.description.setText(data.getText());

    }

    @Override
    public int getItemCount() {
        return verticalDatas.size();
    }
}

