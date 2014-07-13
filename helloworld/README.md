Gradle is build by convention. In the build.gradle, all we added was apply plugin: 'java' and put our source code in src/main/java. The build command is the recommended entry point and runs the full lifecycle of the project.

```sh
$ gradle build
:compileJava
:processResources UP-TO-DATE
:classes
:jar
:assemble
:compileTestJava UP-TO-DATE
:processTestResources UP-TO-DATE
:testClasses UP-TO-DATE
:test UP-TO-DATE
:check UP-TO-DATE
:build
```
