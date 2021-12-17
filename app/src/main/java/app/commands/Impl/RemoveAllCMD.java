package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.Student;
import app.lists.IListable;

public class RemoveAllCMD implements ICommand {
	final private IConsole console;
	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;

	public RemoveAllCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
		this.console = console;
		this.SingleList = singleList;
		this.DoubleList = doubleList;
	}
	@Override
	public void execute() {
		if(App.getIfSingleList())
			SingleList.clear();
		else
			DoubleList.clear();
	}

	@Override
	public String toString() {
		return "Removes the Student at the specified position in this list.";}

}
