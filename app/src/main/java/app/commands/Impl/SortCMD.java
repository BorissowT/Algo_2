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
	public void execute() {
		while (true) {
			System.out.println("Select a sorting method for sorting:\n" +
					" 1. Bubblesort?\n" +
					" 2. Selectionsort?\n" +
					"\n0. Exit\n");
			switch (console.readInteger("Please enter a number for an option:")) {
				case 1:
					if (App.getIfSingleList())
						SingleList.searchByName(console.readString("Please enter prename for the search: "));
					else
						DoubleList.searchByName(console.readString("Please enter prename for the search: "));
					break;
				case 2:
					if (App.getIfSingleList())
						SingleList.searchByLastname(console.readString("Please enter surname for the search: "));
					else
						DoubleList.searchByLastname(console.readString("Please enter surname for the search: "));
					break;
			}
		}
	}

	@Override
	public String toString(){
		return "Sort list by different properties.";
	}

}
