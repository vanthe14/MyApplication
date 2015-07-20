package fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.the.myapplication.R;

/**
 * Created by The on 18/07/2015.
 */
public class Fragment_Main extends Fragment {
    Button btn_Dangnhap,btn_Dangky;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_main,container,false);
        btn_Dangnhap=(Button)v.findViewById(R.id.btn_Dangnhap);
        btn_Dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment_main = new Fragment_DangNhap();
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_title, fragment_main,"fragment_main");
                fragmentTransaction.addToBackStack("fragment_main");
                fragmentTransaction.commit();
            }
        });
        btn_Dangky=(Button)v.findViewById(R.id.btn_dangky);
        btn_Dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment_main = new Fragment_Contact();
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
