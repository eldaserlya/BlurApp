// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    extra.apply {
        set("compose_compiler_version", "1.5.3")
        set("lifecycle_version", "2.6.2")
    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("com.android.library") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}
