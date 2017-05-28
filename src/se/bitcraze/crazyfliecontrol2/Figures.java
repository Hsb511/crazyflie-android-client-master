package se.bitcraze.crazyfliecontrol2;

import android.graphics.drawable.Drawable;

/**
 * Created by hugo- on 27/05/2017.
 */

public class Figures {
    private String title;
    private String description;

    public Figures (String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;    }

}
