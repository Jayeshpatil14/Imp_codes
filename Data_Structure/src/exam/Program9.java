package exam;

public class Program9 {

	 public static void main(String[] args) {
	        String a = "hanmant\\nShinde\\\be\\nabcd";
	        String[] b = a.split("\\\\");
	        System.out.print(b[0]);
	 
	        for (String c : b){
	            char[] d = c.toCharArray();

	            if(d[0] == 'b'){
	                System.out.print("\b");
	                String e = c.substring(1, d.length);
	                System.out.print(e);
	            }
	            if(d[0] == 'n'){
	                System.out.print("\n");
	                String e = c.substring(1, d.length);
	                System.out.print(e);
	            }

	        }
	         
	    }
	    
}
