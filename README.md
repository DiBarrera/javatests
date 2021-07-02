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

- To tell Maven that we will use Java 8 we must add the following lines of code:

```shell
<properties>
    <maven.compiler.source>1.8maven.compiler.source>
    <maven.compiler.target>1.8maven.compiler.target>
properties>
```

- To add Mockito in the project we insert the following lines:

```shell
<dependency>
  <groupId>org.mockitogroupId>
  <artifactId>mockito-coreartifactId>
  <version>2.23.4version>
  <scope>testscope>
dependency>
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
dependency>
```



<!-- Topics reviewed -->
## Topics reviewed

In this repository you will find sql files that were varied exercises to practice searching for data in databases in different ways. The topics are made up of the different ways to do these searches. Topics such as a brief history of databases, the different types of databases, services, and other fundamental topics for a better general understanding about databases were also included.

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
