package fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.the.myapplication.R;

/**
 * Created by The on 18/07/2015.
 */
public class Fragment_DangNhap extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_dangnhap,container,false);
        ImageButton btn_back=(ImageButton)v.findViewById(R.id.btn_back);
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
        TextView mtv_country=(TextView)v.findViewById(R.id.tv_country);
        mtv_country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment_main = new Fragment_Country();
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_title, fragment_main, "fragment_main");
                fragmentTransaction.addToBackStack("fragment_main");
                fragmentTransaction.commit();
            }
        });
        return v;
    }


}
