package extension.apprate;

class AppRate {

	#if android
	private static var openStore : String->Void = openfl.utils.JNI.createStaticMethod("apprate/AppRate", "execute", "(Ljava/lang/String;)V");
	#end

	public static function execute(appId:String):Void {
		#if android
			openStore(appId);
		#end
	}

}
