package com.yolo.user.muworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UserAreaActivity extends AppCompatActivity {
String [] myStringArray = new String[]{"News","Gallery","Transfer news","Football Daily",
        "Football Extras","MU TV","Fixture & Results","Fan Zone","Conference & Events","Offical Membership","Players & Staff","Official Membership","Shopping","Season Ticket"

};
    private ListView mListview;
    private ArrayAdapter mArrayAdaptor;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
    mListview = (ListView) findViewById(R.id.listviewcontroller);
    mArrayAdaptor = new ArrayAdapter(this,android.R.layout.simple_list_item_1,myStringArray);

    if(mListview !=null){
        mListview.setAdapter(mArrayAdaptor);
    }




    }
}
