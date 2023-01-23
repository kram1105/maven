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