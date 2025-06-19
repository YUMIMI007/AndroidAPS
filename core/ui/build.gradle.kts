plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    id("android-module-dependencies")
}

android {
    namespace = "app.aaps.core.ui"
    defaultConfig {
        minSdk = Versions.wearMinSdk
    } 
     compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
     }
    kotlinOptions {
        jvmTarget = "17"
    }
}
dependencies {
    api("androidx.core:core-ktx:1.12.0")
    api("androidx.appcompat:appcompat:1.1")
    api("androidx.preference:preference:1.2.1")
    api("androidx.gridlayout:gridlayout:1.0.0")


   api("com.google.android.material:material:1.9.0")
api("com.google.dagger:dagger-android:2.56.1")
api("com.google.dagger:dagger-android-support:2.56.1")

}
