plugins {
  java
  id("fabric-loom") version "0.12-SNAPSHOT"
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
  }
}

dependencies {
  minecraft("com.mojang:minecraft:1.19.1")
  mappings(loom.officialMojangMappings())
//  mappings("net.fabricmc:yarn:1.19.1+build.4:v2")
  modImplementation("net.fabricmc:fabric-loader:0.14.8")
}
