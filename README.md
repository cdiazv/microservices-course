# microservices-course
This repository contain my practice and example about the course Microservices

## tips
    - For some reason, the repo maven central don't have the version 1.0.5.RELEASE of the artifact spring-cloud-netflix. Some solutions is adding the library to the local repo using mvn install:install-file -Dfile=/path/to/spring-cloud-netflix-core-1.0.6.RELEASE.jar -DgroupId=org.springframework.cloud -DartifactId=spring-cloud-netflix -Dversion=1.0.5.RELEASE -Dpackaging=jar

