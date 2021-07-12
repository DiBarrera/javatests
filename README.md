# Java testing

## Java testing is about checking the correct functionality of the code, to result in a bus-free code and have an efficient development.



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#Overviwe">Overviwe</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#Topics-reviewed">Topics reviewed</a></li>
    <li><a href="#Basics">Basics</a></li>
    <li><a href="#Acquired-skills">Acquired skills</a></li>
  </ol>
</details>



<!-- Overviwe -->
## Overviwe

In this repository you will find a brief summary of what was learned in the [platzi](https://platzi.com/cursos/testing-java/) course of Java testing.

---------

Testing in java serves to check the functionality of the code that is generated during the development of a project, it helps to make it bus-free, clean and readable, during this course the basics to generate testing code and how to apply it in an application under development were taught.

---------

This repository is divided into the following parts.
* The steps to clone the repository and be able to view it.
* The main topics seen in the course
* Some of the basics concepts taught.
* Skills acquired at the end of the course.



<!-- GETTING STARTED -->
## Getting Started

### For this repository, IntelliJ Idea was used as IDE

### For this repository, Maven was used as the build automation tool

### For this repository, JUnit was used as the testing framework 

### The framework used for testing in this repository is: [Mockito](https://site.mockito.org/).

## Setup

- Fork this repo
- Clone this repo

```shell
$ mkdir java-testing
$ cd java-testing
$ git clone https://github.com/DiBarrera/javatests.git
```

You will find the following files:

- **The src directory**, containing the main files used for the course.
- **The test directory** contains the files generated to test the classes created in src.

- Inside our POM file, we insert the next lines:

- To tell Maven that we will use Java 8 we must add the following lines of code:

```shell
<properties>
    <maven.compiler.source>1.8maven.compiler.source>
    <maven.compiler.target>1.8maven.compiler.target>
properties>
```

- Just below the properties, we create the following labels where we will place the dependencies to use.

```shell
<dependencies>
    // All the necessary dependencies go here.
</dependencies>
```

- To implement the Junit library, using Maven, insert the following lines into the dependencies:

```shell
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
``` 

- The following additions will go inside the dependencies tags.

- To add Mockito in the project we insert the following lines:

```shell
<dependency>
  <groupId>org.mockitogroupId>
  <artifactId>mockito-coreartifactId>
  <version>2.23.4version>
  <scope>testscope>
<dependency>
```

- To perform a database integration test we will use Spring and H2, insert the following lines into the dependencies:

```shell
<dependency>
  <groupId>org.springframeworkgroupId>
  <artifactId>spring-jdbcartifactId>
  <version>5.1.3.RELEASEversion>
dependency>
<dependency>
  <groupId>org.h2databasegroupId>
  <artifactId>h2artifactId>
  <version>1.4.197 version>
<dependency>
``` 



<!-- Topics reviewed -->
## Topics reviewed

The topics seen in this course, provided the knowledge to be able to create tests and verify the correct operation of a java application, these are the main topics learned.

### Topics

- What is a Test.
- TDD (Test Driven Development).
- Different types of tests.
- Unitary. 
- Integration. 
- Functional. 
- End to End.
- Stress.
- Unit test.
- Test organization with JUnit.
- Organization of an application.
- Integration test.



<!-- Basics -->
## Basics

#### Inform JUnit that we expect an exception
Pure functions generate the same result for the same parameter.
```markdown
@Test(expected = IllegalArgumentException.class)
``` 
---------

## Here are some steps that were followed in the course, to achieve the CRUD actions with the database.
These steps are written so that the reader can get an idea of how the application was created to achieve the main objectives of the course. Although the repository contains the completed application in its entirety.

### A basic test, using "throw new".
Using "throw to" we can receive indication of which line the error occurred.
- For this example, we need two classes, in our package we create a class name StringUtil.java, will have the next lines:
- #### StringUtil.java
```shell
package com.platzi.javatests.util;
public class StringUtil {
    public static String repeat(String str, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
``` 
- We insert a for loop with the purpose of reapting a simple text, that would be subject of our test.
- Now we create a class in the test package with the name of StringUtilTest.java
- #### StringUtilTest.java
```shell
package com.platzi.javatests.util;
public class StringUtilTest {
    public static void main(String[] args) {
        assertEquals(StringUtil.repeat("hola", 3), "holaholahola ");
        assertEquals(StringUtil.repeat("hola", 1), "hola");
    }
    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }
}
``` 
- As you can see, in the previous code, inside public static void main, we have an assertEquals, that would repeat a text a number of times, and is expecting the repeated text as a second parameter.
- Pay atention to the blank space after the repeated text.
- #### StringUtilTest.java
```shell
package com.platzi.javatests.util;
public class StringUtilTest {
    public static void main(String[] args) {
                                                                // but there´s a space here
                                                                |
        assertEquals(StringUtil.repeat("hola", 3), "holaholahola ");
        assertEquals(StringUtil.repeat("hola", 1), "hola");
    }
}
``` 
- When running the program, with the use of "throw new" we can receive an indication of which line the error is occurring on.
<img src="/docs/java-testing-output1.png" alt="Throw new error"/>

#### This is a small example of a unit test.

---------

### Testing leap year. TDD (Test Driven Development).
For this test, we´re going to need two classes, the class named DateUtil, and its test class.
- Inside our class DateUtil, insert the following lines of code:
- #### DateUtil.java
```shell
package com.platzi.javatests.util;
public class DateUtil {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
``` 
- For the test class, insert the next lines.
- #### DateUtilLeapYearShould.java
```shell
package com.platzi.javatests.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilLeapYearShould {

     /*
      -All years divisible by 400 ARE leap years (1600, 2000, 2400),
      -All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
      -All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
      -All years not divisible by 4 are NOT leap years (2017, 2018, 2019).
     */

    @Test
    public void return_true_when_year_is_divisible_by_400() {
        assertThat( DateUtil.isLeapYear(1600), is(true) );
        assertThat( DateUtil.isLeapYear(2000), is(true) );
        assertThat( DateUtil.isLeapYear(2400), is(true) );
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        assertThat( DateUtil.isLeapYear(1700), is(false) );
        assertThat( DateUtil.isLeapYear(1800), is(false) );
        assertThat( DateUtil.isLeapYear(1900), is(false) );
    }

    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100() {
        assertThat( DateUtil.isLeapYear(1996), is(true) );
        assertThat( DateUtil.isLeapYear(2004), is(true) );
        assertThat( DateUtil.isLeapYear(2008), is(true) );
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4() {
        assertThat( DateUtil.isLeapYear(2017), is(false) );
        assertThat( DateUtil.isLeapYear(2018), is(false) );
        assertThat( DateUtil.isLeapYear(2019), is(false) );
    }
}
``` 
- Within these lines, we are covering all the checks for the test to be successful.
- Once we run the program, we receive the response that all the tests have been successful.
<img src="/docs/java-testing-output2.png" alt="output 2"/>

---------

### Movie app, Business test.
For this test, we´re going to need serveral packages.
- A data package which contain the interface that will store the movies in the database. Its class is called MovieRepository
- A model package that will contain the classes that contain the application logic. Its classes are called Genre, and Movie
- And a service package containing the business classes. Its class is called MovieService.
- In the test package we will have the class called MovieServiceShould 
- We should have the following class organization:
```shell
├───main
│   └───java
│       └───com
│           └───platzi
│               └───javatests
│                   └───movies
│                       ├───data
│                       │       MovieRepository.java
│                       │
│                       ├───model
│                       │       Genre.java
│                       │       Movie.java
│                       │
│                       └───service
│                               MovieService.java
│    
└───test
    └───java
        └───com
            └───platzi
                └───javatests
                    └───movies
                        └───service
                              MovieServiceShould.java
``` 
- To test the application, we will have the following lines of code necessary below.
- #### MovieRepository.java
```shell
public interface MovieRepository {
    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
``` 
- #### Movie.java
```shell
public class Movie 
    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;

    public Movie(String name, int minutes, Genre genre) {
        this(null, name, minutes, genre);
    }
    public Movie(Integer id, String name, int minutes, Genre genre) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMinutes() {
        return minutes;
    }
    public Genre getGenre() {
        return genre;
    }
}
``` 
- #### Genre.java
```shell
public enum Genre {
    ACTION, COMEDY, DRAMA, HORROR, THRILLER
}
``` 
- #### MovieService.java
```shell
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {

        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLength(int length) {

        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());
    }
}
``` 
- And in the test class
- #### MovieServiceShould.java
```shell
public class MovieServiceShould {

    private MovieService movieService;

    @Before
    public void setUp() throws Exception {

        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)
                )
        );

        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(3, 6)) );
    }

    @Test
    public void return_movies_by_length() {

        Collection<Movie> movies = movieService.findMoviesByLength(119);
        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(2, 3, 4, 5, 6)) );
    }

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }
}
``` 
- With this, we can ensure that when running the program, we receive the successful tests.
<img src="/docs/java-testing-output3.png" alt="output 3"/>

---------



 <!-- Acquired skills -->
## Acquired skills

- Mastering the different types of tests.
- Apply the Test-Driven Development technique.
- Check the behavior of a program.
- Convert requirements into tests.
- Create unit test.
- TDD (Test Driven Development).
- Throw an exception to alert about an error.
- Mockito.
- Test analysis.
- Perform integration test.



---------
