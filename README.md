Spring Boot Quickstart Maven Archetype
=========================================

[![Build Status](https://travis-ci.org/suzel/spring-boot-quickstart-archetype.svg?branch=master)](https://travis-ci.org/suzel/spring-boot-quickstart-archetype)

Summary
-------
The project is a Maven archetype for Spring Boot application.

Installation
------------

To install the archetype in your local repository execute following commands:

```bash
    git clone https://github.com/suzel/spring-boot-quickstart-archetype.git
    cd spring-boot-quickstart-archetype
    mvn clean install
```

Create a project
----------------

```bash
    mvn archetype:generate \
        -DarchetypeGroupId=com.github.spring-boot-archetypes \
        -DarchetypeArtifactId=spring-boot-quickstart \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=my.groupid \
        -DartifactId=my-artifactId \
        -Dversion=version
```

Run the project
----------------

```bash
	mvn test spring-boot:run
```

Test on the browser
-------------------

	http://localhost:8080/

Note: No additional services are required in order to start the application.
