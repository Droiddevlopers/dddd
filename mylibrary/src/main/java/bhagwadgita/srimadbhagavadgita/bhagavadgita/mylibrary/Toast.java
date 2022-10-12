package bhagwadgita.srimadbhagavadgita.bhagavadgita.mylibrary;

import android.content.Context;

public class Toast {

    public static void s(Context c , String msg){
        android.widget.Toast.makeText(c, msg, android.widget.Toast.LENGTH_SHORT).show();
    }
}
