package app.android.example.com.nutri_potum40;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lab on 1/11/2016.
 */
public class FiberActivity extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fiber_layout, container, false);

        //drinkAmountSliderStart();

        return view;
    }
    
}
