package org.travelapp.bremen.nanaldeul;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

class VerticalViewHolder extends RecyclerView.ViewHolder {

    public ImageView icon;
    public TextView description;

    public VerticalViewHolder(View itemView) {
        super(itemView);

       // icon = (ImageView) itemView.findViewById(R.id.horizon_icon);
       // description = (Button) itemView.findViewById(R.id.horizon_description);

    }
}

