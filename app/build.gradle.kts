plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "uvnesh.lockwidget"
    //noinspection GradleDependency
    compileSdk = 30

    defaultConfig {
        applicationId = "uvnesh.lockwidget"
        minSdk = 30
        //noinspection ExpiredTargetSdkVersion
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }

    applicationVariants.all {
        val variant = this
        variant.outputs.map { it as com.android.build.gradle.internal.api.BaseVariantOutputImpl }
            .forEach { output ->
                val outputFileName = "LockWidget.apk"
                output.outputFileName = outputFileName
            }
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