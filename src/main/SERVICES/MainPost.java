package SERVICES;

import DAO.FindElement;
import ENTITY.ResultEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MainPost extends HttpServlet {
        private static final long serialVersionUID=1L;

        public MainPost(){
            super();
        }

        protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            ResultSet result= FindElement.find(request.getParameter("name"),request.getParameter("surname"));
            List<ResultEntity> resList = new ArrayList<ResultEntity>();
            try {
             while (result.next()) {
                ResultEntity res=new ResultEntity();
                    res.setName(result.getString("name"));
                    res.setSurname(result.getString("surname"));
                    res.setPhone(result.getString("phone"));
                    res.setEmail(result.getString("email"));
                resList.add(res);
           }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.setAttribute("mybean",resList);
            request.getRequestDispatcher("usebean.jsp").forward(request,response);
        }
}