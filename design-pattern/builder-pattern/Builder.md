# Builder Pattern

A Builder Method is a design pattern used to create objects in a more concise and readable way. It is particularly useful when creating objects with a large number of fields or properties.

The builder pattern involves creating a separate class that is responsible for building the object. This class typically has a set of methods that allow you to set the various fields or properties of the object. Once all the fields have been set, the builder class then creates and returns the final object.

In Spring Boot, the builder pattern is often used with configuration classes. These classes define various properties or settings that can be used to configure the behavior of the application. By using a builder pattern, it is possible to provide a more intuitive and readable way for developers to configure these settings.

## Implementation -
1. Java -
```java
public class Person {
    private final String name;
    private final int age;
    private final String city;
    
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }
    
    public static class Builder {
        private String name;
        private int age;
        private String city;
        
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        
        public Builder city(String city) {
            this.city = city;
            return this;
        }
        
        public Person build() {
            return new Person(this);
        }
    }
}
```

In this example, we have a Person class that has three fields: name, age, and city. We also have a nested Builder class that is responsible for creating new Person objects. The Builder class has a set of methods for setting the various fields, and a build() method that creates and returns the final Person object.

Here's an example of how to use the builder pattern to create a new Person object:
```
Person person = new Person.Builder()
.name("John")
.age(30)
.city("New York")
.build();
```

This creates a new Person object with the name "John", age 30, and city "New York". By using the builder pattern, we can create objects in a more readable and intuitive way.