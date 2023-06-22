package model;

public class SignUpLogic {

	//ユーザーIDの入力値のチェック
		public boolean isValidUserId(String userId) {
			String regex = "^[a-zA-Z0-9 ]{4,20}$";
			return userId.matches(regex);
		}
	//パスワードの入力値のチェック
		public boolean isValidPass(String pass) {
			String regex = "^[a-z0-9]{8,16}$";
			return pass.matches(regex);
		}
		}
	 
			 

