package sloshyd.uk.myfirstfragment;

import android.app.Fragment;
import android.app.ListActivity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Darren Brooks on 21/04/2015.
 * The ListFragement Superclass is used not the fragement superclass as this gives many of the
 * same features of the ListActivity
 */
public class MyFragment extends ListFragment {

     List<Video> list = new VideoData().getData();
    //IMPORTANT: must have a no argument constructor as one is EXPECTED and may cause crash
    public MyFragment(){

    }

    //need to add onCreate() and add Adapter


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListAdapter adapter = new ListAdapter(getActivity(), R.layout.list_layout, list);
        setListAdapter(adapter);
    }

    //method that returns the view of the fragement
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }
}
