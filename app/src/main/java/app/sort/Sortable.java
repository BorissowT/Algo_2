package app.sort;

import app.lists.IListable;

import java.util.List;

public interface Sortable<T> {
	public void sort(IListable<T> list, Comparator<T> comp);
}
