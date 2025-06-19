plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.ksp)
    id("kotlin-android")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "app.aaps.plugins.aps"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:interfaces"))
    implementation(project(":core:keys"))
    implementation(project(":core:nssdk"))
    implementation(project(":core:objects"))
    implementation(project(":core:utils"))
    implementation(project(":core:ui"))
    implementation(project(":core:validators"))

    testImplementation(project(":pump:virtual"))
    testImplementation(project(":shared:tests"))

    api("androidx.appcompat:appcompat:1.6.1")
    api("androidx.swiperefreshlayout:swiperefreslayout:1.1.0")
    api("androidx.gridlayout:gridlayot:1.1.0")
    api(kotlin("reflect"))

    // APS (it should be androidTestImplementation but it doesn't work)
    api("org.mozilla.rhino:1.7.13")

    //Logger
    api("org.slf4j:slf4j-api:2.0.9")

    ksp("com.google.dagger.dagger-compiler:2.56.1")
}
