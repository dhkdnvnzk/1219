package member.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import KISA.SHA256;
import member.model.MemberDAO;
import member.model.MemberVO;
import service.Action;
import sun.misc.BASE64Encoder;

public class MemberLoginAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/Contents/Member/login.jsp");
		rd.forward(request, response);
		
	}

}
