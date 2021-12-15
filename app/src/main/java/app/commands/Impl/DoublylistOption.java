package app.commands.Impl;

import app.App;
import app.commands.ICommand;

public class DoublylistOption implements ICommand {

	@Override
	public void execute() {
		App.setIfSingleList(false);
		App.setExitSubMenu(true);
	}

	@Override
	public String toString() {
		return "DoublyLinkedList";
	}

}
