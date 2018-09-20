package strings;

public class Validations {
	public static boolean isValidEmail(String m)
	{
		boolean isValid=false;
	String[] a=m.split("@");
		if(a.length==2)
		{
		if(a[0].length()>=5)
		{
		String[] n=a[1].split("\\.");
		{
			if(n.length==2)
			{
			if(n[0].length()>=2 && n[1].length()>=2)
			{
				isValid=true;
			}
			}
		}
		}
		}
	return isValid;
	}
	public static boolean isValidName(String n)
	{
		boolean isValid=false;
		char[] n1=n.toCharArray();
		if(n.length()>=3)
		
		{
			if(n.charAt(0)>=65&&n.charAt(0)<=90)
			{
				for(int i=0;i<n1.length;i++)
				{
				if(n1[i]=='a'||n1[i]=='e'||n1[i]=='o'||n1[i]=='o'||n1[i]=='u'||n1[i]=='y'){
					{				
						isValid=true;
					}
				}
				}
			}
		}
		return isValid;
	}
	public static boolean isValidPan(String p)
	{
		int c=0;
		int c1=0;
		int c2=0;
		boolean isValid=false;
		char[] b=p.toCharArray();
		if(p.length()==10)
		{
			for(int i=0;i<b.length;i++)
			{
				if(b[i]>=65&&b[i]<=90)
				{
					c1++;
				}
				
					if(b[i]>=48&&b[i]<=57)
					{
						c++;
					}
				}
				
			if(c>0&&c1>0)
			{
				isValid=true;
			}
			
		}
		
		return isValid;
	}
	public static boolean isValidBankPassword(String s)
	{
		int c1=0;
		int c=0;
		int c2=0;
		int c3=0;
		boolean isValid=false;
		char[] h=s.toCharArray();
		if(s.length()>=8)
		{
		   for(int i=0;i<h.length;i++)
		   {
			if(h[i]>=65&&h[i]<=90)
			{
				c++;
			}
			if(h[i]>=48&&h[i]<=57)
			{
				c1++;
			}
			if(h[i]>=97&&h[i]<=122)
			{
				c2++;
			}
			if(h[i]>=33&&h[i]<=47)
			{
				c3++;
			}
		   }
		}
		if(c>0&&c1>0&&c2>0&&c3>0)
		{
			isValid=true;
		}
		return isValid;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="machugarinalini2@gmail.com";
boolean l =isValidEmail(m);
System.out.println(l);
String n="Nalini";
boolean e=isValidName(n);
System.out.println(e);
String p="EOYTR67890";
boolean c=isValidPan(p);
System.out.println(c);
String s="AS3214asfb!";
boolean q=isValidBankPassword(s);
System.out.println(q);
}
}


