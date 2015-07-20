package adaptor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.the.myapplication.R;

import java.util.ArrayList;

import modal.Country;

/**
 * Created by The on 19/07/2015.
 */
public class Main_ListView_Adaptor extends ArrayAdapter<Country> {
    private ArrayList<Country> classes;
    private Activity con;
    TextView seperator;

    public Main_ListView_Adaptor(Activity context, int textViewResourceId, ArrayList<Country> classes) {
        super(context, textViewResourceId, classes);
        this.con = context;
        this.classes = classes;

    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {

            LayoutInflater vi = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            v = vi.inflate(R.layout.main_list_item, null);

        }

        Country user = classes.get(position);

        if (user != null) {

            TextView content1 = (TextView) v.findViewById(R.id.list_content1);

            TextView content2 = (TextView) v.findViewById(R.id.list_content2);

            if (content1 != null) {

                content1.setText(user.getMcountry_name());
            }
            if(content2 != null) {

                content2.setText(user.getMcode());
            }
        }
        return v;
    }
}
