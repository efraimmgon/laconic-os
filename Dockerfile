FROM openjdk:8-alpine

COPY target/uberjar/laconic-os.jar /laconic-os/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/laconic-os/app.jar"]
