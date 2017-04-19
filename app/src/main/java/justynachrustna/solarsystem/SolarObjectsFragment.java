package justynachrustna.solarsystem;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class SolarObjectsFragment extends Fragment {


    public static final String OBJECTS_KEY = "objects";
    @BindView(R.id.objectsRecyclerView)
    RecyclerView objectsRecyclerView;

    public SolarObjectsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_solar_objects, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SolarObject[] objects = (SolarObject[]) getArguments().getSerializable(OBJECTS_KEY);
        objectsRecyclerView.setLayoutManager((new GridLayoutManager(getActivity(), 2)));
        objectsRecyclerView.setAdapter(new SolarObjectsAdapter(objects));




    }

    public static SolarObjectsFragment newInstance(SolarObject[] objects) {


        SolarObjectsFragment fragment = new SolarObjectsFragment();
        Bundle args = new Bundle();
        args.putSerializable(OBJECTS_KEY, objects);
        fragment.setArguments(args);
        return fragment;
    }

}
