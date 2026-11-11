package bank.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMapDao implements AccountDao {

    Map<Integer, Account> accountDB = new HashMap<Integer, Account>();

    @Override
    public boolean save(Account a) {
        if (accountDB.containsKey(a.getNo())) {
            return false;
        }
        accountDB.put(a.getNo(), a);
        return true;
    }

    @Override
    public List<Account> findAll() {
        List<Account> alist = new ArrayList<>();
        for (Account a : accountDB.values()) {
            alist.add(a);
        }
        return alist;
    }

    @Override
    public Account findByNo(int no) {
        return accountDB.get(no);
    }

    @Override
    public List<Account> findByMember(String id) {
        List<Account> alist = new ArrayList<>();
        for (Account a : accountDB.values()) {
            if (a.getMemberId().equals(id)) {
                alist.add(a);
            }
        }
        return alist;
    }

    @Override
    public boolean update(Account a) {
        if (!accountDB.containsKey(a.getNo())) {
            return false;
        }
        accountDB.put(a.getNo(), a);
        return true;
    }

    @Override
    public boolean delete(Account a) {
        if (a == null) {
            return false;
        }
        return accountDB.remove(a.getNo()) != null;
    }
}
