# springboot-graphql-neo4j
Run neo4j container: 
``` sudo docker run --publish=7474:7474 --publish=7687:7687 neo4j:3.0 ```
Defalut port of neo4j server is ``` 7474```

Maven Dependencies:
 
 ```xml
 <dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-neo4j</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency> <!-- If you're using the HTTP driver -->
			<groupId>org.neo4j</groupId>
			<artifactId>neo4j-ogm-http-driver</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
 </dependencies>
 ```
 
 application.properties file:
  ```xml
spring.data.neo4j.uri=http://localhost:7474
spring.data.neo4j.username=neo4j
spring.data.neo4j.password=pass
  ```
 
 
