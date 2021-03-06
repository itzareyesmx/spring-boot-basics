import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "2.4.3"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  id("org.jetbrains.kotlin.plugin.jpa") version "1.3.71"
  kotlin("jvm") version "1.4.30"
  kotlin("plugin.spring") version "1.4.30"
	id("io.gitlab.arturbosch.detekt") version "1.0.1"
}

group = "com.course"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	jcenter()
}

val springBootVersion = "2.2.6.RELEASE"
val kotlinVersion = "1.3.72"
val detektVersion = "1.0.0-RC16"


dependencies {
	//Kotlin
	implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")

	//Web
	implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")

	// Data
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
	implementation("org.springframework.data:spring-data-jpa:$springBootVersion")
	implementation("org.postgresql:postgresql:42.2.12.jre7")
	implementation("org.flywaydb:flyway-core:6.0.8")

	testImplementation("org.springframework.boot:spring-boot-starter-test")

	// Detekt
	detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:$detektVersion")

	//Auth
	implementation("org.springframework.boot:spring-boot-starter-security:$springBootVersion")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

detekt {
	toolVersion = detektVersion
	config = files("./detekt-config.yml")
	autoCorrect = true
}