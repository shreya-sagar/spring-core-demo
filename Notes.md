# To be Done
Spring Boot CLI 

# Benefits of Spring Boot
- Automatic configuration
- Starter dependencies
- CLI
- Actuator

`@SpringBootApplication` = `@SpringBootConfiguration` + `@EnableAutoConfiguration` + `@ComponentScan`

# Note
**Model, @ModelAttribute, @RequestParam** : 

In Spring MVC, the `Model` object is used to pass data from the controller to the view. It holds the data that needs to be displayed in the view template. When a method parameter is annotated with `@ModelAttribute` or `@RequestParam`, Spring MVC automatically binds the corresponding data from the request to the parameter.
```java
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employeeList", employees);
        return "employee-list";
    }
}

@Controller
@RequestMapping("/employees")
public class EmployeeController {

  @PostMapping("/add")
  public String addEmployee(@ModelAttribute("employee") Employee employee) {
    // Save the employee using a service
    employeeService.saveEmployee(employee);
    return "redirect:/employees/list";
  }
}

@Controller
@RequestMapping("/employees")
public class EmployeeController {

  @GetMapping("/search")
  public String searchEmployees(@RequestParam("lastName") String lastName, Model model) {
    List<Employee> employees = employeeService.searchEmployeesByLastName(lastName);
    model.addAttribute("searchResults", employees);
    return "search-results";
  }
}
```
--------------------------------------------------
**Spring Boot Maven/Gradle Plugin** provide tools for packaging, running, and managing Spring Boot applications.
  It includes the ability to create executable JAR or WAR files, run the application locally, and perform various other tasks. It also supports hot reloading during development, which means that code changes are automatically picked up and the application is automatically restarted.

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <version>2.6.3</version>
            <executions>
                <execution>
                    <goals>
                        <goal>repackage</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
- **Gradle**
```groovy
plugins {
    id 'org.springframework.boot' version '2.6.3'
}
```
use the bootRun task to run your Spring Boot application directly from the Gradle command line:
```shell
./gradlew bootRun
```
Use ctrl+c to terminate bootRun task.

--------------------------------------------------
**REST (Representational State Transfer)** is an architectural style that provides a set of constraints and principles for designing networked applications, specifically web services. REST is widely used for building scalable and maintainable web APIs. It emphasizes simplicity, statelessness, and a uniform interface. Here are the key principles and components of the REST architecture:

1. **Resources:**
   Resources are the fundamental concept in REST. They are identified by unique URLs (Uniform Resource Locators). Resources can represent any data or entity, such as users, products, orders, etc.

2. **HTTP Methods (Verbs):**
   RESTful APIs use standard HTTP methods to perform operations on resources. The most commonly used methods are:
  - `GET`: Retrieve a resource's representation.
  - `POST`: Create a new resource.
  - `PUT`: Update or replace a resource.
  - `PATCH`: Partially update a resource.
  - `DELETE`: Delete a resource.

3. **Uniform Interface:**
   REST enforces a uniform interface between clients and servers. This interface consists of several constraints:
  - **Resource Identification:** Resources are uniquely identified by URLs.
  - **Resource Manipulation:** Resources are manipulated using the standard HTTP methods.
  - **Representation:** Resources are represented in various formats, such as JSON, XML, HTML, etc.
  - **Self-Descriptive Messages:** Requests and responses include enough information to be understood without additional context.
  - **Hypermedia as the Engine of Application State (HATEOAS):** Responses contain links to related resources, allowing clients to navigate the API.

4. **Statelessness:**
   RESTful services are stateless, meaning each request from a client must contain all the information needed to understand and process the request. The server doesn't store any client context between requests. This enhances scalability and simplifies the server's behavior.

5. **Caching:**
   REST allows responses to be cached by the client or intermediary systems. This helps to reduce network traffic and improve performance.

6. **Layered System:**
   The architecture can be composed of multiple layers, with each layer only interacting with the layer directly below it. This separation enhances modifiability and scalability.

7. **Client-Server Separation:**
   The client and server are independent components. The client is responsible for the user interface and user experience, while the server is responsible for data storage, processing, and security.

8. **Code on Demand (Optional):**
   This constraint is optional in REST and allows the server to provide executable code to the client. However, it's not commonly used in typical RESTful APIs.

RESTful architecture has gained immense popularity due to its simplicity, scalability, and compatibility with the HTTP protocol. It's widely used for building web APIs that enable different client applications (web, mobile, desktop) to communicate with servers over the internet.

--------------------------------------------------
