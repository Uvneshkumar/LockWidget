package uvnesh.lockwidget;

import android.app.Activity;
import android.os.Bundle;

import java.io.IOException;

public class LockActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Runtime.getRuntime().exec("su -c input keyevent 223");
        } catch (IOException ignored) {
        }
        super.onCreate(savedInstanceState);
        finish();
    }
}