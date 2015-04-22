package sloshyd.uk.myfirstfragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darren Brooks on 21/04/2015.
 */
public class VideoData {

    private List<Video> list = new ArrayList<>();


    public VideoData(){



        list.add(new Video("Star Wars - A New Hope", 5));
        list.add(new Video("Star Wars - Empire Strikes Back", 4));
        list.add(new Video("Star Wars - Return of the Jedi", 3));

        }

    public List<Video> getData(){
        return list;
    }

}



