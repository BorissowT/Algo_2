package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.Student;
import app.lists.IListable;

public class ReturnNumberCMD implements ICommand {
	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;

	public ReturnNumberCMD(IListable<Student> singleList, IListable<Student> doubleList) {
		this.SingleList = singleList;
		this.DoubleList = doubleList;
	}

	@Override
	public void execute() {
		if(App.getIfSingleList())
			System.out.println(SingleList.size());
		else
			System.out.println(DoubleList.size());
	}

	@Override
	public String toString() {
		return "Returns the number of Students in this list.";}
}
