NOTE : This program uses mariadb Dependency.

This is a spring boot CRUD application that manages vehicle information and performes taskes on the database

Some changes you have to do in the program are to run on your system are :-

<1>: go to src/main/resources/application.properties and change your databse name ( spring.datasource.url=jdbc:mariadb://localhost:3306/( Your database name )

<2>: in the same file change your password to your mariadb password ( spring.datasource.password= ( your password )

THE PROGRAM IS TESTED AND VERIFIED ON POSTMAN AND ON ANY BROWSER. DOCUMENTATION FOR THE PROGRAM IS CAN BE SEEN OR TESTED ON SWAGGER.

(.jar) is also included that can be posted on AWS.

so change the above following according to your ec2 instance's mariadb before deploying.
