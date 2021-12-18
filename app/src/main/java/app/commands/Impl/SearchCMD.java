package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.Student;
import app.lists.IListable;

public class SearchCMD implements ICommand {
	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;
	final private IConsole console;

	public SearchCMD(IConsole console, IListable<Student> singleList, IListable<Student> doubleList) {
		this.SingleList = singleList;
		this.DoubleList = doubleList;
		this.console = console;
	}

	@Override
	public void execute() {
		while(true){
			System.out.println("Select a property to search for the student:\n" +
					" 1. Search by prename?\n" +
					" 2. Search by surname?\n" +
					" 3. Search by course number?\n" +
					" 4. Search by matriculation number?\n"+
					"\n0. Exit\n");
			switch (console.readInteger("Please enter a number for an option:")){
				case 1:
					if(App.getIfSingleList())
						SingleList.searchByName(console.readString("Please enter prename for the search: "));
					else
						DoubleList.searchByName(console.readString("Please enter prename for the search: "));
					break;
				case 2:
					if(App.getIfSingleList())
						SingleList.searchByLastname(console.readString("Please enter surname for the search: "));
					else
						DoubleList.searchByLastname(console.readString("Please enter surname for the search: "));
					break;
				case 3:
					if(App.getIfSingleList())
						SingleList.searchByCourse(console.readInteger("Please enter course for the search: "));
					else
						DoubleList.searchByCourse(console.readInteger("Please enter course for the search: "));
					break;
				case 4:
					if(App.getIfSingleList())
						SingleList.searchByMNumber(console.readInteger("Please enter course for the search: "));
					else
						DoubleList.searchByMNumber(console.readInteger("Please enter course for the search: "));
					break;
				case 0:
					return;
			}
		}
	}

	@Override
	public String toString() { return "Search for student(s) by different characteristics.";}
}
