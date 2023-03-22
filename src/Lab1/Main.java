package Lab1;

class Main
{
    public static void main(String[] args)
    {
        String [] pointsofview = {"Парк Шевченко", "Зоопарк", "Дзеркальна струя", "ХАТОБ", "Фельдман екопарк", "Барабашово", "Журавльовка"};

        TouristIterator scenario1 = new TouristIterator("Маршрут Туриста", pointsofview);
        Iterator iterator1 = scenario1.getIterator();
        System.out.println("Маршрут 1: " + scenario1.getName());
        while ((iterator1.hasNext())){
            System.out.println(iterator1.next().toString() + " ");
        }

        NavigatorIterator scenario2 = new NavigatorIterator("Навігатор Туриста", pointsofview);
        Iterator iterator2 = scenario2.getIterator();
        System.out.println("\nМаршрут 2: " + scenario2.getName());
        while ((iterator2.hasNext())){
            System.out.println(iterator2.next().toString() + " ");
        }

        GuideIterator scenario3 = new GuideIterator("Місцевий Гід", pointsofview);
        Iterator iterator3 = scenario3.getIterator();
        System.out.println("\nМаршрут 3: " + scenario3.getName());
        while ((iterator3.hasNext())){
            System.out.println(iterator3.next().toString() + " ");
        }

    }
}





