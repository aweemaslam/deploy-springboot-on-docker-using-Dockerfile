# Getting Started

* Install openJDK 19
* To access host db in docker container go to `C:\Program Files\PostgreSQL\14\data\pg_hba.conf` and append `# TYPE DATABASE USER CIDR-ADDRESS  METHOD
  local all all md5
  host  all  all 0.0.0.0/0 md5`
* Restart database service
* Install Docker
* Run `mvn clean install` in the terminal
* Run `docker build -t dockerexample .`
* Run `docker run -p 8080:8080 dockerexample:latest`
* Hello World api can be accessed using http://localhost:8080/public/hello
