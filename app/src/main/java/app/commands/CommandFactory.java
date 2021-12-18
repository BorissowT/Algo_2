package app.commands;

import app.commands.Impl.*;
import app.console.IConsole;
import app.data.Student;
import app.lists.DoublyLinkedList;
import app.lists.IListable;
import app.lists.SinglyLinkedList;


import java.util.LinkedList;

public class CommandFactory {

	final private IConsole console;
	IListable<Student> SingleList = new SinglyLinkedList<>();
	IListable<Student> DoubleList = new DoublyLinkedList<>();

	public CommandFactory(IConsole console, IListable<Student> SingleList) {
		super();
		this.console = console;
		this.SingleList = SingleList;
	}
	public LinkedList<ICommand> returnsCommands() {
		LinkedList<ICommand> cmds = new LinkedList<ICommand>();

		cmds.add(new ExitProgramCmd());
		cmds.add(new InsertStudentatPositionCMD(console, SingleList, DoubleList));
		cmds.add(new InsertStudentatBeginningCMD(console, SingleList, DoubleList));
		cmds.add(new AddLastCmd(console, SingleList, DoubleList));
		cmds.add(new ReturnsStudentatPosition(console, SingleList, DoubleList));
		cmds.add(new AddLastCmd(console, SingleList, DoubleList));
		cmds.add(new PrintallstudentstoconsoleCMD(SingleList, DoubleList));
		cmds.add(new ReturnNumberCMD(SingleList, DoubleList));
		cmds.add(new RemoveFromPositionCMD(console, SingleList, DoubleList));
		cmds.add(new RemoveAllCMD(console, SingleList, DoubleList));
		cmds.add(new SearchCMD(console, SingleList, DoubleList));
		cmds.add(new SortCMD(console, SingleList, DoubleList));

		return cmds;
	}
	public LinkedList<ICommand> returnsListOption() {
		LinkedList<ICommand> cmds = new LinkedList<ICommand>();

		cmds.add(new ExitProgramCmd());
		cmds.add(new SinglelistOption(console));
		cmds.add(new DoublylistOption());

		return cmds;
	}


}
