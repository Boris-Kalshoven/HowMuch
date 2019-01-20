package com.example.howmuch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SuggestionAdapter extends RecyclerView.Adapter<SuggestionAdapter.ViewHolder> {

    private List<Suggestion> mSuggestions;

    public SuggestionAdapter(List<Suggestion> mSuggestions) {
        this.mSuggestions = mSuggestions;
    }

    @NonNull
    @Override
    public SuggestionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(android.R.layout.simple_list_item_1, null);
        // Return a holder instance
        SuggestionAdapter.ViewHolder viewHolder = new SuggestionAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuggestionAdapter.ViewHolder holder, int position) {
        Suggestion suggestion = mSuggestions.get(position);
        holder.textView.setText(suggestion.getmSuggestionText());
    }

    @Override
    public int getItemCount() {
        return mSuggestions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        public ViewHolder(View view) {
            super(view);
            textView = itemView.findViewById(android.R.id.text1);
        }
    }
}
