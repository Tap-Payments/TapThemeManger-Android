# TapThemeManger-Android 
[![Platform](https://img.shields.io/badge/platform-Android-inactive.svg?style=flat)](https://developer.android.com/docs)
[![Build](https://github.com/Tap-Payments/TapThemeManger-Android/workflows/Build/badge.svg)](https://github.com/Tap-Payments/TapThemeManger-Android/actions)
[![Documentation](https://img.shields.io/badge/documentation-100%25-bright%20green.svg)](https://tap-payments.github.io/TapThemeManger-Android/)
[![SDK Version](https://img.shields.io/badge/minSdkVersion-21-blue.svg)](https://stuff.mit.edu/afs/sipb/project/android/docs/reference/packages.html)
[![SDK Version](https://img.shields.io/badge/targetSdkVersion-29-informational.svg)](https://stuff.mit.edu/afs/sipb/project/android/docs/reference/packages.html)

A library that facilitate the ability of changing the app theme with single line of code 
<a name="installation_with_jitpack"></a>
### Installation with JitPack
---
[JitPack](https://jitpack.io/) is a novel package repository for JVM and Android projects. It builds Git projects on demand and provides you with ready-to-use artifacts (jar, aar).

To integrate TapThemeManger into your project add it in your **root** `build.gradle` at the end of repositories:
```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
Step 2. Add the dependency
```groovy
dependencies {
  implementation 'com.github.Tap-Payments:TapThemeManger-Android:0.0.1'
}
```

### Usage
---
1- Init the ThemeManager and load the theme
```java
themeManager = new ThemeManager();
themeManager.loadTapTheme(getResources(),R.raw.theme);
```
2- Get the theming object from the manager and theme your widgets
```java
mainBinding.setTextViewTheme(themeManager.getAtomsTheme().getTextViewTheme());
```
-----
<a name="docs"></a>
# Documentation
Documentation is available at [github-pages][2].

[2]:https://tap-payments.github.io/TapThemeManger-Android/
