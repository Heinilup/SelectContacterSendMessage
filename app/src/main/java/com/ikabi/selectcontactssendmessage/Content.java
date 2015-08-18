package com.ikabi.selectcontactssendmessage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2015/8/18.
 */
public class Content extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView lv = (ListView) findViewById(R.id.lv);

        /* 虚构联系人Array列表 */
        final String[] objects = new String[]{
                "亲，正在开会稍后回你",
                "加班中，不方便接电话",
                "睡觉ING，明天回你"
        };

        lv.setAdapter(new ArrayAdapter<String>(this, R.layout.activity_item, R.id.tv, objects));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent data = new Intent();
                data.putExtra("name", objects[position]);
                setResult(0, data);
                finish();
            }
        });
    }
}
