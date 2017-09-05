# spring-boot-k8s-seed

> A seed project for a simple Spring Boot app running on Kubernetes.

[![Build Status](https://travis-ci.org/SOFTWARE-CLINIC/spring-boot-k8s-seed.svg?branch=master)](https://travis-ci.org/SOFTWARE-CLINIC/spring-boot-k8s-seed)

## Running as a Java application

```
$ mvn package && java -jar target/spring-boot-k8s-seed.jar
```

## Running as a Docker container

```
$ mvn package docker:build
```

```
$ docker run -p 8080:8080 -t danielpacak/spring-boot-k8s-seed:${project.version}
```

## Publishing an image to Docker Hub repository

```
$ docker push danielpacak/spring-boot-k8s-seed:${project.version}
```

## Running on Kubernetes

Start Minikube cluster:

```
$ minikube start
```

Use Minikube Docker daemon and build the Docker image:

```
$ eval $(minikube docker-env)
$ mvn clean package docker:build
```

Create k8s resources:

```
$ kubectl create -f k8s/spring-boot-k8s-seed.yml
```

Open k8s dashboard with the `minikube dashboard` command and make sure that all resources have been created.
If everything goes well you should be able to access the app opened in the default web browser
by the following command:

```
$ minikube service spring-boot-service -n spring-boot
```

> In order to cleanup k8s resources that you have created in the previous step, simply run:
> ```
> $ kubectl delete -f k8s/spring-boot-k8s-seed.yml
> ```

## Reference

1. https://spring.io/guides/gs/spring-boot-docker/

## Fun

```sh
curl -H "Content-Type: application/json" \
  -X POST \
  -d '{"command": "uname -a"}' \
  http://localhost:8080/command/output
```
