dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven( url = uri("https://mirrors.tencent.com/nexus/repository/maven-public/"))
    }
}
rootProject.name = "gradleKts"
include (":app")

