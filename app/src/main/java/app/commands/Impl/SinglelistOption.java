package app.commands.Impl;

import app.App;
import app.commands.ICommand;

public class SinglelistOption implements ICommand{

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
