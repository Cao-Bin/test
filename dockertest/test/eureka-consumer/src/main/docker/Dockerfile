FROM java:8
VOLUME /tmp
ADD dockerize /usr/local/bin/


ADD eureka-consumer-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005","-jar","/app.jar"]
#ENTRYPOINT ["/bin/bash"]

