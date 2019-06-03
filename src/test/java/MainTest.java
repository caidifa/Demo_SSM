import com.cai.entity.UserInfo;
import com.cai.mapper.UserInfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by caibaolong on 2019/5/31.
 */
public class MainTest {
    @Test
    public void userTest() throws IOException {

//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object dataSource = ac.getBean("dataSource");
//        System.out.println(dataSource.toString());

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);


        List<UserInfo> userInfoList = mapper.list();
        for (UserInfo u : userInfoList) {
            System.out.println(u.toString());
        }

        UserInfo userInfo = mapper.get(2);
        userInfo.setUserName("shasha");
        mapper.update(userInfo);

        userInfoList =mapper.list();
        for (UserInfo u : userInfoList) {
            System.out.println(u.toString());
        }

        session.commit();
        session.close();

    }

    public static void main(String[] args) throws IOException {

    }
}
