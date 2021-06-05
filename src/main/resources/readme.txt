Creational
	Factory
		Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
		In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface
		!!!	Allows you to abstract the creation of very similar objects and then evolve common processing over the interface. All objects must have a very similar and compatible structure.allows you to abstract the creation of very similar objects and then evolve common processing over the interface. All objects must have a very similar and compatible structure.
	Abstract factory
		Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. 
		This type of of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
		In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. 
		Each generated generated factory can give the objects as per the Factory pattern.
		!!!	Similar to Factory, but more abstract in that it allows for multiple distinct flavours. The level of hierarchies increases, as there are intermediate factories, but perhaps it allows for greater laterality
	Singleton
		Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
		This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. 
		This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
		!!!	It is useful to have a class with a single instance to, for example, distribute a certain resource at a central point. In the example, a counter is managed.
	Builder
		Builder pattern builds a complex object using simple objects and using a step by step approach.
		This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
		A Builder class builds the final object step by step. This builder is independent of other objects.
		!!!	This one seems particularly useful for structuring complex collections of objects. The hierarchical and complicated structure

Structural
	Adapter
		Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.
		This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. 
		You plugin the memory card into card reader so that memory card can be read via laptop.
		We are demonstrating use of Adapter pattern via following example in which an audio player device can play mp3 files only and wants to use an advanced audio player capable of playing vlc and mp4 files.
		**	This one was not spectacularly impressive, the coexistence of incompatible interfaces does not seem appealing
	Bridge
		Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. 
		This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge between them.
		This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. 
		Both types of classes can be altered structurally without affecting each other.
		We are demonstrating use of Bridge pattern via following example in which a circle can be drawn in different colors using same abstract class method but different bridge implementer classes.
		**	This allows for implementation at a point prior to the abstract class
	Filter
		Filter pattern or Criteria pattern is a design pattern that enables developers to filter a set of objects using different criteria and chaining them in multiple decoupled 
		way through logical operations. This type of design pattern comes under structural pattern as this pattern combines multiple criteria to obtain single criteria.
		!!! This example is very interesting as a support technique. You can't organize a project, but it's a mechanism that allows, as the name implies, filtering and operations on elements
	Composite
		Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as 
		well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
		This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.
		We are demonstrating use of composite pattern via following example in which we will show employees hierarchy of an organization.
		!!!	Simple implementation of an involution/resource. And always useful.
	Decorator
		Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern 
		acts as a wrapper to existing class. This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.
		We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class
		!!!	Very interesting, it allows you to compose additional (or alternative) functionality on top of a common interface and apply it discreetly on classes that implement this interface
	Facade
		Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
		This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
		This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
		**	Consists of placing an intermediate distributor that concentrates and exposes functionality of other classes
	Flyweight
		Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. 
		This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.
		Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.
		**	It consists of caching objects for use. it's very specific.

Behavioral		
	Chain of responsibility
		As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. 
		This pattern decouples sender and receiver of a request based on type of request. This pattern comes under behavioral patterns.
		In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.
		**	As the name implies, implementation involves chaining together classes and applying layered delegated processing. In the example, all layers are triggered and each one does its little part and triggers the call of the next layer
	Command
		Command pattern is a data driven design pattern and falls under behavioral pattern category. 
		A request is wrapped under an object as command and passed to invoker object. 
		Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.
		**	Consists of an intermediary class (broker) that triggers the execution of scheduled classes
	Interpreter
		Interpreter pattern provides a way to evaluate language grammar or expression. 
		This type of pattern comes under behavioral pattern. 
		This pattern involves implementing an expression interface which tells to interpret a particular context. 
		This pattern is used in SQL parsing, symbol processing engine etc.
		!!!	Interesting as a mechanism for, as the name implies, building interpreters

	Iterator
		Iterator pattern is very commonly used design pattern in Java and .Net programming environment.
		This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.
		Iterator pattern falls under behavioral pattern category.
		!!!	Example of how to correctly implement an iterator. Involves having two interfaces, one for the container and one for the iterator, and a class to explore both
	Mediator 
		Mediator pattern is used to reduce communication complexity between multiple objects or classes. 
		This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. 
		Mediator pattern falls under behavioral pattern category.
		**	This one is not of great interest as an example. It's simply a class delegating part of the execution to another method class
	Memento 
		Memento pattern is used to restore state of an object to a previous state.
		Memento pattern falls under behavioral pattern category.
		**	This one is not of great interest. It's simply a list that keeps images of objects, I don't know why qualify this as a technique
	Observer
		Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its dependent objects are to be notified automatically. 
		Observer pattern falls under behavioral pattern category
		!!!	Interesting, implementation of how an observer works in a practical way. Observers are used a lot in Javascript with React and Angular
	State
		In State pattern a class behavior changes based on its state. This type of design pattern comes under behavior pattern.
		In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.
		!!!	Interesting implementation of a state machine segregating the tasks of each state in its own class
	Null Object
		In Null Object pattern, a null object replaces check of NULL object instance. Instead of putting if check for a null value, Null Object reflects a do nothing relationship.
		Such Null object can also be used to provide default behaviour in case data is not available.
		In Null Object pattern, we create an abstract class specifying various operations to be done, concrete classes extending this class and a null object class providing do nothing implementation of this class and will be used seemlessly where we need to check null value.
		**	Interesting as a curiosity, but Optionals end up covering this need
	Strategy
		In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.
		In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object.
		The strategy object changes the executing algorithm of the context object.
		**	This appears to be the normal application of classes to implement interfaces, but with the twist of having a class to act as an intermediary
	Template
		In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
		Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.
		This pattern comes under behavior pattern category.
		!!!	Implement different parts in different instances of the template
	Visitor
		In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class.
		By this way, execution algorithm of element can vary as and when visitor varies. This pattern comes under behavior pattern category.
		As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.
