public class comparate implements IComparator{

    @Override
    public int Compare(Object _object1, Object _object2) {
        int n1= (int)_object1;
		int n2= (int)_object2;
        if(n1 > n2 )
		{
			return 1;
		}
		
		else if (n1 < n2)
		{
			return -1;
		}
		
		else
		return 0;
    }
    
}
