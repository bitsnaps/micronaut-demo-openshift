FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/hello-maven*.jar hello-maven.jar
CMD java ${JAVA_OPTS} -jar hello-maven.jar