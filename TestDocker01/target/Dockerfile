# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Add the project jar file to the container
COPY target/TestDocker01-3.3.4.jar /usr/app

# Set the working directory inside the container
WORKDIR /usr/app

# Expose the port the application will run on
#EXPOSE 8080

# Command to run the JAR file 
ENTRYPOINT ["java", "-jar", "TestDocker01-3.3.4.jar"]
