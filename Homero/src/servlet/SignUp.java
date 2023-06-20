package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		String confirmPass = request.getParameter("confirmPass");
		
		if(!pass.equals(confirmPass)) {
			request.setAttribute("errorMsg","パスワードが一致しません");
			RequestDispatcher dispatcher = request.getRequestDispatcher("signUp.jsp");
			dispatcher.forward(request, response);
		}else {
			//有効時の処理
			//DBへ送信
			//セッションスコープへ保存
			//ホーム画面へフォワード
		}
	}

}
