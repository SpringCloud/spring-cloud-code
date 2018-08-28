package cn.springcloud.book.config.security;

import cn.springcloud.book.config.models.JwtUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zzf
 * @date: 2018/6/30
 * @time: 22:10
 * @description :
 */
@Service("userDetailsService")
public class MemberServiceImpl implements UserDetailsService {

    private static final PasswordEncoder BCRYPT = new BCryptPasswordEncoder();

    // 这里的用户名和密码读者可以从数据库中获取
    @Value("${spring.security.user.name}")
    private String hardcodedUser;

    @Value("${spring.security.user.password}")
    private String password;

    @Override
    public JwtUser loadUserByUsername(String username) throws UsernameNotFoundException {

        // 对密码进行加密
        String hardcodedPassword = BCRYPT.encode(password);
        if (username.equals(hardcodedUser) == false) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        }else{

            SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("ROLE_USER");
            List<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();
            grantedAuthorityList.add(simpleGrantedAuthority);
            return new JwtUser(hardcodedUser, hardcodedPassword, grantedAuthorityList);
        }
    }
}
