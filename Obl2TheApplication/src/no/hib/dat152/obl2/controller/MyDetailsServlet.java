package no.hib.dat152.obl2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hib.dat152.obl2.database.SearchItem;
import no.hib.dat152.obl2.database.SearchItemDAO;
import no.hib.dat152.obl2.database.AppUser;

@WebServlet("/mydetails")
public class MyDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (RequestHelper.isLoggedIn(request)) {
			
			AppUser user = (AppUser) request.getSession().getAttribute("user");

			SearchItemDAO searchItemDAO = new SearchItemDAO();
			List<SearchItem> myhistory = searchItemDAO
					.getSearchHistoryForUser(user.getUsername());

			request.setAttribute("myhistory", myhistory);

			request.getRequestDispatcher("mydetails.jsp").forward(request,
					response);
		} else {
			request.getSession().invalidate();
			request.getRequestDispatcher("index.html").forward(request,
					response);
		}
	}
}
