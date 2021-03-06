package co.getcrewd.crewd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.TwoLineListItem;

import java.util.ArrayList;

/**
 * Created by jeffchin on 4/19/14.
 */
class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Rower> rowers;

    public MyAdapter(Context context, ArrayList<Rower> rowers) {
        this.context = context;
        this.rowers = rowers;
    }

    @Override
    public int getCount() {
        return rowers.size();
    }

    @Override
    public Object getItem(int position) {
        return rowers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TwoLineListItem twoLineListItem;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            twoLineListItem = (TwoLineListItem) inflater.inflate(
                    android.R.layout.simple_list_item_2, null);
        } else {
            twoLineListItem = (TwoLineListItem) convertView;
        }

        TextView text1 = twoLineListItem.getText1();
        TextView text2 = twoLineListItem.getText2();

        text1.setText(rowers.get(position).getName());
        text2.setText(rowers.get(position).getSplit());

        return twoLineListItem;
    }
}
