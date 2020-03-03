package softtest;

public class homework {
	public static int isOk(int number){
		
		int flag=0;
		
		for(int i=0;i<=1;i++){
			for(int j=0;j<=1;j++){
				for(int k=0;k<=1;k++){
					for(int l=0;l<=2;l++){
						for(int m=0;m<=3;m++){
							if(i*50+j*20+k*10+l*5+m==number){
								flag=1;
								break;
							}
						}
					}
				}
			}
		}
		
		
		return flag;
	}
	
	public static void homework(int number){
		if(isOk(number)==1){
			System.out.println("I can take out "+ number+ " yuan");
		}
		else{
			System.out.println("I can not take out "+ number+" yuan");
		}
	}
}
