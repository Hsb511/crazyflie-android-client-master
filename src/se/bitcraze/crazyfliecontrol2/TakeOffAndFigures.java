package se.bitcraze.crazyfliecontrol2;

import android.content.Intent;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TakeOffAndFigures extends Activity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_off_and_figures);

        //Set Button Actions
        initializeMenuButtons();

        mListView = (ListView) findViewById(R.id.listView);


        List<Figures> figures = genererFigures();
        FiguresAdapter adapter = new FiguresAdapter(TakeOffAndFigures.this, figures);
        mListView.setAdapter(adapter);
    }


    private void initializeMenuButtons() {
        ImageButton mainActivityBack = (ImageButton) findViewById(R.id.activity_main_button);
        mainActivityBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TakeOffAndFigures.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton takeOffButton = (ImageButton) findViewById(R.id.takeoff_button);
        takeOffButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(TakeOffAndFigures.this, TakeOffAndFigures.this);
                //startActivity(intent);
            }
        });
    }

    /**mListView.setOnItemClickListener(new OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?>adapter,View v, int position){
            ItemClicked item = adapter.getItemAtPosition(position);

            Intent intent = new Intent(Activity.this,destinationActivity.class);
            //based on item add info to intent
            startActivity(intent);
        }
    });*/
    
    private List<Figures> genererFigures(){
        Resources res = getResources();
        List<Figures> figures = new ArrayList<>();
        figures.add(new Figures("Looping", "Le looping est réalisé par le drone en avançant horizontalement et il effectue une boucle verticalenent vers le haut"));
        figures.add(new Figures("Vrille", "La vrille est réalisée par le drone en avançant horizontalement et il effectue une boucle sur le plan horizontal"));
        figures.add(new Figures("Saut basique", "Le saut basique se rélaise lorsque le drone est en mode stabilisation et alors il monte d'un coup vers le haut"));
        return figures;
    }
}
