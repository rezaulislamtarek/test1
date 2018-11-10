package com.diatomicsoft.mylibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsView extends AppCompatActivity {

    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_view);
        tvName = findViewById(R.id.name);

    }

    public void setName(Context context,String name) {
        tvName.setText(""+name);
    }
}
