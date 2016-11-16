MarsRoverApi
============
The objective is to develop an API that follows the movement of a planet exploration vehicle (also called a Rover) and keeps track of its position and the obstacles that it may have encountered on a tour. 
- There is no graphical user interface. 
- You work only with objects and JUnit test.
- You don't need a main method.

Project Template:
You are provided with a project template that contains one class which you will implement: `MarsRover` 
-	DO NOT CHANGE the names of the existing methods. 
-	Also, the parameters and the return types of the methods in the template SHOULD NOT BE CHANGED. But you may add throws declaration if needed.  
-	Your program should throw `MarsRoverException` in error situations. 
-	You should write the unit tests in `MarsRoverTest.java`

**Mars Rover  API Task Description**  
Develop an API that manages the movement of a planet exploration vehicle (i.e., a rover) around a planet. The planet is represented as grid with x and y coordinates. The rover starts the movement at position (0,0). The rover has also a direction that it is facing. The direction of the rover can be N (north), S (south), E (east) and W (west). The rover starts facing North. The input received by the rover is a string representing the sequence of commands it needs to execute.

The rover receives one string of commands. The commands are: "l" (left), "r" (right), "f" (forward) and "b" (backward). "l" and "r" change the rover’s direction counter- and clockwise, respectively, but not the position. "f" and "b" move the rover 1 position on the grid towards the direction it is facing or away from it, respectively. The facing does not change. Since the planet is a sphere, the grid wraps around the edges. When the rover moves over the edges of the planet, it spawns on the opposite edges.

The planet (grid) may contain obstacles in cells. Obstacles are defined as a list of coordinates "(obs1_x,obs1_y)(obs2_x,obs2_y)… (obsN_x,obsN_y)". When the rover finds an obstacle during a tour, it skips the current command (i.e., does not move to the cell where the obstacle is located) and continue executing the remaining commands.

Upon processing the string of commands, the rover returns its position and facing in the format "(pos_x,pos_y,facing)". If obstacles are found, the output will be "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" The same obstacle shall be reported only once. Obstacles are reported in the order they are found.

**Examples:**   
Example of an rover’s tour on a 3x3 planet in response to the command "ffrf". The starting position is (0,0) facing N(orth). After the 1st "f" (forward) command, the rover moves to position (0,1) facing North. Subsequent commands keep the rover moving. The expected output is (1,2,E). 
If there were two more "f" in the command, the rover would move over the right edge and spawn on the left edge to the final position (0,2,E).  (Figure on the left)

Example of a rover’s tour on a 3x3 planet in response to the command "ffrf", with one obstacle in position (0,2). After the 1st "f" (forward) command, the rover moves to position (0,1) facing North. The 2nd "f" command does not change the rover’s position, because there is an obstacle in (0,2). This second "f" command is thus skipped. The expected output is (1,1,E)(0,2). (Figure on the right)

Note that the API that you are implementing does not have a graphical user interface. These examples are given to help you visualize the moves of the planet rover. 

![mra](http://snappyimages.nextwavesrl.netdna-cdn.com/img/0c87e36563b080b1adfb3c2736dd78f4.png)

**TAKE THE QUESTIONNAIRE AT:** [https://goo.gl/forms/nArKORP8e5pbnfuD3](https://goo.gl/forms/nArKORP8e5pbnfuD3)
