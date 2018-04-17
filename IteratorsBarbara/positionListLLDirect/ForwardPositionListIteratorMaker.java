package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;

public class ForwardPositionListIteratorMaker<T> implements
		PositionListIteratorMaker<T> {

	@Override
	public Iterator<T> makeIterator(PositionList<T> pl) {
		return new PositionListElementsIterator<T>(pl);
	}

}
