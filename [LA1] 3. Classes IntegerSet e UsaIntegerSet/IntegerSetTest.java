public class IntegerSetTest {
    public static void main(String[] args) 
    {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.insertElement(1);
        set1.insertElement(5);
        set2.insertElement(5);
        set2.insertElement(4);
        set2.deleteElement(4);
        set2.insertElement(10);

        System.out.println("Conjunto 1:  " + set1.toSetString());
        System.out.println("Conjunto 2:  " + set2.toSetString());

        IntegerSet unionSet = set1.union(set2);
        System.out.println("Uniao do C1 e C2:  " + unionSet.toSetString());

        IntegerSet intersectionSet = set1.intersection(set2);
        System.out.println("Intersecao do C1 e C2:  " + intersectionSet.toSetString());

        System.out.println("C1 = C2? " + set1.isEqualTo(set2));
    }
}