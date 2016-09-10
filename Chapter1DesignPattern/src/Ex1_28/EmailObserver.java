package Ex1_28;
/*
 * Author: Pham Thi Kim Hien
 * Date: 5/09/2016
 * Version: 1.0
 */
public class EmailObserver extends Observer {
	public EmailObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	// Notify to mobile  when account change
	@Override
	public String update() {
		return "Email: Ngan hang AA khinh chao quy khach. Tai khoan cua quy khach da thay doi.\nSo du tainkhoan hien tai la: " + account.getState() + " vnd";
	}
}
