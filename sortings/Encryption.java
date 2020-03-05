package sortings;

public class Encryption {

	public static void main(String[] args) {
		
		System.out.println(encryption("if man was meant to stay on the ground god would have given us roots"));
	
	}
	 static String encryption(String s) {

		 String [] str=s.split(" ");
		 
		 int totalSize=0;
		 
		 String big="";
		 
		 for(int i=0;i<str.length;i++)
		 {
			 totalSize+=str[i].length();
			 big+=str[i];
		 }
		 
		 double d=Math.sqrt(totalSize);
		 
		 int c,r;
		 if(d>Math.floor(d))
		 {
			 if(Math.ceil(d)*Math.floor(d)>=totalSize)
			 {
				 c=(int)Math.ceil(d);
				 r=(int)Math.floor(d);
			 }
			 else
			 {
				 c=(int)Math.ceil(d);
				 r=c;
			 }
		 }
		 else
		 {
			 c=(int)d;
			 r=c;	 
		 }
		 
		 char [][] ch=new char[r][c];
		 int i=0,j=0,k=0;
		 
		 for( i=0,k=0;i<r;i++)
			for( j=0;j<c && k<totalSize;j++,k++)
				ch[i][j]=big.charAt(k);
			
		 String ans="";		 	 
		 int ex=c-(r*c-totalSize);
		 
		 for( i=0;i<c;i++)
		 {   
			 if(i==ex) r-=1;
			for( j=0;j<r;j++)
			{
				if(ch[j][i]!='0')
					ans+=ch[j][i];
			}
			ans+=" ";
		 }
		 
		 return ans;
		 
	    }

}
