# Stage 1: Build the application using Maven with JDK 11
FROM maven:3.8.5-jdk-11 as build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file to download dependencies
COPY pom.xml .

# Copy the source code to the container
COPY src ./src

# Run the Maven build inside the container to create the final JAR file
RUN mvn clean package

# Stage 2: Create the runtime image with OpenJDK 11
FROM openjdk:11-jre-slim

# Set the working directory inside the runtime container
WORKDIR /app

# Copy the built JAR file from the build stage to the runtime container
COPY --from=build /app/target/CEN4802CMidterm-1.0-SNAPSHOT.jar /app/CEN4802CMidterm.jar

# Define the command to run the application
CMD ["java", "-jar", "/app/CEN4802CMidterm.jar"]
