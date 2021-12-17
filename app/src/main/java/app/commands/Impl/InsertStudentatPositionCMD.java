package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.Student;
import app.lists.IListable;

public class InsertStudentatPositionCMD implements ICommand {
	final private IConsole console;
	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;

	public InsertStudentatPositionCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
		this.console = console;
		this.SingleList = singleList;
		this.DoubleList = doubleList;
	}
	@Override
	public void execute() {
		String prename = console.readString("Please enter prename: ");
		String surname = console.readString("Please enter surname: ");
		int matriculationNumber = console.readInteger("Please enter course number: ");
		int course = console.readInteger("Please enter matriculation number: ");
		Student student = new Student(prename, surname, matriculationNumber, course);
		if(App.getIfSingleList())
			SingleList.insert(console.readInteger("Please enter the index"), student);
		else
			DoubleList.insert(console.readInteger("Please enter the index"), student);
	}

	@Override
	public String toString() {
		return "Inserts the Student at the specified position in this list.";
	}
}
