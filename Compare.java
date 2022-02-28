public class Compare implements Icomparator {

    @Override
    public int Compare(Object _object1, Object _object2) {
       int num1=(int)_object1; 
       int num2=(int)_object2; 
       if(num1>num2){
           return 1;
       }else if(num1<num2){
            return -1;
       }else{
           return 0; 
       }
    }
    
}
