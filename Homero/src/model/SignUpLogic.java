package model;

public class SignUpLogic {

		public boolean textCheck(String userId,String pass,String confirmPass) {
			//文字数の確認
			if(userId.length() < 4 || userId.length() > 20 ||
			   pass.length() < 4 || pass.length() > 20) {
			}	return false;
			 
			
			}
}	 
			 

