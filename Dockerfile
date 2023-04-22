FROM openjdk:17-alpine
EXPOSE 8083
COPY target/Restaurant*.jar /restaurant-site.jar
CMD ["java", "-jar", "/restaurant-site.jar"]