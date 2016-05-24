apprating
===
Extension that let you open store rating section of a given id app on android and ios.


Installation
============

You can easily install IAP using haxelib:

    haxelib install extension-apprating

To add it to a Lime or OpenFL project, add this to your project file:

    <haxelib name="extension-apprating" />

How to use
============

To openstore link, just use:

    AppRating.redirectToStore(packageName);

iOS example :

    AppRating.redirectToStore(343200656);

Android example :

    AppRating.redirectToStore("com.rovio.angrybirds");
