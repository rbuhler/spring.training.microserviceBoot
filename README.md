# Microservice SpringBoot

# UTILS
* Kill frozen TomCat
````
$ netstat -ano | find "8080"
    TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       13836
    
$ taskkill /F /PID 13836
    SUCCESS: The process with PID 13836 has been terminated.
````

# References

* [Spring Framework Reference](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/)
* [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
