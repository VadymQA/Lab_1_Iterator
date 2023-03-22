package Lab1;

public class NavigatorIterator implements MyCollection{
    private final String name;
    private final String[] pointsofview;

    public NavigatorIterator(String name, String[] pointsofview) {
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

    private class PointOfViewIterator implements Iterator{
            int index = pointsofview.length - 1;
        @Override
        public boolean hasNext() {
            if(index >= 0 ){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return pointsofview[index--];
        }
    }
}
