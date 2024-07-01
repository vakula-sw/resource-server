
**README.md:**
```markdown
# Resource Server

The Resource Server hosts protected resources that require a valid token for access.

## Prerequisites

- JDK 21
- Gradle
- Spring Boot 3.1.5

## Configuration

**Port:** 8082

## Endpoints

- `/api/resource`: Protected endpoint

## Running the Service

1. Navigate to the project directory:
    ```bash
    cd resource-server
    ```

2. Build and run the project:
    ```bash
    ./gradlew bootRun
    ```

## Testing the Setup

### Access the Protected Resource

To access the protected resource on the Resource Server, use the following command:

```bash
curl -X GET http://localhost:8082/api/resource \
     -H "Authorization: Bearer YOUR_ACCESS_TOKEN"
