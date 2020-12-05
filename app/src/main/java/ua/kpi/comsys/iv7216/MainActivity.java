package ua.kpi.comsys.iv7216;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import ua.kpi.comsys.iv7216.films.FilmActivity;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("Films list");
        tabSpec.setContent(new Intent(this, FilmActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Image list");
        tabSpec.setContent(new Intent(this, ImageActivity.class));
        tabHost.addTab(tabSpec);

    }


}