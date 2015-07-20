package fragment;

import android.app.Fragment;
import android.os.Bundle;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.the.myapplication.R;

import java.util.ArrayList;
import slidingtab.SlidingTabLayout;
import slidingtab.ViewPagerAdapter;

/**
 * Created by The on 20/07/2015.
 */
public class Fragment_content extends FragmentActivity {
    SlidingTabLayout tabs;
    ViewPager pager;
    ViewPagerAdapter adapter;
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_content);
        initialize();
    }
    private void initialize() {
       /* pager = (ViewPager) v.findViewById(R.id.viewpager);

      // names of tabs
        CharSequence[] titles = {"FOLLOWING", "YOU"};


        // init & set adapter
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), titles);
        pager.setAdapter(adapter);

        // set view pager to sliding tabs
        tabs = (SlidingTabLayout) v.findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // sacle full width
        tabs.setViewPager(pager);*/
    }
}
