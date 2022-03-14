# Code is present in master branch


In SpringBoot, the repository is autowired in Service class. 
Service methods will delegate tasks to the BlogRepository.
Service class has the methods will will actually do the operation.
All the delegate methods will be controlled in service class itself.
Autowire the blog service to the controller.

In application.properties include
port: 27017
dbname: BlogDb

Add crossorigin in backend so that it listens to outside applications(React application in this case).
