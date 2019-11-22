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
