# TPG Coding Exercise Java

1. IP validation using regex.
2. Sorting Student objects.
3. Utility class to measure execution time.

## Installation

### Prerequisites:

1. Oracle JDK 1.8
2. Apache Ant 1.9 
3. JUnit 4
4. Hamcrest Core 1.3

Note: Ensure that the Apache Ant is installed properly. Please refer to [Installing Apache Ant](https://ant.apache.org/manual-1.9.x/index.html)

### Steps:

1. Extract the tpg-coding-exercise-java-1.0.zip.
2. Go to `.\tpg-coding-exercise-java-1.0\`.
3. Download the following JARs and put them into `.\tpg-coding-exercise-java-1.0\ext_lib` folder.
  - junit.jar (Download from [JUnit4](http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar))
	- hamcrest-core.jar (Download from [Hamcrest](http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar))
4. Verify the name of the jars in the `.\tpg-coding-exercise-java-1.0\build.properties` are correct. If you would be using a slightly different version of jars, please update the properties accordingly.
	- junit.jar=${basedir}/ext_lib/**junit-4.12.jar**
	- hamcrest.jar=${basedir}/ext_lib/**hamcrest-core-1.3.jar**
5. Build the application by executing the below "`ant`" command.
	- ant build

## Tests

There are two ways test the application.

1. Run JUnit Test
   1. Please ensure that you have already completed the **Installation** steps.
	- Go to `.\tpg-coding-exercise-java-1.0\`.
	- Execute a JUnit Test using ant: `ant clean build <TargetTestName> junitreport` (e.g. `ant clean, build-project, IPValidationRegexTest, StudentComparatorTest, junitreport`)
	- Go to `.\tpg-coding-exercise-java-1.0\junit` and open index.html to view the JUnit report.
2. Run corresponding class for each question that conatins the main() method
	- Please ensure that you have already completed the **Installation** steps.
	- Go to `.\tpg-coding-exercise-java-1.0\bin`.
	- Execute: `java com.tpg.question<number>.<class>`  (e.g. `java com.tpg.question1.IPValidationRegex`, `com.tpg.question2.Main`, `com.tpg.question2.ElapsedTime`

## Contributors

- Rey Pagatpatan (<rpagat3@gmail.com>)
