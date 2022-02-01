plugins {
    kotlin("jvm") version "1.6.10"
}

allprojects {

    group = "net.qqkit.mal"
    version = "0.1.0"

    repositories {
        mavenLocal()
        maven("https://maven.icecreamqaq.com/repository/maven-public/")
    }

}