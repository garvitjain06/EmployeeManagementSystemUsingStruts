package delete ;

import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.db.* ;

public class DeleteAction extends Action
{
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception
	{
		
		EmployeeDetails userReg = ( EmployeeDetails ) form ; 
                userReg.setEid ( request.getParameter ( "Eid" ) ) ; 
		
		
		String updateQuery= QueryFormatter.formDeleteWhereQuery(userReg,"Eid");
	
		
			SQLExecuter.executeUpdateQuery ( updateQuery ) ;
			 
				return mapping.findForward("success");
                               
			
				
			  
	}
      
} 
