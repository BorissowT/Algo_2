package app.commands.Impl;


import app.commands.ICommand;

public class ExitProgramCmd implements ICommand {

	@Override
	public void execute() {
		System.out.println("Exit program.");
		System.exit(0);		
	}

	@Override
	public String toString() {
		return "Exit program";
	}

	
}
