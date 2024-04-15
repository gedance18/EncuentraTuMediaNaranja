
plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.encuentratumedianaranja"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.encuentratumedianaranja"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        resConfigs("es")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("androidx.activity:activity:1.3.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.google.firebase:firebase-auth:17.0.0")
    implementation("com.google.firebase:firebase-storage:17.0.0")
    implementation("com.google.firebase:firebase-messaging:19.0.0")

    implementation("com.github.bumptech.glide:glide:3.7.0")
    implementation("com.lorentzos.swipecards:library:1.0.9")
    implementation("com.google.firebase:firebase-core:17.0.0")
    implementation("com.google.firebase:firebase-database:18.0.0")

    implementation("com.github.ittianyu:BottomNavigationViewEx:1.2.4")
    implementation("de.hdodenhof:circleimageview:2.2.0")
    implementation("com.github.dimorinny:show-case-card-view:0.0.1")
    implementation("com.github.BakerJQ:Android-InfiniteCards:1.0.5")
    implementation("com.google.firebase:firebase-ads:19.7.0")
}
