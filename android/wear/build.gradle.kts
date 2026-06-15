plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.exercisetracker.wear"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.exercisetracker.app.wear"
        minSdk = 30
        targetSdk = 35
        versionCode = 107
        versionName = "0.7.93"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
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
    implementation("com.google.android.gms:play-services-wearable:18.2.0")
    implementation("androidx.wear.tiles:tiles:1.4.0")
    implementation("androidx.wear.watchface:watchface-complications-data-source:1.2.1")
}
