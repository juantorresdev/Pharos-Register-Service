# Pharos-Register-Service

The Pharos Register Service allows the register of new applicants to the Pharos Project and the confirmation of the new accounts generated.

 ## Configuration

* Create a Maven configuration and add the the run command:
```spring-boot:run ```
* Add the environment variable: ``` spring.profiles.active=dev```
* Pull the Docker image ```docker run --name some-mysql -p5555:3306 -e MYSQL_ROOT_PASSWORD=Q1.w2-e3.r4 -d mysql:latest```
* Run the docker image ```docker exec -it mysql bash -l```
* Execute MySQL with the credentials ```mysql --user=root --password="Q1.w2-e3.r4"```

## Endpoints

Path | GET | POST | PUT | DELETE 
--- |-----| --- | --- | --- 
/health | X  |  |  |  
/register |     | X |  | 