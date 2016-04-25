Visitor
Through the use of the visitor design pattern we were able to create a program where the core functionality is not directly connected to the classes being used. Instead of lumping both class variables and functions together, we have detatched the functionality in a way that is extensible and easy to refactor. Because the functionality is located within the ElementVisitor class, new functionality can be added more easily to a wider array of objects without risking breaking the system.

Builder
The builder pattern is a creation pattern that facilitates the process of constructing different complex objects, especially if we have to construct the same kind of complex objects multiple times. As stated in [sourcemaking,]() the intent of the builder pattern is to

> Separate the construction of a complex object from its representation so that the same construction process can create different representations. 

In our example, we're attempting to construct a variety of different spaceships -- A-Wings, X-Wings, B-Wings, etc., and each different spaceship has to be constructed with different wings, cockpits, engines, and other things, and thus has a complex instantiation process. In order to simplify the process of constructing each ship, we use the builder pattern, effectively decoupling the process of manually constructing it from the act of instantiating it. 