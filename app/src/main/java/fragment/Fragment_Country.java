package fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.the.myapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import adaptor.Header;
import adaptor.Item;
import adaptor.ListItem;
import adaptor.TwoTextArrayAdapter;

/**
 * Created by The on 20/07/2015.
 */
public class Fragment_Country extends Fragment {
    ListView lv = null;
    ImageButton mbtn_Search, mbtn_Close,mbtn_Back;
    TextView tv_head, tv_search;
    RelativeLayout rl_search;
    ImageView imv_search;
    EditText edt_search;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main_country, container, false);
        lv = (ListView) v.findViewById(R.id.fragment_main_list);
        mbtn_Back = (ImageButton) v.findViewById(R.id.mbtn_back);
        mbtn_Search = (ImageButton) v.findViewById(R.id.mbtn_search);
        mbtn_Close = (ImageButton) v.findViewById(R.id.mbtn_close);
        tv_head = (TextView) v.findViewById(R.id.tv_head);
        rl_search = (RelativeLayout) v.findViewById(R.id.rl_search);
        imv_search = (ImageView) v.findViewById(R.id.iv_icon_search);
        tv_search = (TextView) v.findViewById(R.id.tv_search);
        edt_search = (EditText) v.findViewById(R.id.edt_search);

        List<Item> items = new ArrayList<Item>();
        items.add(new ListItem("Viet Nam", "+84"));
        items.add(new Header("A"));
        items.add(new ListItem("Text 1", "Rabble rabble"));
        items.add(new ListItem("Text 2", "Rabble rabble"));
        items.add(new ListItem("Text 3", "Rabble rabble"));
        items.add(new ListItem("Text 4", "Rabble rabble"));
        items.add(new Header("Header 2"));
        items.add(new ListItem("Text 5", "Rabble rabble"));
        items.add(new ListItem("Text 6", "Rabble rabble"));
        items.add(new ListItem("Text 7", "Rabble rabble"));
        items.add(new ListItem("Text 8", "Rabble rabble"));
        items.add(new ListItem("Viet Nam", "Rabble rabble"));
        items.add(new Header("Header 3"));
        items.add(new ListItem("Text 1", "Rabble rabble"));
        items.add(new ListItem("Text 2", "Rabble rabble"));
        items.add(new ListItem("Text 3", "Rabble rabble"));
        items.add(new ListItem("Text 4", "Rabble rabble"));
        items.add(new Header("Header 4"));
        items.add(new ListItem("Text 5", "Rabble rabble"));
        items.add(new ListItem("Text 6", "Rabble rabble"));
        items.add(new ListItem("Text 7", "Rabble rabble"));
        items.add(new ListItem("Text 8", "Rabble rabble"));

        TwoTextArrayAdapter adapter = new TwoTextArrayAdapter(getActivity(), items);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv1 = (TextView) view.findViewById(R.id.separator);
                TextView tv = (TextView) view.findViewById(R.id.list_content1);
                TextView tv2 = (TextView) view.findViewById(R.id.list_content2);
                Toast.makeText(getActivity().getApplicationContext(), "Hello" + tv.getText(), Toast.LENGTH_LONG).show();

            }
        });
        Change();
        Text_search_Change();
        return v;
    }

    public void Change() {
        mbtn_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_head.setVisibility(View.GONE);
                mbtn_Search.setVisibility(View.GONE);
                rl_search.setVisibility(View.VISIBLE);
            }
        });
        mbtn_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_head.setVisibility(View.VISIBLE);
                mbtn_Search.setVisibility(View.VISIBLE);
                rl_search.setVisibility(View.GONE);
            }
        });

        mbtn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment_main = new Fragment_DangNhap();
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_title, fragment_main);
                fragmentTransaction.commit();
            }
        });
    }

    public void Text_search_Change() {
        edt_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    imv_search.setVisibility(View.VISIBLE);
                    tv_search.setVisibility(View.VISIBLE);;
                } else {
                    imv_search.setVisibility(View.GONE);
                    tv_search.setVisibility(View.GONE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}
