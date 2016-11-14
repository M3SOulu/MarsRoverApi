MarsRoverApi
============

API for a Mars explorer rover

  Develop an API that moves a rover around on a planet, represented as a grid. Points on the grid are referenced using x, y coordinates (e.g., (3,10) ). The rover faces a direction (N, S, E, W) in which it tries to move.
  
- The initial starting point is (0,0) with direction N.
- The rover receives a character array of commands.
-  Implement commands that move the rover forward/backward (f,b).
-  Implement commands that turn the rover left/right (l,r).
-  Implement wrapping from one edge of the grid to another. (planets are spheres after all)
-  Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point and reports the obstacle.

-  Example: The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2)