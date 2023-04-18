package Lab2;

public class GuideIterator implements MyCollection {
    private final String name;
    private final String[] pointsofview;

    public GuideIterator(String name, String[] pointsofview) {
        this.name = name;
        this.pointsofview = pointsofview;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator getIterator() {

        return new PointOfViewIterator();
    }

    private class PointOfViewIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index < pointsofview.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return pointsofview[index++];
        }
    }
}
