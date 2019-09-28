package com.example.ad37_tdhai_b5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHoder> {
    List<Item> items;
    IonClickItem ionClickItem;

    public ItemAdapter(List<Item> items) {

    }

    @NonNull
    @Override
    public ItemAdapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.contact,parent,false);
        ViewHoder viewHoder=new ViewHoder(view);
        return viewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHoder holder, int position) {
        final Item item=items.get(position);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        TextView tvName;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvNameItem);
        }
    }
}
