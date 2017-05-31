package se.bitcraze.crazyfliecontrol2;

/**
 * Created by hugo- on 27/05/2017.
 */
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class FiguresAdapter extends ArrayAdapter<Figures>{
    //figures est la liste des models à afficher
    public FiguresAdapter(Context context, List<Figures> tweets) {
        super(context, 0, tweets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.looping,parent, false);
        }

        FiguresViewHolder viewHolder = (FiguresViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new FiguresViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.looping_title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.looping_description);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.looping);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Figures figures = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.title.setText(figures.getTitle());
        viewHolder.description.setText(figures.getDescription());
        viewHolder.image.setImageDrawable(new ColorDrawable(0xCCC));

        return convertView;
    }

    private class FiguresViewHolder{
        public TextView title;
        public TextView description;
        public ImageView image;
    }


}
