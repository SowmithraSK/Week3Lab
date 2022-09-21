package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        //Validation here
        if(first == null || first.equals("") || second == null || second.equals("")){
            request.setAttribute("message", "Invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        int fInt = 0;
        int sInt = 0;
        try{
            fInt = Integer.parseInt(first);
            sInt = Integer.parseInt(second);
        } catch(NumberFormatException e){
            request.setAttribute("message", "Invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        
        
        request.setAttribute("first", fInt);
        request.setAttribute("second", sInt);
        
        int answer = 0;
        if(request.getParameter("add") != null){
            answer = (fInt + sInt);
        } else if(request.getParameter("subtract") != null){
            answer = (fInt - sInt);
        } else if(request.getParameter("multiply") != null){
            answer = (fInt * sInt);
        } else if(request.getParameter("remainder") != null){
            answer = (fInt % sInt);
        }
        request.setAttribute("message", answer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    
}
