package fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.the.myapplication.R;

/**
 * Created by The on 20/07/2015.
 */
public class Fragment_Notifications extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notifications, container, false);
        LinearLayout btn_back=(LinearLayout)v.findViewById(R.id.notification_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Fragment fragment_main = new Fragment_Main();
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_title, fragment_main,"fragment_main");
                fragmentTransaction.addToBackStack("fragment_main");
                fragmentTransaction.commit();
            }
        });
        return v;
    }
}
