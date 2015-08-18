package com.ikabi.selectcontactssendmessage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    static final int CONTACT_LIST = 10;
    static final int SMS_LIST = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v){
        Intent intent = new Intent(this, Contacts.class);

            startActivityForResult(intent, CONTACT_LIST);

    }
    public void click1(View v){
        Intent intent = new Intent(this, Content.class);

        startActivityForResult(intent, SMS_LIST);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == CONTACT_LIST){
            EditText ct_name = (EditText) findViewById(R.id.ct_name);
            ct_name.setText(data.getStringExtra("name"));
        }else if(requestCode == SMS_LIST) {
            EditText ct_name = (EditText) findViewById(R.id.ct_content);
            ct_name.setText(data.getStringExtra("name"));
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
