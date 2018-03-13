class A 
{ 
    public static void main(String args[])
    {
		for (int j = 2; j <= 20; j++)
		{
			boolean ok = prime(j)? false : true;
			if (ok)
			{
				System.out.println(j + ", ");
			}
		}

    }


    public static boolean prime(int j) 
    { 
		
        boolean result = false;
		int count = 0;
		for (int i = 2; i <= j / 2; i++)
		{
			if (j % i == 0)
			{
				count++;
				if(count > 2){
					result = true;
                    break;
				}else{
					continue;
				}
			}
		}
        return result; 
    } 

} 
