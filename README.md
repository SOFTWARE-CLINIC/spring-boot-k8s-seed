# spring-boot-k8s-seed

> A seed project for a simple Spring Boot app running on Kubernetes.

```
mvn package && java -jar target/spring-boot-k8s-seed-0.0.1-SNAPSHOT.jar
```

```
mvn package docker:build -DpushImage
```

```
docker run -p 8080:8080 -t danielpacak/spring-boot-k8s-seed
```

## Reference

1. https://spring.io/guides/gs/spring-boot-docker/
