package util;

public class SqlMark {
 public String lineBreak(String src) {
	 StringBuffer dest=new StringBuffer();
	 	
	 for(int i=0;i<src.length();i++) {
		 if(src.charAt(i)=='\n')
			 dest.append("<br>");
		 else
			 dest.append(src.charAt(i));
	 }
	 return dest.toString();
 }
}
