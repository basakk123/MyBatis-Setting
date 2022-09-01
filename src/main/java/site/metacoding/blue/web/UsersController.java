package site.metacoding.blue.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.users.Users;
import site.metacoding.blue.domain.users.UsersDao;

@RequiredArgsConstructor
@RestController
public class UsersController {

	private final UsersDao usersDao;
	
	@GetMapping("/users/{id}")
	public Users getUsers(@PathVariable Integer id) {
		return usersDao.findById(id);
	}
}
