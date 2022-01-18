// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        maven( url = uri("https://mirrors.tencent.com/nexus/repository/maven-public/"))
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
    }
}

tasks.register("clean", Delete::class.java){
    delete(rootProject.buildDir)
}