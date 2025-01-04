plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "uvnesh.lockwidget"
    compileSdk = 35

    defaultConfig {
        applicationId = "uvnesh.lockwidget"
        minSdk = 33
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {}