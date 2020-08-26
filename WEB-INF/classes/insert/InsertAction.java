
package insert;

import javax.servlet.*; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.db.* ;
import common.data.*;
public class InsertAction extends Action
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
		userReg.setAddress ( request.getParameter ( "Address" ) ) ; 
		userReg.setDesignation ( request.getParameter ( "Designation" ) ) ; 
		 
		userReg.setPhnno ( request.getParameter ( "Phnno" ) ) ; 
                userReg.setSalary ( request.getParameter ( "Salary" )  ) ;
		String insertQuery = 
				QueryFormatter.formCreateQuery ( userReg ) ;
		SQLExecuter.executeUpdateQuery ( insertQuery ) ;
		return mapping.findForward("success") ; 
	}


      
} 
