package cartapi;


import android.provider.CalendarContract;

public class Myretrofit {
    private static retrofit.Myretrofit instance;

    public static retrofit.Myretrofit getInstance() {
        return instance;
    }

    public static void setInstance(retrofit.Myretrofit instance) {
        Myretrofit.instance = instance;
    }
}

   
