package display ;

import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.* ;
import javax.servlet.http.* ;
import common.db.* ;

public class DisplayAction extends Action
{       private boolean noData = false;
	ResultSet rs = null ; 
        EmployeeDetails bean = null;
        List<EmployeeDetails> beanList = null;
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception
	{
	HttpSession session = request.getSession( true ) ;	
	EmployeeDetails userReg = ( EmployeeDetails ) form ; 
                userReg.setEid ( request.getParameter ( "Eid" ) ) ; 
		 
		
		String selectQuery= "select * from EmployeeDetails";
	
		
			
			 
              
			rs = SQLExecuter.executeRSQuery ( selectQuery ) ;
                        session.setAttribute("result",rs);
		
				
		return  mapping.findForward("success");
		
	}	
} 
