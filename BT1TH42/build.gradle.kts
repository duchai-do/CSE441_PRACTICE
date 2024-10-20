plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}


buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        // Thêm Google Services trực tiếp vào classpath
        classpath("com.google.gms:google-services:4.4.2")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
