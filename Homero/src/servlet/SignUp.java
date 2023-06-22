package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SignUpLogic;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//リクエストパラメータの取得
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		String confirmPass = request.getParameter("confirmPass");
	//確認パスワードの入力チェック	
		if(!pass.equals(confirmPass)) {
			request.setAttribute("errorMsg","パスワードが一致しません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/signUp.jsp");
			dispatcher.forward(request, response);
		}	
		SignUpLogic signUpLogic = new SignUpLogic();
		if(!signUpLogic.isValidUserId(userId)) {
		request.setAttribute("errorMsg", "ユーザー名は英数字で4〜20字です");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/signUp.jsp");
		dispatcher.forward(request, response);
		}
		if(!signUpLogic.isValidPass(pass)){
		request.setAttribute("errorMsg","パスワードは8〜16字です");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/signUp.jsp");
		dispatcher.forward(request, response);
		}
            //有効時の処理
			//DBへ送信
			//セッションスコープへ保存
			//ホーム画面へフォワード
		}
	}


