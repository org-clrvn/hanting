package com.sy.hting.vo.gsh;

import java.util.Date;

public class IntegralVo {
		private int irID;
		private String userName;
		private Date irDate;
		private String irDescribe;
		private int recordInAndOut;
		public int getIrID() {
			return irID;
		}
		public void setIrID(int irID) {
			this.irID = irID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Date getIrDate() {
			return irDate;
		}
		public void setIrDate(Date irDate) {
			this.irDate = irDate;
		}
		public String getIrDescribe() {
			return irDescribe;
		}
		public void setIrDescribe(String irDescribe) {
			this.irDescribe = irDescribe;
		}
		public int getRecordInAndOut() {
			return recordInAndOut;
		}
		public void setRecordInAndOut(int recordInAndOut) {
			this.recordInAndOut = recordInAndOut;
		}
}
