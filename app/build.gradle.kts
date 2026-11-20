plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.abbos.film100"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.abbos.film100"
        minSdk = 26
        // 34 on purpose: newer targets force edge-to-edge, which would stop the app from tinting the system bars.
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
