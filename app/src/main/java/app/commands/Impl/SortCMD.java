package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.Student;
import app.lists.IListable;

public class SortCMD implements ICommand {
	final private IConsole console;
	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;

	public SortCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
		this.console = console;
		this.SingleList = singleList;
		this.DoubleList = doubleList;
	}

	@Override
	public void execute() { }

	@Override
	public String toString() {
		return "Sort list by different properties.";}

}
