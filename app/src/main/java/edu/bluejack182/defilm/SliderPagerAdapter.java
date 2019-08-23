package edu.bluejack182.defilm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class SliderPagerAdapter extends PagerAdapter {
    private Context context;
    private List<Slide> slideList;

    public SliderPagerAdapter(Context context, List<Slide> slideList) {
        this.context = context;
        this.slideList = slideList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        Log.d("position", position + "");
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View slideLayout = inflater.inflate(R.layout.slider_item, null);

        ImageView slideImg = slideLayout.findViewById(R.id.slider_img);
        TextView slideText = slideLayout.findViewById(R.id.slider_title);

        Log.d(TAG, "instantiateItem: " + slideList.get(0).getImage());
        slideImg.setImageResource(slideList.get(position).getImage());
        slideText.setText(slideList.get(position).getTitle());

        container.addView(slideLayout);
        return slideLayout;
    }

    @Override
    public int getCount() {
        return slideList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
