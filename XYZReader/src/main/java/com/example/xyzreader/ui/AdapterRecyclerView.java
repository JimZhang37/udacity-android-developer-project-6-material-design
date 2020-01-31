package com.example.xyzreader.ui;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder1> {


    private String[] strings;

    public AdapterRecyclerView() {

    }

    public void setData(String[] s){
        this.strings = s;
    }

    @Override
    public int getItemCount() {
        return this.strings.length;
    }

    @Override
    public void onBindViewHolder(ViewHolder1 holder, int position) {
        holder.bind(strings[position]);

    }


    @Override
    public ViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewholer_paragraph,parent,false);

        return new ViewHolder1(view1);
    }

    class ViewHolder1 extends RecyclerView.ViewHolder{
        private TextView textView;

        public ViewHolder1(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_paragraph);
        }

        public void bind(String s){
            textView.setText(Html.fromHtml(s));
        }

    }
}
