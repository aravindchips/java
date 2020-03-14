
public class Student {
	
		String sname;
		String sid;
		float total;
		//float  esal;
		Student(String sname,String sid,float total){
			this.sname=sname;
			this.sid=sid;
			this.total=total;
		}
		
		@Override
		public String toString() {
			return "Student [sname=" + sname + ", sid=" + sid + ", total=" + total + "]";
		}

		public boolean equals(Object obj) {
			Student st=(Student)obj;
			if(sname.equals(st.sname)&& sid.equals(st.sid)&& total==st.total) {
				return true;
			}
			else {
				return false;
			}
		}

	}



