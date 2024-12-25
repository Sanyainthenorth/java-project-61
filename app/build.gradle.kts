plugins {
    id("java")
    id("application")
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
application {
    mainClass.set("hexlet.code.App")
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
tasks.test {
    useJUnitPlatform()
}
checkstyle {
    toolVersion = "10.12.4"
    configFile = file("config/checkstyle/checkstyle.xml")
}

