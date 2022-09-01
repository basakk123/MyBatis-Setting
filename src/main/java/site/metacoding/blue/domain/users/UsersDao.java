package site.metacoding.blue.domain.users;

public interface UsersDao {
	public void insert(Users user);
	public Users findById(Integer id);
}
