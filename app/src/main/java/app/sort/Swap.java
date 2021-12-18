package app.sort;

import app.lists.IListable;

import java.util.List;

public class Swap<T> {
	
	protected void swap(IListable<T> list, int i, int j) {
		T memorizedObject = list.get(i);
		list.set(i, list.get(j));
		list.set(j, memorizedObject);
	}

}
