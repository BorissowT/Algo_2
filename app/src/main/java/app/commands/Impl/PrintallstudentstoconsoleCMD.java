package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.Student;
import app.lists.IListable;

public class PrintallstudentstoconsoleCMD implements ICommand {

	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;

	public PrintallstudentstoconsoleCMD(IListable<Student> singleList, IListable<Student> doubleList) {
		this.SingleList = singleList;
		this.DoubleList = doubleList;
	}

	@Override
	public void execute() {
		if(App.getIfSingleList())
			SingleList.print();
		else
			DoubleList.print();
	}

	@Override
	public String toString() {
		return "Print all students to console from list.";
	}
}
