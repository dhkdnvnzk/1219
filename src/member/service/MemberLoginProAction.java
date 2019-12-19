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

public class MemberLoginProAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao=MemberDAO.getInstance();
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
		SHA256 s = new SHA256(pass.getBytes());
		BASE64Encoder Base64Encoder = new BASE64Encoder();
		pass=Base64Encoder.encode(s.GetHashCode());
		int row=dao.memberLogin(id, pass);	
		//request.setAttribute("row", row);
		if(row==1) { //로그인 성공
			MemberVO user = dao.getMember(id);
			//세션 설정
			HttpSession session = request.getSession(); // 세션 객체 생성
			session.setAttribute("user", user);
			session.setMaxInactiveInterval(1800); // 세션 유지 시간 30분
			
		
		RequestDispatcher rd = request.getRequestDispatcher("/Contents/Member/login_ok.jsp");
		rd.forward(request, response);
		}
		else  {
			
			RequestDispatcher rd = request.getRequestDispatcher("MemberServlet?command=member_login");
			rd.forward(request, response);
	}
	}
}
