package app.android.example.com.refridgermaker;

import android.app.Activity;
import android.app.ListActivity;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lab on 6/11/2016.
 */
public class inventoryPage extends Fragment {

    private ListView lv;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.inventory_page, container, false);

        lv = (ListView) view.findViewById(R.id.inventory_layout);

        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        List<String> your_array_list = new ArrayList<String>();
        your_array_list.add("foo");
        your_array_list.add("bar");
        your_array_list.add("dssdadsaf");
        your_array_list.add("dssdadsaf");
        your_array_list.add("dssdadsaf");

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1,
                your_array_list );

        lv.setAdapter(arrayAdapter);

        return view;
    }

}
