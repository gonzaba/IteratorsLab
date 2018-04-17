package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;

public interface PositionListIteratorMaker<T> {
	Iterator<T> makeIterator(PositionList<T> pl);
}
