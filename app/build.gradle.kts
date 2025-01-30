plugins {
    jacoco
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

tasks.jacocoTestReport {
    dependsOn(tasks.test)  // Убедитесь, что отчет генерируется после выполнения тестов
    reports {
        xml.required.set(true)  // Генерация отчета в формате XML
        html.required.set(true)  // (Опционально) Генерация HTML отчета
    }
}

checkstyle {
    toolVersion = "10.12.4"
    configFile = file("config/checkstyle/checkstyle.xml")
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "hexlet.code.App"
        )
    }
}
