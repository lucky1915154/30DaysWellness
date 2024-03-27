package com.example.a30dayswellness.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a30dayswellness.R;
import com.example.a30dayswellness.interFace.OnClickDay;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.viewHolder> {
    private ArrayList<String> days;
    private ArrayList<String> titles;
    private ArrayList<String> details;
    private ArrayList<String> imageUrls;
    private Context context;
    private OnClickDay onClickDay;
    private int expandedPosition = -1;
    private TextView lastExpandedTextView;

    public DayAdapter(ArrayList<String> days, ArrayList<String> titles, ArrayList<String> details, ArrayList<String> imageUrls, Context context, OnClickDay onClickDay) {
        this.days = days;
        this.titles = titles;
        this.details = details;
        this.imageUrls = imageUrls;
        this.context = context;
        this.onClickDay = onClickDay;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.days,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        String day=days.get(position);
        holder.day.setText(days.get(position));
        holder.dayTitle.setText(titles.get(position));
        holder.dayDetails.setText(details.get(position));

        Picasso.get().load(imageUrls.get(position)).into(holder.dayImage);



        Log.d("DAYADAPTER", "onBindViewHolder: "+day);
    }

    @Override
    public int getItemCount() {
        return days.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public TextView day;
        public TextView dayTitle;
        public TextView dayDetails;
        public ImageView dayImage;
        public CardView card;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            card=itemView.findViewById(R.id.card);
            day=itemView.findViewById(R.id.day);
            dayTitle=itemView.findViewById(R.id.day_title);
            dayDetails=itemView.findViewById(R.id.day_details);
            dayImage=itemView.findViewById(R.id.day_image);

            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        if (expandedPosition == position) {
                            // Collapse the previously expanded item
                            collapseItem(dayDetails);
                            expandedPosition = -1;
                        } else {
                            // Collapse the previously expanded item
                            if (expandedPosition != -1) {
                                collapseItem(lastExpandedTextView);
                            }
                            // Expand the clicked item
                            expandItem(dayDetails);
                            expandedPosition = position;
                        }
                        lastExpandedTextView = dayDetails;
                    }
                }
            });
        }
        private void expandItem(TextView textView) {
            textView.setVisibility(View.VISIBLE);
            ViewPropertyAnimator animator = textView.animate();
            animator.alpha(1f)
                    .setDuration(300)
                    .setListener(null);
        }

        private void collapseItem(TextView textView) {
            ViewPropertyAnimator animator = textView.animate();
            animator.alpha(0f)
                    .setDuration(300)
                    .setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            textView.setVisibility(View.GONE);
                        }
                    });
        }
    }

}
