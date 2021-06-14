plugins {
    kotlin("jvm")
    application
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

val ktor_version: String by project
val logback_version: String by project

dependencies {
    implementation( "io.ktor:ktor-server-core:$ktor_version")
    implementation( "io.ktor:ktor-server-netty:$ktor_version")
    implementation( "ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-gson:$ktor_version")
    implementation("org.litote.kmongo:kmongo-coroutine-serialization:4.2.7")
    //testImplementation( "io.ktor:ktor-server-tests:$ktor_version")
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}