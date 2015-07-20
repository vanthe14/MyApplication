package adaptor;

import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by The on 19/07/2015.
 */
public interface Item {
    public int getViewType();
    public View getView(LayoutInflater inflater, View convertView);
}