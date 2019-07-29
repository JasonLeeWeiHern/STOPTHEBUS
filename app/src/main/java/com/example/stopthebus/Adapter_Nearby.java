package com.example.stopthebus;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Nearby extends RecyclerView.Adapter<Adapter_Nearby.ExampleViewHolder2> implements Filterable {
    private List<ExampleItem_nearby> exampleList_nearby;
    private List<ExampleItem_nearby> exampleListFull_nearby;

    public Adapter_Nearby(List<ExampleItem_nearby> exampleList_nearby, List<ExampleItem_nearby> exampleListFull_nearby,  Context context, Filter exampleFilter) {
        this.exampleList_nearby = exampleList_nearby;
        this.exampleListFull_nearby = exampleListFull_nearby;
        this.exampleFilter = exampleFilter;
    }


    class ExampleViewHolder2 extends RecyclerView.ViewHolder {
        TextView txtv1, txtv2;
        RelativeLayout parent_layout2;

        ExampleViewHolder2(View itemView) {
            super(itemView);
            txtv1 = itemView.findViewById(R.id.text_view1_busstop);
            txtv2 = itemView.findViewById(R.id.text_view2_distance);
            parent_layout2 = itemView.findViewById(R.id.parent_layout_2);
        }

    }

    Adapter_Nearby(List<ExampleItem_nearby> exampleList_nearby) {
        this.exampleList_nearby = exampleList_nearby;
        exampleListFull_nearby = new ArrayList<>(exampleList_nearby);
    }

    
    @NonNull
    @Override
    public ExampleViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item2,
                parent, false);
        ExampleViewHolder2 holder = new ExampleViewHolder2(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder2 holder,final int position) {
        final ExampleItem_nearby currentItem = exampleList_nearby.get(position);
        holder.txtv1.setText(currentItem.getText1());
        holder.txtv2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return exampleList_nearby.size();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }
    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<ExampleItem_nearby> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(exampleListFull_nearby);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (ExampleItem_nearby item : exampleListFull_nearby) {
                    if (item.getText1().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            exampleList_nearby.clear();
            exampleList_nearby.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
}
