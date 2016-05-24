package shareex;

import android.net.Uri;
import android.content.Intent;
import org.haxe.extension.Extension;

public class AppRate {

	public static void execute(String packageName) {
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.openclassrooms.com"));
		Extension.mainActivity.getApplicationContext().startActivity(browserIntent);
	}
}
