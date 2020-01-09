# Seleniums_Fundamentals

cucumber reporting
pom file

<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>pack</groupId>
<artifactId>Git_Jenkins_Github</artifactId>
<version>0.0.1-SNAPSHOT</version>

<dependencies>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-junit</artifactId>
<version>4.8.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-java</artifactId>
<version>4.8.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-core -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-core</artifactId>
<version>4.8.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java8 -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-java8</artifactId>
<version>4.8.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/net.masterthought/cucumber-reporting -->
<dependency>
<groupId>net.masterthought</groupId>
<artifactId>cucumber-reporting</artifactId>
<version>4.11.2</version>
</dependency>

</dependencies>

<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-compiler-plugin</artifactId>
<version>3.8.1</version>
<configuration>
<source>1.8</source>
<target>1.8</target>
</configuration>
</plugin>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>3.0.0-M4</version>
<configuration>
<testFailureIgnore>true</testFailureIgnore>
<includes>
<include>**/runners/*Runner*.java</include>
</includes>
</configuration>
</plugin>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-failsafe-plugin</artifactId>
<version>3.0.0-M4</version>
<executions>
<execution>
<goals>
<goal>integration-test</goal>
<goal>verify</goal>
</goals>
</execution>
</executions>
</plugin>
<plugin>
<groupId>net.masterthought</groupId>
<artifactId>maven-cucumber-reporting</artifactId>
<version>4.4.0</version>
<executions>
<execution>
<id>execution</id>
<phase>verify</phase>
<goals>
<goal>generate</goal>
</goals>
<configuration>
<projectName>cucumber-jvm-example</projectName>
<!-- optional, per documentation set this to "true" to bypass generation
of Cucumber Reports entirely, defaults to false if not specified -->
<skip>false</skip>
<!-- output directory for the generated report -->
<outputDirectory>${project.build.directory}/cucumber-JVM-reports</outputDirectory>
<!-- optional, defaults to outputDirectory if not specified -->
<inputDirectory>${project.build.directory}/json</inputDirectory>
<jsonFiles>
<!-- supports wildcard or name pattern -->
<param>**/*.json</param>
</jsonFiles>

<parallelTesting>false</parallelTesting>
<!-- optional, set true to group features by its Ids -->
<mergeFeaturesById>false</mergeFeaturesById>
<!-- optional, set true to get a final report with latest results
of the same test from different test runs -->
<mergeFeaturesWithRetest>false</mergeFeaturesWithRetest>
<!-- optional, set true to fail build on test failures -->
<checkBuildResult>false</checkBuildResult>
</configuration>
</execution>
</executions>
</plugin>
</plugins>
</build>

</project>
