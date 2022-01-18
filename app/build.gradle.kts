plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}




android {
    compileSdkVersion(31)

    defaultConfig {
        applicationId("com.dawn.plugin2")
        minSdkVersion(22)
        targetSdkVersion(31)
        versionCode(1)
        versionName("1.0")
    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }


}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.2")

}
