package com.dictionary.activity;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import com.dictionary.R;

public class HistoryAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v ==null){
            v = inflater.inflate(R.layout.item_dic,null);
        }
        CheckBox check = v.findViewById(R.id.itemCheck);
        TextView txtWord =v.findViewById(R.id.txtWord);
        TextView txtDefine =v.findViewById(R.id.txtDefine);
        ImageButton audio = v.findViewById(R.id.SpeakerButton);
        ImageButton fava = v.findViewById(R.id.favorButton);

        return v;
    }
}
