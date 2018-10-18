package kz.aleksey.loftcoin;

import android.app.Application;

import kz.aleksey.loftcoin.data.prefs.Prefs;
import kz.aleksey.loftcoin.data.prefs.PrefsImpl;

public class App extends Application {

    private Prefs prefs;

    @Override
    public void onCreate() {
        super.onCreate();

        prefs = new PrefsImpl(this);

    }

    public Prefs getPrefs(){
        return prefs;
    }
}
