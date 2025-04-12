# Lab 2.01

Labs are mandatory and must be completed before the end of the next week.

You may work collaboratively with your classmates, but you may not copy and paste another student's code.

### Instructions

- Create a new GitHub repository named `Enterprise-Java-Development-2.01`
- Upload the code for all of the following prompts to your repository
- Submit a URL link to your repository below

### Specifications

1. Create a Spring Boot application using Spring Initializr with the following dependencies:
    - Spring Web
    - Spring Boot DevTools

2. Create a `GreetingController` class that has the following endpoints:
    - `/hello` - Returns "Hello World!"
    - `/hello/{name}` - Returns "Hello {name}!" where {name} is a path variable
    - `/add/{num1}/{num2}` - Returns the sum of num1 and num2
    - `/multiply/{num1}/{num2}` - Returns the product of num1 and num2

3. Create a `WeatherService` class that has methods to:
    - Get current temperature (simulate with random number between -10 and 40)
    - Get weather condition (randomly return: "Sunny", "Rainy", "Cloudy", "Windy")
    - Get wind speed (simulate with random number between 0 and 100)

4. Create a `WeatherController` class that uses constructor injection to receive the `WeatherService` and has endpoints to:
    - `/weather/temperature` - Returns current temperature
    - `/weather/condition` - Returns current weather condition
    - `/weather/wind` - Returns current wind speed
    - `/weather/all` - Returns all weather information in a single response

5. Create a `TimeService` class that has methods to:
    - Get current time
    - Get current date
    - Get current day of the week

6. Create a `TimeController` class that uses constructor injection to receive the `TimeService` and has endpoints to:
    - `/time` - Returns current time
    - `/date` - Returns current date
    - `/day` - Returns current day of the week
    - `/all` - Returns all time information in a single response

Remember:
- Use proper package structure
- Use constructor injection instead of @Autowired
- Test all endpoints using your web browser or Postman
- Include appropriate error handling
- Use meaningful variable and method names