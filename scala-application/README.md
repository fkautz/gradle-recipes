The application plugin is capable of both running a scala (or java)
application in gradle and creating a tar or zip distribution. The
packaged distributions include your jar, all runtime dependencies, and a
script for executing the application.

To use, add the 'application' plugin and set the mainClassName to your project's
main class.

```sh
$ ./gradlew run
$ ./gradlew distTar
$ ./gradlew distZip
```

