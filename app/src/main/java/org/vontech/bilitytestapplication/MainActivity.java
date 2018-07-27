package org.vontech.bilitytestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        for (int i = 0; i < 100; i++) {
            TextView newView = new TextView(this);
            newView.setText("This is TextView #" + i);
            linearLayout.addView(newView);
        }

    }
}
