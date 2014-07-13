Gradle wrapper is an important tool for synchronizing which version of
gradle is used across a team. As your project matures, it is important
to keep the version of gradle used by the team consistent. The wrapper
also gives us control over when we upgrade gradle. The wrapper should
also be used as the entry point for build systems.

The following will initialize the gradle wrapper on an existing project:

```sh
$ gradle wrapper
$ git add gradlew gradlew.bat gradle/wrapper/gradle-wrapper.jar gradle/wrapper/gradle-wrapper.properties
```
