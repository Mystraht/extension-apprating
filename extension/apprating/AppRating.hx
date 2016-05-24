package extension.apprating;

import openfl.net.URLRequest;
import openfl.Lib;

class AppRating {

	#if android
	private static var openStore : String->Void = openfl.utils.JNI.createStaticMethod("apprating/AppRating", "redirectToStore", "(Ljava/lang/String;)V");
	#end

	private static inline var IOS_LINK:String = 'itms://itunes.apple.com/us/app/apple-store/id';

	public static function redirectToStore(appId:String):Void {
		#if ios
		Lib.getURL(new URLRequest(IOS_LINK + appId));
		#end
		#if android
		openStore(appId);
		#end
	}
}
