package com.diatomicsoft.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Likha {
    public static void likho(Context context, String s){
        Toast.makeText(context, ""+s, Toast.LENGTH_SHORT).show();
    }
}
