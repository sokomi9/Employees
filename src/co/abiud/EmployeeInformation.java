package co.abiud;
//Bean/Model/Plain Old Java Object (POJO)
public class EmployeeInformation {
          //Attributes
	     private int eid;
	     private String ename;
	      private Address eaddress;
		
	      //Methods
	      public EmployeeInformation() {
				
			}
	   //constructor injection
		public EmployeeInformation(Address eaddress) {
	
			this.eaddress = eaddress;
		}


		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}
      //setter injection
		public Address getEaddress() {
			return eaddress;
		}

		public void setEaddress(Address eaddress) {
			this.eaddress = eaddress;
		}
		
       
		@Override
		public String toString() {
			return "EmployeeInformation [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
		}

		public void myInt() {
			System.out.println("Object initialized");
		}
		public void myDestroy() {
			System.out.println("Object destroyed");
		}
	      
}
