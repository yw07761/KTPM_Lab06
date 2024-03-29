# KTPM_Lab06
spring-cloud-service-discovery-with-eureka

1. Thêm Dependency Eureka Client cho các Dịch vụ:
Trong tệp pom.xml của cả CustomerService và OrderService, thêm dependency cho Eureka Client.
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
            <version>2.2.9.RELEASE</version>
        </dependency>

![image](https://github.com/yw07761/KTPM_Lab06/assets/89188722/e6c9502c-e9d1-49bc-b224-a1d9c1997c97)
