package Ex1_28;
/*
 * Author: Pham Thi Kim Hien
 * Date: 5/9/2016
 * Version: 1.0
 */
public class MobiObserver extends Observer{
	public MobiObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	// Notify to mobile  when account change
	@Override
	public String update() {
		return "Mobi: Xin chao. Tai khoan cua quy khach da thay doi.\nSo du hien tai: " + account.getState() + " vnd";
	}
}
