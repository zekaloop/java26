package bank.member;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

// Member정보를 List 형태로 저장한다
// 데이터는 ArrayList로 관리한다
public class MemberListDao implements MemberDao{
	
	List<Member> memberDB = new ArrayList<>();
//	List<Member> memberDB = new LinkedList<E>();
	
	@Override
	public boolean save(Member m) {
		return memberDB.add(m);
	}

	@Override
	public List<Member> findAll() {
		if(memberDB.size() == 0) return null;
		
		List<Member> members = new ArrayList<>();
		for (Member m : memberDB) {
			members.add(m);
		}
		return members;
	}

	@Override
	public Member findById(String id) {
		for(Member m : memberDB) {
			if(m.getId().equals(id)) {
				return m;
			} 
		}
		
		return null;
	}

	@Override
	public boolean update(Member m) {
		/* 업데이트를 하는 방법
		 * 1) 해당 값이 있는 list를 지우고 새로운 값 add
		 * 2) 해당 index에 있는 곳에 값만 변경 (List 컬렉션의 set(), indexOf() 메서드 이용)
		 * */
		Member target = findById(m.getId());
		if(target == null) return false;
		/* 1)
		 * memberDB.remove(target);
		 * memberDB.add(m);
		 */
		
		int index = memberDB.indexOf(target);
		memberDB.set(index, m);
		return true;
	}

	@Override
	public boolean delete(Member m) {
		Member target = findById(m.getId());
		if(target == null) return false;
		memberDB.remove(m);
		return true;
	}
	
}
