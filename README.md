# spring-boot-swagger-sample

This is a sample project of Swagger and Swagger-ui from Youtube, it is used to document APIs.

http://localhost:8080/api/ HTTP POST to add content to API,

Postman header is: `Content-Type: application/json`

Postmen Body - raw:

                    ``` json
                    {
                    "id":"test1",
                    "name":"Shang",
                    "phone":"123-234-2345"
                    }
                    ```

http://localhost:8080/api/ HTTP GET to retrieve data.

http://localhost:8080/v2/api-docs/ to **view** the API doc created by swagger.

The 
[Spring boot Tutorial](https://www.youtube.com/watch?v=gduKpLW_vdY&ab_channel=JavaBrains) is here,

To **access** the swagger ui,
make sure the pom.xml has 

```xml
<dependency>
<groupId>io.springfox</groupId>
<artifactId>springfox-boot-starter</artifactId>
<version>3.0.0</version>
</dependency>
```

go to the Url : http://localhost:8080/swagger-ui/
instead of .html