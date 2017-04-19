package justynachrustna.solarsystem;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Justyna on 19.04.2017.
 */

public class SolarObjectsAdapter extends RecyclerView.Adapter<SolarObjectsAdapter.SolarObjectViewHolder>{
    private final SolarObject[] solarObjects;

    public SolarObjectsAdapter(SolarObject[] solarObjects) {
        this.solarObjects = solarObjects;
    }

    @Override
    public SolarObjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_solar_object, parent, false);
        return new SolarObjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SolarObjectViewHolder holder, int position) {
        SolarObject solarObject = solarObjects[position];
        holder.setSolarObject(solarObject);

    }

    @Override
    public int getItemCount() {
        return solarObjects.length;
    }

    class SolarObjectViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.imageView)
        ImageView itemImageView;
        @BindView(R.id.itemTextView)
        TextView itemTextView;

        private SolarObject solarObject;

        public SolarObjectViewHolder (View itemView){
            super(itemView);
            ButterKnife.bind(this. itemView);
        }

        public void setSolarObject(SolarObject solarObject) {
            this.solarObject = solarObject;
            itemTextView.setText(solarObject.getName());

            Glide.with(itemImageView.getContext()).load("file:///android_asset/"+ solarObject.getImage()).into(itemImageView);

        }

        public SolarObject getSolarObject() {
            return solarObject;
        }
    }
}
