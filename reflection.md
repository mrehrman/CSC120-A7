Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?
I decided to overload the constructors in each of my classes. It's likely that someone might want to make a new building without having all of the information about it at the time of creating. By overloading the constructors, it's possible to make new instances of each class even if you only have part of the information that the class requires. As each class also still has a full constructor, you can also create an instance with all information.
In the Library class, I also overloaded isAvailable() to allow a user to check the availability status of two titles at once. Rather than returning a boolean, the overloaded method does not return anything and instead prints a message to the console to inform the user whether the titles are available.
In the Cafe class, I also overloaded restock() so that the Cafe can restock its inventory with default values, as well as restock with values that the user inputs.

- What worked, what didn't, what advice would you give someone taking this course in the future?
