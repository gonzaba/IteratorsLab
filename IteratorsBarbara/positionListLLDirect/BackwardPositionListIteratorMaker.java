package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;
import positionListLLDirect.PositionListElementsBackwardIterator;

public class BackwardPositionListIteratorMaker<T> implements
		PositionListIteratorMaker<T> {

	@Override
	public Iterator<T> makeIterator(PositionList<T> pl) {
		return new PositionListElementsBackwardIterator<T>(pl);
	}

}
