package update ;

import javax.servlet.http.HttpServletRequest ;
import javax.servlet.* ;
import org.apache.struts.action.* ;



public class EmployeeDetails extends ActionForm
{
	private String Eid		;
	private String EmployeeName	;
	private String Address	;
	private String Designation	;
	private String Phnno		;
	private String Salary			;
	
	public String getEid ()	{ return Eid ;	}
	public String getEmployeeName ()	{ return  EmployeeName ; }
	public String getAddress ()	{ return Address ; }
	public String getDesignation ()	{ return Designation ;	}
	public String getPhnno ()		{ return Phnno ;		}
	public String getSalary ()		{ return Salary ;	}
	

	public void setEid ( String Eid )		{ this.Eid = Eid ;	}  
	public void setEmployeeName ( String EmployeeName )	{ this.EmployeeName = EmployeeName  ; }  
	public void setAddress ( String Address )		{ this.Address = Address ;	}  
	public void setDesignation ( String Designation )		{ this.Designation = Designation ;	}  
	public void setPhnno  ( String Phnno )			{ this.Phnno = Phnno ;	}  
	public void setSalary ( String Salary )			{ this.Salary = Salary ;	}  
	
	public void reset(ActionMapping mapping, HttpServletRequest request) 
	{ 
    }

	public ActionErrors validate( 
      ActionMapping mapping, HttpServletRequest request ) 
	{
		System.out.println("In validate...");
		return null ;
	}

	public String toString()
	{
		return        Eid + "," +  EmployeeName + "," + Address + "," +  Designation
				+ "," + Phnno + "," + Salary ;
	}
      
}
