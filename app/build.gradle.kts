plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 33 // or your specific target SDK version

    defaultConfig {
        applicationId = "com.example.loginpage" // Use your actual application ID
        minSdk = 21
        targetSdk = 33 // Ensure this matches your target SDK
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            minifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
}
