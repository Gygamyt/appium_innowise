plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("io.appium:java-client:8.6.0")

    implementation("org.seleniumhq.selenium:selenium-java:2.41.0")
}

tasks.test {
    useJUnitPlatform()
}