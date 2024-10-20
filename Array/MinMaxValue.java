public class MinMaxValue {
					public static void main(String args[])
					{
							int s[]={4,6,9,8,10,20,30};
							
							int min=s[0];
							int max=s[0];
							
							for(int i=0; i<s.length; i++)
							{
								if(s[i]<min)
								{
									min=s[i];
								}
								if(s[i]>max)
								{
									max=s[i];
								}
							}
							System.out.println(" minimum number "+min);
							System.out.println(" maximum number "+max);
					}
			
				}