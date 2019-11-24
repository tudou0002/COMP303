I found that doing some actual coding really helps me to prepare for COMP courses, so here I am. 

# Iterator
- Defined two object classes `Item` and `Inventory`
- Created two iterators, one with annoymous class in the `iterator()`, another is a seperated class but has to contain the field to record the traversing list. Two iterators can let the client to traverse `Inventory` object in two directions.

# Strategy
- Simple design to sort leetcode questions based on Id/Acceptance/Difficulty.
- Used three ways to implement `Comparator<Problem>`:
    - `sortId()` used an annoymous class
    - `sortAcceptance()` used a seperate object class called `CompareByAcceptance`
    - `sortDifficulty()` used a nested class in class `Problems`
    
# Flyweight
- Created immutable and unique `Item` object using HashMap.

# Composite
- Tree-like hierarchy with leaves are `Regular` and `Espresso`.

# Decorator
- Added a decorator named `Latte`.

# Template
- Mostly used in describing a process which some steps need to be changed based on different cases.
- Created an abstract class `MakeCoffee` and a concrete class `Latte`.

# Prototype
- Imagine a simple Blog system with `Post` as the AbstractPrototype, `Note` and `Blog` are ConcretePrototypes.
- Allow user to change the default prototype and make a copy of prototype.

# Observer
- Created interfaces `Observer` and `Subject`, object classes `store` and `website` implement `Observer`, `Corporation` implements `Subject`. Used push method.
- Question1: how to deal with the update() when the field is a HashMap
- Question2: can I seperate the update() method so that observers can react differently for different field.
- todo: use pull method

# Visitor 
- Created `TimeVisitor` and `SalaryVisitor` implemented `Visitor` imterface. `Fulltime` and `Parttime` implement Employee interface.
- Adding a new concrete visitor is easy, adding a new concrete subject violates the open-closed principle.
- todo: use nonvoid `accept()` and `visit()` later.
