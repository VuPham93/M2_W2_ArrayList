public class MyListTest {
    public static void main(String[] args) {
        MyList<String> stringMyList = new MyList<String>();
        stringMyList.add("a");
        stringMyList.add("b");
        stringMyList.add("c");
        stringMyList.add("e");
        stringMyList.add("f");

        System.out.print("\n" + "Array list 1: " );
        for (int i = 0; i < stringMyList.size(); i++) {
            System.out.print("\t" + stringMyList.get(i));
        }

        stringMyList.add("h");
        stringMyList.add(3, "d");
        stringMyList.add("i");
        stringMyList.add(8, "j");
        stringMyList.add(6, "g");
        stringMyList.add(10, "k");

        System.out.print("\n" + "After add more characters");
        System.out.print("\n" + "Array list 1: " );
        for (int i = 0; i < stringMyList.size(); i++) {
            System.out.print("\t" + stringMyList.get(i));
        }

        System.out.print("\n" + "Clone of array list 1: " );
        MyList<String> clone = stringMyList.clone();
        for (int i = 0; i < clone.size(); i++) {
            System.out.print("\t" + clone.get(i));
        }

        MyList<Object> myList = new MyList<Object>(5);
        myList.add("String");
        myList.add(true);
        myList.add(1);
        myList.add(2.0);

        System.out.println();
        System.out.print("\n" + "Array list 2: " );
        for (int i = 0; i < myList.size(); i++) {
            System.out.print("\t" + myList.get(i));
        }
        System.out.println("\n" + "Array list size is: " + myList.size());

        double findValue = 2.0;
        System.out.print("\n" + "Find value (" + findValue + ") is in the arraylist? " + myList.contains(findValue));
        System.out.print("\n" + "Index of find value = " + myList.indexOf(findValue));

        int index = 2;

        System.out.println("\n" + "Remove object at position " + index +": " + myList.remove(index));
        System.out.print("Array list 2: " );
        for (int i = 0; i < myList.size(); i++) {
            System.out.print("\t" + myList.get(i));
        }
        System.out.println("\n" + "Array list size is: " + myList.size());

        myList.clear();
        System.out.println("\n" + "Clear array list");
        System.out.print("Array list 2: " );
        for (int i = 0; i < myList.size(); i++) {
            System.out.print("\t" + myList.get(i));
        }
        System.out.println("\n" + "Array list size is: " + myList.size());
  }
}
