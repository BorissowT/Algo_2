package app.commands.Impl;

import app.App;
import app.commands.ICommand;
import app.console.IConsole;
import app.data.CourseComparator;
import app.data.MatricularComparator;
import app.data.Student;
import app.lists.IListable;
import app.sort.BubbleSort;
import app.sort.Comparator;
import app.sort.SelectionSort;
import app.sort.Sortable;

public class SortCMD implements ICommand {
	final private IConsole console;
	private final IListable<Student> SingleList;
	private final IListable<Student> DoubleList;
	boolean ifBubbleSort;
	boolean ifbyCourseSort;

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
					ifBubbleSort = true;
					sortByCriteriaMenu();
					break;
				case 2:
					ifBubbleSort = false;
					sortByCriteriaMenu();
					break;
				case 0:
					return;
			}
		}
	}

	public void sortByCriteriaMenu(){
		while (true) {
			System.out.println("Select a sorting method for sorting:\n" +
					" 1. Sort by course?\n" +
					" 2. Sort by matriculation number?\n" +
					"\n0. Exit\n");
			switch (console.readInteger("Please enter a number for an option:")) {
				case 1:
					ifbyCourseSort = true;
					sort();
					break;
				case 2:
					ifbyCourseSort = false;
					sort();
					break;
				case 0:
					return;
			}
		}
	}

	private void sort() {
		if(ifBubbleSort && App.getIfSingleList() && ifbyCourseSort)
			sort(new BubbleSort<Student>(), this.SingleList, new CourseComparator());
		if(ifBubbleSort && App.getIfSingleList()  && !ifbyCourseSort)
			sort(new BubbleSort<Student>(), this.SingleList, new MatricularComparator());
		if(!ifBubbleSort && App.getIfSingleList() && ifbyCourseSort)
			sort(new SelectionSort<>(), this.SingleList, new CourseComparator());
		if(!ifBubbleSort && App.getIfSingleList() && !ifbyCourseSort)
			sort(new SelectionSort<>(), this.SingleList, new MatricularComparator());
		if(ifBubbleSort && !App.getIfSingleList() && ifbyCourseSort)
			sort(new BubbleSort<>(), this.DoubleList, new CourseComparator());
		if(ifBubbleSort && !App.getIfSingleList() && !ifbyCourseSort)
			sort(new BubbleSort<>(), this.DoubleList, new MatricularComparator());
		if(!ifBubbleSort && !App.getIfSingleList() && ifbyCourseSort)
			sort(new SelectionSort<>(), this.DoubleList, new CourseComparator());
		if(!ifBubbleSort && !App.getIfSingleList() && !ifbyCourseSort)
			sort(new SelectionSort<>(), this.DoubleList, new MatricularComparator());
	}

	private static <T> void sort(Sortable<T> algorithm, IListable<T> list, Comparator<T> comp) {
		algorithm.sort(list, comp);
	}

	@Override
	public String toString(){
		return "Sort list by different properties.";
	}

}
