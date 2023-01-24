package com.example.cartoonlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CartoonAdaptor extends RecyclerView.Adapter<CartoonAdaptor.ViewHolder> {

    CartoonData[] cartoonData;
    Context context;

    public CartoonAdaptor(CartoonData[] cartoonData, MainActivity activity) {
        this.cartoonData = cartoonData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cartoon_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CartoonData cartoonDataList = cartoonData[position];
        holder.cartoonName.setText(cartoonDataList.getCartoonName());
        holder.cartoonDiscription.setText(cartoonDataList.getCartoonDescription());
        holder.cartoonImage.setImageResource(cartoonDataList.getCartoonImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, cartoonDataList.getCartoonName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cartoonData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView cartoonImage;
        TextView cartoonName;
        TextView cartoonDiscription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cartoonImage = itemView.findViewById(R.id.imageview);
            cartoonName = itemView.findViewById(R.id.textName);
            cartoonDiscription = itemView.findViewById(R.id.textdate);

        }
    }

}