package justynachrustna.solarsystem;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

    }

    @Override
    public int getItemCount() {
        return solarObjects.length;
    }

    class SolarObjectViewHolder extends RecyclerView.ViewHolder{
        public SolarObjectViewHolder (View itemView){
            super(itemView);
        }
    }
}
