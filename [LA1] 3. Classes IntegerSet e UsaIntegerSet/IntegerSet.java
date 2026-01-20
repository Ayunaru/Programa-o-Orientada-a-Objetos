public class IntegerSet {

    private boolean[] a;

    public IntegerSet() 
    {
        a = new boolean[101];
    }

    public void insertElement(int k) 
    {
        a[k] = true;
    }

    public void deleteElement(int m) 
    {
        a[m] = false;
    }

    public IntegerSet union(IntegerSet otrSet) 
    {
        IntegerSet unionSet = new IntegerSet();

        for (int i = 0; i <= 100; i++) 
        {
            unionSet.a[i] = this.a[i] || otrSet.a[i];
        }

        return unionSet;
    }

    public IntegerSet intersection(IntegerSet otrSet) 
    {
        IntegerSet intersectionSet = new IntegerSet();

        for (int i = 0; i <= 100; i++) 
        {
            intersectionSet.a[i] = this.a[i] && otrSet.a[i];
        }

        return intersectionSet;
    }

    public boolean isEqualTo(IntegerSet otrSet) 
    {
        for (int i = 0; i <= 100; i++) 
        {
            if (this.a[i] != otrSet.a[i]) 
            {
                return false;
            }
        }

        return true;
    }

    public String toSetString() 
    {
        String result = "";
        boolean vazio = true;

        for (int i = 0; i <= 100; i++) 
        {
            if (a[i]) 
            {
                result += i + " ";
                vazio = false;
            }
        }

        return vazio ? "--" : result.trim();
    }
}
