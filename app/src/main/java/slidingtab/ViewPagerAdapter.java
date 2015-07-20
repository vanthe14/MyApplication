package slidingtab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import fragment.Fragment_Contact;
import fragment.Fragment_Country;
import fragment.Fragment_Menu;

/**
 * Created by Hop on 28/05/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter  {

    //This array will store the Titles of the Tabs which are going to be passed when View Pager Adapter is created
    private CharSequence[] titles;

    public ViewPagerAdapter(FragmentManager fm, CharSequence[] titles) {
        super(fm);
        this.titles = titles;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment tab0 = new Fragment_Menu();
                return tab0;
            case 1:
                Fragment tab1 = new Fragment_Menu();
                return tab1;
            case 2:
               // Fragment tab2 = new Fragment_Contact();
                Fragment tab2 = new Fragment_Menu();
                return tab2;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    // This method return the titles for the Tabs in the Tab Strip
    //This method will return the titles for the Tabs in the tab strip
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
