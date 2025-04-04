// build.gradle.kts (Project)
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.6.0") // O versión más reciente
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0") // O versión más reciente
    }
}

// ELIMINAR ESTE BLOQUE O COMENTARLO
// allprojects {
//     repositories {
//         google()
//         mavenCentral()
//     }
// }

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}