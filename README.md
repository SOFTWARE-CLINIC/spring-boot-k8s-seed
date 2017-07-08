# spring-boot-k8s-seed

> A seed project for a simple Spring Boot app running on Kubernetes.

[![Build Status](https://travis-ci.org/SOFTWARE-CLINIC/spring-boot-k8s-seed.svg?branch=master)](https://travis-ci.org/SOFTWARE-CLINIC/spring-boot-k8s-seed)

## Running as a Java application

```
$ mvn package && java -jar target/spring-boot-k8s-seed-0.0.1-SNAPSHOT.jar
```

## Running as a Docker container

```
$ mvn package docker:build
```

```
$ docker run -p 8080:8080 -t danielpacak/spring-boot-k8s-seed
```

## Running on Kubernetes

Start Minikube cluster.

```
$ minikube start
```

Use Minikube Docker daemon and build the Docker image.

```
$ eval $(minikube docker-env)
$ mvn clean package docker:build
```

Create the `spring-boot-k8s-seed` deployment.

```
$ kubectl run spring-boot-k8s-seed --image=danielpacak/spring-boot-k8s-seed:0.0.1-SNAPSHOT --port=8080
```

Expose the `spring-bookt-k8s-seed` deployment as the `spring-boot-k8s-seed` service.

```
$ kubectl expose deployment spring-boot-k8s-seed --type=LoadBalancer
```

```
$ minikube service spring-book-k8s-seed
```

## Reference

1. https://spring.io/guides/gs/spring-boot-docker/
