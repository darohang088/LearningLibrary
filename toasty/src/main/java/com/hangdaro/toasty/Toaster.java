package com.hangdaro.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void simpleToast(Context context,String nameToast){
        Toast.makeText(context, nameToast, Toast.LENGTH_SHORT).show();
    }


}
