pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    // PREFER_PROJECT：允许本机 init.gradle / 私服镜像追加仓库（如 E:\Server\Repository），
    // 避免 FAIL_ON_PROJECT_REPOS 与初始化脚本冲突导致构建直接失败。
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "UniversalAmbientLight"
include(":app")
