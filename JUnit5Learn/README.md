# JUnit

## what I cover while learning JUnit5

* adding JUnit test dependencies at maven
```xml
<dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.9.0</version>
      <scope>test</scope>
</dependency>
```
* understand JUnit5 and it's history
* use `assertEquals`
* use `assertArrayEquals`
* use `assertIterableEquals`
* use `assertThrows`
* use `assertIterableEquals`
* use annotations `@BeforeAll`, `@AfterAll`, `@BeforeEach`, `@AfterEach`
* using `@Disabled` annotation
* `@EnabledOnOs(OS.LINUX)` used to enable on specific operating system
* use `@EnabledOnJre(JRE.JAVA_8)` annotation 
* `@EnabledIfEnvironmentVariable()`
* using `assertAll`
* use `@RepeatedTest(3)` the number is the number of reputation
* to tag tests `@Tag("exception Throwing test")`




