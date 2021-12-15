package app.commands;

import app.commands.Impl.*;
import app.console.IConsole;
import app.data.Student;


import java.util.LinkedList;

public class CommandFactory {

	final private IConsole console;

	public CommandFactory(IConsole console) {
		super();
		this.console = console;
	}
	public LinkedList<ICommand> returnsCommands() {
		LinkedList<ICommand> cmds = new LinkedList<ICommand>();

		cmds.add(new ExitProgramCmd());


		return cmds;
	}
	public LinkedList<ICommand> returnsListOption() {
		LinkedList<ICommand> cmds = new LinkedList<ICommand>();

		cmds.add(new ExitProgramCmd());
		cmds.add(new SinglelistOption());
		cmds.add(new DoublylistOption());

		return cmds;
	}
}
