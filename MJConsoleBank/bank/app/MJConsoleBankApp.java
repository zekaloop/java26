package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.MJAccountService;
import bank.app.menu.StartMenu;
import bank.member.MemberListDao;
import bank.member.MemberService;
import bank.member.MJMemberService;

public class MJConsoleBankApp {
	public static void main(String[] args) {
		MemberService ms = new MJMemberService(new MemberListDao());
		AccountService as = new MJAccountService(new AccountListDao());
		
		new StartMenu(as, ms).run();
	}
}
