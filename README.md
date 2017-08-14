# DropwizardRESTnew

How to start the DropwizardRESTnew application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/dropwizardrestnew-0.0.1-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:9000/employees`

config.yml

```
logging:
  level: INFO
  loggers:
    com.juniorm: DEBUG

server:
  applicationConnectors:
  - type: http 
    port: 9000
  adminConnectors:
  - type: http
    port: 9001
```
Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
