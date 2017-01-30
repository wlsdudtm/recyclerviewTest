package com.nyan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lucy.choi on 2017. 1. 29..
 */

public class NyanAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<String> nameList = new ArrayList<>();

    private final int HEADER_VIEW_TYPE = 0;
    private final int ITEM_VIEW_TYPE = 1;

    public NyanAdapter() {
        nameList.add("header1");
        nameList.add("gyuha");
        nameList.add("myoju");
        nameList.add("header2");
        nameList.add("nyan");
        nameList.add("meow");
        nameList.add("header3");
        nameList.add("ho");
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        if (viewType == HEADER_VIEW_TYPE) {
            View view = layoutInflater.inflate(R.layout.header_item, parent, false);
            return new HeaderViewHolder(view);
        } else {
            View view = layoutInflater.inflate(R.layout.text_item, parent, false);
            return new ItemViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof HeaderViewHolder) {
            HeaderViewHolder headerVH = (HeaderViewHolder)holder;

            headerVH.headerTv.setText(nameList.get(position));
            //headerVH.headerIv.setImageDrawable(nameList.get(position).imageUrl);

        } else if (holder instanceof ItemViewHolder) {
            ItemViewHolder tvHolder = (ItemViewHolder)holder;

            tvHolder.nameTv.setText(nameList.get(position));
        }

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    @Override
    public int getItemViewType(int position) {

        if (position % 3 == 0) {
            return HEADER_VIEW_TYPE;
        } else {
            return ITEM_VIEW_TYPE;
        }
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView nameTv;
        //TextView singerTv;

        public ItemViewHolder(View itemView) {
            super(itemView);
            nameTv = (TextView) itemView.findViewById(R.id.name_tv);
           // singerTv = (TextView) itemView.findViewById(R.id.singer_tv);
        }
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {

        TextView headerTv;
        ImageView headerIv;

        public HeaderViewHolder(View itemView) {
            super(itemView);

            headerTv = (TextView) itemView.findViewById(R.id.header_text_view);
            headerIv = (ImageView) itemView.findViewById(R.id.header_iv);
        }
    }
}
