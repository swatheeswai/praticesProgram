  class recursion 
    {
        int func (int n) 
        {
            int result;
            if (n == 1)
                return 1;
            result = func (n - 1);
            return result;
        }
    } 
    class recursion2
    {
        public static void main(String args[]) 
        {
            recursion obj = new recursion() ;
            System.out.print(obj.func(5));
        }
    }
