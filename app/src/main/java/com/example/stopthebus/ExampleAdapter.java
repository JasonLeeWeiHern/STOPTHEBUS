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

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> implements Filterable {
    private List<ExampleItem> exampleList;
    private List<ExampleItem> exampleListFull;
    private Context mContext;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public ExampleAdapter(List<ExampleItem> exampleList, List<ExampleItem> exampleListFull,  Context context, Filter exampleFilter) {
        this.exampleList = exampleList;
        this.exampleListFull = exampleListFull;
        this.exampleFilter = exampleFilter;
        mContext = context;
    }


    class ExampleViewHolder extends RecyclerView.ViewHolder {
        TextView textView1, textView2;
        RelativeLayout parent_layout;

        ExampleViewHolder(View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.text_view1);
            textView2 = itemView.findViewById(R.id.text_view2);
            parent_layout = itemView.findViewById(R.id.parent_layout);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }

    }

    ExampleAdapter(List<ExampleItem> exampleList) {
        this.exampleList = exampleList;
        exampleListFull = new ArrayList<>(exampleList);
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,
                parent, false);
        ExampleViewHolder holder = new ExampleViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, final int position) {
        final ExampleItem currentItem = exampleList.get(position);

        holder.textView1.setText(currentItem.getText1());
        holder.textView2.setText(currentItem.getText2());

    }

    @Override
    public int getItemCount() {
        return exampleList.size();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<ExampleItem> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(exampleListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (ExampleItem item : exampleListFull) {
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
            exampleList.clear();
            exampleList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
}