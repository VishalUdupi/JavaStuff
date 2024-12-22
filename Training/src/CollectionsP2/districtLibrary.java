package CollectionsP2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Member{
	private int memberId;
	private String memberName;
	private String address;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Member() {
		
	}
	public Member(int memberId, String memberName, String address) {
		this.memberId=memberId;
		this.memberName=memberName;
		this.address=address;
	}
}

class Library{
	private List<Member> memberList = new ArrayList<Member>();

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	public void addMember(Member memberObj) {
		memberList.add(memberObj);
	}
	public List<Member> viewAllMembers(){
		return memberList;
	}
	public List<Member> viewMembersByAddress(String address){
		ArrayList<Member> result=new ArrayList<Member>();
        Iterator<Member> iter=memberList.iterator();
        while(iter.hasNext())
        {
            Member b= iter.next();
            if(b.getAddress().equalsIgnoreCase(address))
            result.add(b);
        }
        return result;
	}
}

public class districtLibrary {
	public static void main(String[] args) {
		
	}
}
