rootProject.name = "kotlin-boilerplate"

pluginManagement {
    val kotlin_version: String by settings
    val klint_version: String by settings

    plugins {
        id("org.jlleitschuh.gradle.ktlint") version klint_version
        kotlin("jvm") version kotlin_version
    }
}
