package apprating;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import org.haxe.extension.Extension;

public class AppRating {

    public static void redirectToStore(String packageName) {
        try {
            Intent launchIntent = Extension.mainActivity.getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.vending");
            ComponentName component = new ComponentName("com.android.vending", "com.google.android.finsky.activities.LaunchUrlHandlerActivity");
            launchIntent.setComponent(component);
            launchIntent.setData(Uri.parse("market://details?id=" + packageName));
            Extension.mainActivity.getApplicationContext().startActivity(launchIntent);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
