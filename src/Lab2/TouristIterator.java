package Lab2;

public class TouristIterator implements MyCollection {
    private final String name;
    private final String[] pointsofview;

    public TouristIterator(String name, String[] pointsofview) {
        this.name = name;
        this.pointsofview = pointsofview;
    }

    public String getName() {
        return name;
    }

    public String[] getPointsofview() {
        return pointsofview;
    }

    @Override
    public Iterator getIterator() {
        return new PointOfViewIterator();
    }

    private class PointOfViewIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < pointsofview.length-2){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return pointsofview[index= index+2];
        }
    }
}
