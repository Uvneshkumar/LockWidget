package uvnesh.lockwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.io.IOException;

public class LockClickHandler extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            Runtime.getRuntime().exec("su -c input keyevent 223");
        } catch (IOException ignored) {
        }
    }
}
