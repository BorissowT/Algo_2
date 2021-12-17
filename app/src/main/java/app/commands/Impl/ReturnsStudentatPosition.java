package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.Student;
import app.lists.IListable;

public class ReturnsStudentatPosition implements ICommand {
	final private IConsole console;
	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;

	public ReturnsStudentatPosition(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
		this.console = console;
		this.SingleList = singleList;
		this.DoubleList = doubleList;
	}
	@Override
	public void execute() {
		if(App.getIfSingleList())
			System.out.println(SingleList.get(console.readInteger("Please enter the index")));
		else
			System.out.println(DoubleList.get(console.readInteger("Please enter the index")));
	}

	@Override
	public String toString() {
		return "Returns the Student at the specified position in this list.";
	}
}
