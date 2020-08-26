package update ;

import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.db.* ;

public class UpdateAction extends Action
{
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception
	{
		
		EmployeeDetails userReg = ( EmployeeDetails ) form ; 
                userReg.setEid ( request.getParameter ( "Eid" ) ) ; 
		userReg.setEmployeeName ( request.getParameter ( "EmployeeName" ) ) ; 
		
		String updateQuery= QueryFormatter.formUpdateWhereQuery(userReg,"EmployeeName","Eid");
	
		
			SQLExecuter.executeUpdateQuery ( updateQuery ) ;
			 
				return mapping.findForward("success");
                               
			
				
			  
	}
      
} 
