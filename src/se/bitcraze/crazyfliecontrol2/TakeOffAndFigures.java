package se.bitcraze.crazyfliecontrol2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class TakeOffAndFigures extends Activity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_off_and_figures);

        mListView = (ListView) findViewById(R.id.listView);

        //Set Button Actions
        initializeMenuButtons();
    }


    private void initializeMenuButtons() {
        ImageButton settingsButton = (ImageButton) findViewById(R.id.activity_main_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TakeOffAndFigures.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
