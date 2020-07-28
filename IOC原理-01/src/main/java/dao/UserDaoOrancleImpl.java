package dao;

public class UserDaoOrancleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Oracle获取用户数据UserDaoImpl");
    }
}
