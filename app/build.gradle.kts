
plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.cdpm_7meals"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.cdpm_7meals"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
//
//    signingConfigs {
//        buildTypes {
//            release {
//
//                storeFile (file("keystore/7testM.jks"))
//                storePassword ( "7testM")
//                keyAlias ("7testM")
//                keyPassword ("7testM")
//            }
//        }
//    }
    signingConfigs {
        create("release") {
            keyAlias =  "7testM"
            keyPassword = "7testM"
            storeFile = file("keystore/7testM.jks")
            storePassword = "7testM"
        }
    }
}

dependencies {

    //viewpager2
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    //Rounded image view
    implementation("com.makeramen:roundedimageview:2.3.0")

    //Meow Bottom Navigation
    implementation("com.etebarian:meow-bottom-navigation:1.2.0")

    implementation("com.airbnb.android:lottie:4.1.0")

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-database:20.3.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.microsoft.appcenter:appcenter-analytics:4.4.5")
    implementation("com.microsoft.appcenter:appcenter-crashes:4.4.5")
}