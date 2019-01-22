# homework test framework

QA automation repository

## Links
 * [Github project](https://github.com/dr29bart/homeworktest)

## Execution HOWTO
* To execute functional tests use following command:
 `mvn clean test`
 * It is possible to override config parameters:
 `mvn clean test -DbaseUrl=https://custom-server.herokuapp.com`

## Test Reports
* To generate test report locally use following command:
`mvn alure:serve` <- it will start reporting server locally and provide html reports. 
VPN may cause some issues, please disable it before starting reporting server.

