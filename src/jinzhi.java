import java.util.Scanner;


public class jinzhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��9����������һ��11������");
		String in_9or11 = sc.next();
		
		int n_10 = change(in_9or11); 
		System.out.println("n_10="+n_10);
	}

	public static int change(String a){
		String in = a;
		int out = 0;
		int temp = -1;
		int j = 1; //λ��
		
		in = a.substring(2);
		while(in.substring(0,1).equals("0")){
			in = in.substring(1);
			
		}
		if(in.length() > 8){
			out = -1;
			return out;
		}
		
		in = a.substring(0,2);
		if("0v".equals(in) || "0V".equals(in)){
			in = a.substring(2);
			for(int i = in.length() ; i>0 ; i--){
				//��ASC�ж��Ƿ���Ϲ淶
				if(in.substring(i-1,i).getBytes()[0] > 57 || in.substring(i-1,i).getBytes()[0] < 48){
					out = -1;
					return out;
				}
				temp = Integer.parseInt(in.substring(i-1,i));
				out += temp*j;
				j = j*9;
			}
			
			
		}else if("0w".equals(in) || "0W".equals(in)){
			in = a.substring(2);
			for(int i = in.length() ; i>0 ; i--){
				//��ASC�ж��Ƿ���Ϲ淶
				if( (in.substring(i-1,i).getBytes()[0] <= 57 && in.substring(i-1,i).getBytes()[0] >= 48) || in.substring(i-1,i).getBytes()[0] == 97 || in.substring(i-1,i).getBytes()[0] == 65){
					if(in.substring(i-1,i).equals("a") || in.substring(i-1,i).equals("A")){
						temp = 10;
					}else{
						temp = Integer.parseInt(in.substring(i-1,i));
					}
					out += temp*j;
					j = j*11;
				}else {
					out = -1;
					return out;
				}
				
			}
		}else{
			out = -1;
		}
		
		return out;
	}
}
  