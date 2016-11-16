package tdd.training.session1;

public class MarsRover {

	Rover A;
	int global_x;
	int global_y;

	public MarsRover(int x, int y, String obstacles) {
		/*
		 * x and y represent the size of the grid. Obstacles is a String
		 * formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no
		 * white spaces.
		 * 
		 * Example use: MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")
		 * //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		 */
		A = new Rover();
		global_x = x;
		global_y = y;
	}

	public String executeCommand(String command) throws MarsRoverException {
		/*
		 * The command string is composed of "f" (forward), "b" (backward), "l"
		 * (left) and "r" (right) Example: The rover is on a 100x100 grid at
		 * location (0, 0) and facing NORTH. The rover is given the commands
		 * "ffrff" and should end up at (2, 2) facing East.
		 * 
		 * The return string is in the format:
		 * ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)? Where x and y are
		 * the final coordinates, facing is the current direction the rover is
		 * pointing to (N,S,W,E). The return string should also contain a list
		 * of coordinates of the encountered obstacles. No white spaces.
		 */
		String result = null;
		for (int i = 0; i <= command.length(); i++) {
			char cmd = command.charAt(i);
			int moment = 0;

			if (cmd == 'f') {
				moment = A.getPos_y() + 1;
				A.setPos_y(moment);
				result = "(" + A.getPos_x() + "," + A.getPos_y() + ")";
				System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
			} else if (cmd == 'b') {
				moment = A.getPos_y() - 1;
				A.setPos_y(moment);
				System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
			} else if (cmd == 'r') {
				System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
				i++;
				char cmd1 = command.charAt(i);
				while (cmd1 != 'r' || cmd1 != 'l') {
					if (cmd1 == 'f') {
						moment = A.getPos_x() + 1;
						A.setPos_x(moment);
						System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
						i++;
						cmd1 = command.charAt(i);
					} else if (cmd1 == 'b') {
						moment = A.getPos_x() - 1;
						A.setPos_x(moment);
						System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
						i++;
						cmd1 = command.charAt(i);
					}
				}
				if (cmd1 == 'r') {
					System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
					i++;
					char cmd2 = command.charAt(i);
					while (cmd2 != 'r' || cmd2 != 'l') {
						if (cmd2 == 'f') {
							moment = A.getPos_y() - 1;
							A.setPos_y(moment);
							System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
							i++;
							cmd2 = command.charAt(i);
						} else if (cmd2 == 'b') {
							moment = A.getPos_y() + 1;
							A.setPos_y(moment);
							System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
							i++;
							cmd2 = command.charAt(i);
						}
					}
					if (cmd2 == 'r') {
						System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
						i++;
						char cmd3 = command.charAt(i);
						while (cmd3 != 'r' || cmd3 != 'l') {
							if (cmd3 == 'f') {
								moment = A.getPos_x() - 1;
								A.setPos_x(moment);
								System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
								i++;
								cmd3 = command.charAt(i);
							} else if (cmd3 == 'b') {
								moment = A.getPos_x() + 1;
								A.setPos_x(moment);
								System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
								i++;
								cmd3 = command.charAt(i);
							}
						}
					}
				}
			} else if (cmd == 'l') {
				System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
				i++;
				char cmd1 = command.charAt(i);
				while (cmd1 != 'r' || cmd1 != 'l') {
					if (cmd1 == 'f') {
						moment = A.getPos_x() - 1;
						A.setPos_x(moment);
						System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
						i++;
						cmd1 = command.charAt(i);
					} else if (cmd1 == 'b') {
						moment = A.getPos_x() + 1;
						A.setPos_x(moment);
						System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
						i++;
						cmd1 = command.charAt(i);
					}
				}
				if (cmd1 == 'l') {
					System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
					i++;
					char cmd2 = command.charAt(i);
					while (cmd2 != 'r' || cmd2 != 'l') {
						if (cmd2 == 'f') {
							moment = A.getPos_y() - 1;
							A.setPos_y(moment);
							System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
							i++;
							cmd2 = command.charAt(i);
						} else if (cmd2 == 'b') {
							moment = A.getPos_y() + 1;
							A.setPos_y(moment);
							System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
							i++;
							cmd2 = command.charAt(i);
						}
					}
					if (cmd2 == 'l') {
						System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
						i++;
						char cmd3 = command.charAt(i);
						while (cmd3 != 'r' || cmd3 != 'l') {
							if (cmd3 == 'f') {
								moment = A.getPos_x() + 1;
								A.setPos_x(moment);
								System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
								i++;
								cmd3 = command.charAt(i);
							} else if (cmd3 == 'b') {
								moment = A.getPos_x() - 1;
								A.setPos_x(moment);
								System.out.print("(" + A.getPos_x() + "," + A.getPos_y() + ")");
								i++;
								cmd3 = command.charAt(i);
							}
						}
					}
				}
			}
			if(cmd != 'f' && cmd != 'r' && cmd != 'b' && cmd != 'l'){
				throw new MarsRoverException("Errore");
			}
		}

		return result;
	}
}

/*
 * int moment = 0; int moment1 = 0;
 * 
 * switch (command.charAt(i)) { case 'f': moment = A.getPos_y() + 1;
 * A.setPos_y(moment); System.out.print("(" + A.getPos_x() + "," + A.getPos_y()
 * + ")"); break;
 * 
 * case 'b': moment = A.getPos_y() - 1; A.setPos_y(moment); System.out.print("("
 * + A.getPos_x() + "," + A.getPos_y() + ")"); break;
 * 
 * case 'l': moment = A.getPos_x(); moment1 = A.getPos_y();
 * 
 * A.setPos_x(moment1); A.setPos_y(moment); System.out.print("(" + A.getPos_y()
 * + "," + A.getPos_x() + ")"); break;
 * 
 * case 'r': moment = A.getPos_x(); moment1 = A.getPos_y();
 * 
 * A.setPos_x(moment1); A.setPos_y(moment); System.out.print("(" + A.getPos_y()
 * + "," + A.getPos_x() + ")"); break; }
 */
