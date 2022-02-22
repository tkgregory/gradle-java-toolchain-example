This project shows how you can use different JDK versions within the same Gradle project.

Running the application or the tests prints out the Java version it's running on e.g. `Java version = 16`

### Run application on JDK 14

`./gradlew run`

### Run application on JDK 16

`./gradlew runOn16`

### Run tests on JDK 15

`./gradlew clean test`

### Also note that

* any missing JDK version that Gradle can't find locally will be automatically downloaded
* the application is compiled using the default JDK 14

## Need Gradle support?
Contact me if you need help with Gradle at [tom@tomgregory.com](mailto:tom@tomgregory.com).
