# Maven
Maven concepts and tutorials

# Java Packaging
*.jar - Java ARchive - Zip file containing one or more Java class files. <br />
*.war - Web Application aRchive - Zip file containing web application. Includes one or more jar files, Java class files, and web resources. <br />
*.ear - Enterprise aRchive - Zip file containing one or more WAR files. <br />
Fat JAR (akka Uber JAR) - Executable JAR containing all dependencies. (Used by Spring Boot) <br />
Docker Container - Docker Image containing runtime environment, JVM, and Java Package <br />

# Java Deployment
Simple JAR files are typically collection of class files used to compose applications. Typically not a complete application <br />
WAR, EAR files are typically complete applications which are deployed to application servers i.e. Tomcat / Weboss / Websphere <br />
Fat / Uber Jars are typically complete applications which contain embedded application servers. It can be deployed stand alone. <br />
Docker Images are complete applications which can be deployed stand alone. <br />

# Java commands 
1 - javac HelloWorld.java <br />
2 - jar cf myjar.jar HelloWorld.class <br />
3 - java -classpath myjar.jar HelloWorld <br />

# Maven POM
POM - Project Object Model <br />
The pom.xml is a XML document which describes a Maven Project. It must comply with maven-4.0.0.xsd i.e. XML schema defining the rules for the XML Document. POM can inherit properties from a parent pom, sub module also inherit. Effective POM is the POM complete with inherited properties. A quick command is - mvn help:effective-pom <br />

# Maven Coordinates
Maven coordinates are used to identify artifacts. <br />
Together they identify a location in a Maven Repository. <br />
groupId - Typically unique to an organization. Often the organization's reverse domain is used. But not always. <br />
artifactId - typically the project name. A descriptor for the artifact. <br />
version - refers to a specific version of the project. <br />
groupId and version can be inherited from a parent pom.

# Maven Repositories
Maven Repositories are a location where project artifacts are stored. <br />
Types <br />
Local - Repository on local file system - user_home/.m2/ <br />
Central - Public Repository hosted by maven community <br />
Remote - Other locations which can be public or private e.g Oracle, Google Andrioid, <br />
Private - hosted by companies for internal artifact

# Maven Dependencies
Dependency - A dependency is an artifact which your Maven project depends upon. Typically a jar or pom. <br />
Transitive Dependency - A dependency of an artifact which your project depends on. Can go many many layers deep. Cyclic dependencies are not supported. <br />
Dependency Management - allows project authors to specify the versions of artifacts to be used.

# Main Phases
clean - delete target directory <br />
validate - validate, if the project is correct <br />
compile - compile source code, classes stored in target/classes <br />
test - run tests <br />
package - take the compiled code and package it in its distributable format e.g. JAR, WAR <br />
verify - run any checks to verify the package is valid and meets quality criteria <br />
install - install the package into the local repository <br />
deploy - copies the final package to the remote repository

# Useful Command line options
-DskipTests=true compiles the tests, but skips running them <br />
-Dmaven.test.skip=true skips compiling the tests and doesn't run them <br />
-T - number of threads: <br />
    -T 4 is a decent default <br />
    -T 2C - 2 threads per CPU <br />
-rf, --resume-from resume build from the specified project <br />
-pl, --projects makes Maven build only specified modules and not the whole project <br />
-am, --also-make makes Maven figure out what modules out target depends on and build them too <br />
-o, --offline work offline <br />
-X, --debug enable debug output <br />
-P, --activate-profiles comma-delimited list of profiles to activate <br />
-U, --update-snapshots forces a check for updated dependencies on remote repositories <br />
-ff, --fail-fast stop at first failure 