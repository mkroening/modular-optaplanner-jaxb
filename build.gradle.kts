plugins {
    java
    application
}

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
    mainClassName = "io.github.mwkroening.modularoptaplannerjaxb.App"
}
