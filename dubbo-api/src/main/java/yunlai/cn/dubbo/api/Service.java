package yunlai.cn.dubbo.api;

import java.util.List;

import yunlai.cn.dubbo.api.vo.User;

/**
 * 
 * @author Rock
 * @Date 2018年5月14日 上午10:07:57
 * @JDK 1.8
 */
public interface Service {

	List<String> getPermissions(Long id);

	List<User> queryAll();
}
