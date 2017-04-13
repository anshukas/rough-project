package fibonacci;

import org.apache.catalina.realm.UserDatabaseRealm;

public class UserDatabaseRealmWSS extends UserDatabaseRealm {

	protected final String info = "fibonacci.UserDatabaseRealmWSS/1.0";

	public String getInfo() { return info; }

	protected static final String name = "UserDatabaseRealmWSS";

	protected String getName() { return name; }

	/**
	 * This is the only new method. It is public, as opposed to getPassword,
	 * which is protected. It is the only reason we have this class.
	 */
	public String getPasswordWSS (String username) {
		return getPassword(username);
	}
}

