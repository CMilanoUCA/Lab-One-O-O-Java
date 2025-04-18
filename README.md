### Carson Milano, Lab 4

The two Design Patterns I wished to implement into my old and frankly terrible Making Change Project
are the **Factory Pattern** and the **Strategy Pattern**. These two seemed easy to make, whicn was a
large contributor as to why they were selected for the lab. Let me explain below the reasons of 
implementation and actual implementations of these two Design Patterns in my project. Also, both
Design Patterns are accessed in each version of the program through interactable menu options, so
you can't miss them.

# Factory Pattern
## Why?
  The original program I had only worked with US currency, so I wanted to expand the scope of the
program to include other currencies around the world as well as gain the ability to grow and take
in new currencies someone may add. Two more currencies are initially added to the program: EU (Euro)
and UK (British Pound).
## How?
  Firstly, a CurrencyType Enum had to be created to store the different currency types, and this is
where other currencies would be initially added. As for other changes, the Factory Method getCurrency
within Currency.java is how the desired currency is chosen by the program, and the new Denomination
arrays are also stored in this class. getCurrency is called in Register.java, which sets off the
events for the other classes to recognize and correctly determine the change of whatever currency is
provided.

# Strategy Pattern
## Why?
  Allowing for different algorithms to make the calculations regarding amount conversions is good
programming practice, though I'm not too sure if having a speedier algorithm would help on such a
small-scale program. Perhaps my program will grow very large and take in large amounts of data, so
having an algorithm built towards analyzing larger data sets could be helpful, but the other option(s_
could stick around if these conversions are being implemented on a smaller scale.
## How?
  Firstly, I created a ChangeStrategy Interface to store the anount entered along with the chosen
currency from the Factory Pattern. From here, a GreedyChangeStrategy and an OptimalChangeStrategy
class implementing ChangeStrategy is created and filled out with code performing the necessary
conversions pertaining to their respective algorithms. I considered measuring the amount of time
taken to perform the calculations for each strategy, but decided against it since the times were
indistinguishable from a normal user anyways; there is a difference, though, so the code works.

## GitHub Repository Link (Don't know why you'd need this considering where you got the README from...)
https://github.com/CMilanoUCA/Lab-One-O-O-Java
