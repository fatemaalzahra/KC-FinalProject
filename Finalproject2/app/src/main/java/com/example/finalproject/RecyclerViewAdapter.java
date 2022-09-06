package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Hobbies> mData;
    private int i;

    public RecyclerViewAdapter(Context mContext,List<Hobbies>mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater= LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_hobby,viewGroup,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int I) {
        this.i = i;
        myHolder.hobbyTitle.setText(mData.get(i).getHobbiesName());
        myHolder.img_hobbby_thumbnail.setImageResource(mData.get(i).getThumbnail());
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,HobbyActivity.class);

                intent.putExtra("Name",mData.get(i).getHobbiesName());
                intent.putExtra("Ingredients",mData.get(i).getHobbiesIngredients());
                intent.putExtra("MethodTitle",mData.get(i).getHobbiesMethodTitle());
                intent.putExtra("Hobby",mData.get(i).getHobby());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView hobbyTitle;
        CardView cardView;
        ImageView img_hobbby_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            hobbyTitle = (TextView)itemView.findViewById(R.id.text_hobby);
            img_hobbby_thumbnail = (ImageView)itemView.findViewById(R.id.hobby_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);
        }
    }
}
