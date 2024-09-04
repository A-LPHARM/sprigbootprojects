### README.md

# Spring Boot Microservices Project

## Overview
This project is a microservices-based application built using the Spring Boot framework. The application leverages several key technologies to provide a scalable and reliable system:

- **MySQL** for data persistence
- **Cassandra** for distributed NoSQL data storage
- **RabbitMQ** for message streaming between services
- **Redis** for caching and session management

The project is containerized using Docker and deployed to a Kubernetes cluster for orchestration.

## Prerequisites
- **Java 11** or higher
- **Gradle** 
- **Docker**
- **Kubernetes** cluster (Minikube, EKS, GKE, etc.)
- **kubectl** configured for your Kubernetes cluster

## Project Structure
- **src/main/java**: Contains the main Java code for the Spring Boot application.
- **src/main/resources**: Contains the application properties and configuration files.
- **Dockerfile**: Instructions for building the Docker image.
- **kubernetes/**: Contains Kubernetes manifests for deploying the services.

## Building the Project
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/A-LPHARM/sprigbootprojects.git
   cd chat-messaging-app
   ```

2. **Build the Project:**
   Use the Gradle wrapper to build the project:
   ```bash
   ./gradlew build
   ```

3. **Build the Docker Image:**
   After successfully building the project, create a Docker image:
   ```bash
   docker build -t henriksin1/chatapp:latest .
   ```

4. **Push the Docker Image:**
   Push the image to your Docker registry:
   ```bash
   docker push henriskin1/chatapp:latest
   ```

## Deploying to Kubernetes
1. **Create Kubernetes Secrets:**
   Create secrets for MySQL, Cassandra, RabbitMQ, and Redis.

2. **Apply Kubernetes Manifests:**
   Deploy the application and its dependencies to your Kubernetes cluster:
   ```bash
   kubectl apply -f manifests/
   ```

3. **Verify Deployment:**
   Ensure all pods are running and services are available:
   ```bash
   kubectl get pods -n messaging-app
   kubectl get svc -n messaging-app
   ```

4. **Access the Application:**
   Use the Kubernetes service endpoint to access the application.

## Configuration
The application can be configured using environment variables or by editing the `application.properties` file in the `src/main/resources/` directory.

## Monitoring and Logging
- Ensure to monitor your services using Kubernetes dashboard or other monitoring tools like Prometheus and Grafana.
- Logs can be viewed using `kubectl logs` command.

## Contributing
Contributions are welcome! Please fork this repository and submit a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
Special thanks to the open-source community and all contributors to the Spring Boot ecosystem.



