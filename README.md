# prototype-design-pattern
Simple description and demo of the prototype design pattern using Java code for the demo.



# Prototype Design Pattern in Java

This repo demonstrates the Prototype Design Pattern using Java. It includes classes that represent different types of animals and shows how objects can be cloned using this pattern

## Overview

The Prototype Design Pattern is used to create duplicates of an existing object, which is useful when creation of an object directly is costly. For example, when an object requires data from a network, database, or file system to be initialized, cloning an existing object can be significantly more efficient

## Structure

- `Animal.java`: An interface for all animals that can be cloned
- `Sheep.java`: A concrete class implementing the `Animal` interface; represents a sheep
- `Cow.java`: A concrete class implementing the `Animal` interface; represents a cow
- `CloneFactory.java`: A class that demonstrates the Prototype Factory which can clone types of `Animal`
- `TestCloning.java`: A class used to test cloning functionality of `Sheep` and `Cow` using `CloneFactory`

## How to Run

1. **Clone the repo**
   ```bash
   git clone https://github.com/Jodansky/prototype-design-pattern.git
   cd prototype-design-pattern
2. **Compile the Java files**
   javac Animal.java Sheep.java Cow.java CloneFactory.java TestCloning.java
3. **Run the TestCloning class**
   java TestCloning


## Special thanks to:

Derek Banas, for the inspiration and the sample code that mine is based off of. [Derek's YouTube channel](https://www.youtube.com/@derekbanas)