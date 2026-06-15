pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ExerciseTracker"
include(":app")
include(":core:domain")
include(":feature:sleep")
// Wear OS stub module — build separately: ./gradlew :wear:assembleRelease
// include(":wear")
