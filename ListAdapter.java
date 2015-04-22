package sloshyd.uk.myfirstfragment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

/**
 * Created by Darren Brooks on 22/04/2015.
 */
public class ListAdapter extends ArrayAdapter <Video> {

    private Context context;
    private List<Video> list;

    public ListAdapter(Context context, int resource, List<Video> list) {
        super(context, resource, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Video video = list.get(position);

        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_layout, null);

        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(video.getVideoTitle());

        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
        ratingBar.setNumStars(video.getVideoRating());

        return view;

    }
}
