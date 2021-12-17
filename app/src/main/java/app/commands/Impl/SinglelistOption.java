package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;

public class SinglelistOption implements ICommand{
	final private IConsole console;

	public SinglelistOption(IConsole console) {
		this.console = console;
	}

	@Override
		public void execute() {
			App.setIfSingleList(true);
			App.setExitSubMenu(true);
		}

		@Override
		public String toString() {
			return "SinglyLinkedList";
		}


}
