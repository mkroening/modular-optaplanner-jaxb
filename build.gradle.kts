plugins {
    java
    application
    id("org.javamodularity.moduleplugin") version "1.4.1"
}

configurations {
    "implementation" {
        // Outdated dependencies, split package between jaxb.impl and jaxb.core
        exclude(group = "com.sun.xml.bind", module = "jaxb-core")
        exclude(group = "com.sun.xml.bind", module = "jaxb-impl")

        // Outdated dependency, split package between activation and jakarta.activation
        exclude(group = "javax.activation", module = "activation")
    }
}

patchModules.config = listOf(
        "xmlpull=xpp3_min-1.1.4c.jar"
)

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.glassfish.jaxb:jaxb-bom:2.3.2"))
    implementation("jakarta.xml.bind:jakarta.xml.bind-api")
    runtimeOnly("org.glassfish.jaxb:jaxb-runtime")
    
    implementation("org.optaplanner:optaplanner-persistence-jaxb:7.18.0.Final")
}

application {
    mainClassName = "$moduleName/io.github.mwkroening.modularoptaplannerjaxb.App"
}
