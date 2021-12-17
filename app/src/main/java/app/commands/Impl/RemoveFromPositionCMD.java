package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.Student;
import app.lists.IListable;

public class RemoveFromPositionCMD implements ICommand {
	final private IConsole console;
	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;

	public RemoveFromPositionCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
		this.console = console;
		this.SingleList = singleList;
		this.DoubleList = doubleList;
	}
	@Override
	public void execute() {
		if(App.getIfSingleList())
			SingleList.remove(console.readInteger("Please enter the index."));
		else
			DoubleList.remove(console.readInteger("Please enter the index."));
	}

	@Override
	public String toString() {
		return "Removes the Student at the specified position in this list.";}
}
