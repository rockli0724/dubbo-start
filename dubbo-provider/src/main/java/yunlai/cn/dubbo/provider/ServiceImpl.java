package yunlai.cn.dubbo.provider;

import java.util.ArrayList;
import java.util.List;

import yunlai.cn.dubbo.api.Service;
import yunlai.cn.dubbo.api.vo.User;

public class ServiceImpl implements Service {

	@Override
	public List<String> getPermissions(Long id) {
		List<String> list = new ArrayList<>();
		list.add(String.format("Permission_%d", id - 1));
		list.add(String.format("Permission_%d", id));
		list.add(String.format("Permission_%d", id + 1));
		return list;
	}

	@Override
	public List<User> queryAll() {
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User user = new User();
            user.setAge(10 + i);
            user.setId(Long.valueOf(i + 1));
            user.setPassword("123456");
            user.setUsername("username_" + i);
            list.add(user);
		}
		return list;
	}

}
