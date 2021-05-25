package test;
import java.io.*;
import java.util.*; 
class Temple
{
    public static void main(String args[])throws IOException
    {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        
        int a=Integer.parseInt(br.readLine());
        int f[]=new int[a];
        
        for(int i=0;i<a;i++)
        {
            int b=Integer.parseInt(br.readLine());
            String s=br.readLine()+" ";
            
            if(b%2==0){f[i]=1;}
            else
            {
                
                int c[]=new int[b];
								int n=0,k=0;
								for(int j=0;j<s.length();j++)
								{
									if(s.charAt(j)!=' ')
									{
										if(j>0)
										{
											if(s.charAt(j-1)!=' ')
											n=n*10+(int)(s.charAt(j)-'0');
											else
											n=(int)(s.charAt(j)-'0');
										}
										else n=(int)(s.charAt(j)-'0');
									}
									else
									{
										c[k++]=n;n=0;
									}
								}
								
                 if(c[b/2]!=(b+1)/2){f[i]=1;}
                else
                {
                    for(int j=0;j<b-1;j++)
                    {
                        if(j<(b/2))
                        {
                            if(c[j+1]-c[j]!=1)
                            {f[i]=1;}
                        }
                        else
                        {
                            if(c[j]-c[j+1]!=1)
                            {f[i]=1;}
                        }
                    }
                }   
                
            }
    }
    for (int i=0;i<a;i++)
    {
        if(f[i]==0)
        System.out.println("yes");
        else 
        System.out.println("no");
    }
    }
    catch(Exception e){
        return;
    }
}
}