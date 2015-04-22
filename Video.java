package sloshyd.uk.myfirstfragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darren Brooks on 21/04/2015.
 * DataClass
 */
public class Video {

    private String videoTitle;
    private int videoRating;

    public Video(String videoTitle, int videoRating){
        this.videoRating = videoRating;
        this.videoTitle = videoTitle;
    }
    public String getVideoTitle() {
        return videoTitle;
    }

    public int getVideoRating() {
        return videoRating;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public void setVideoRating(int videoRating) {
        this.videoRating = videoRating;
    }
}
