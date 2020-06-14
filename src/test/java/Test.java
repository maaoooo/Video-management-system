import com.maaoooo.pojo.Video;
import com.maaoooo.service.VideoService;
import com.maaoooo.service.VideoServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;
import java.util.List;

/**
 * @author lzr
 * @date 2020 06 13 22:10
 * @description
 */
public class Test {
    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        VideoService videoService=context.getBean(VideoServiceImpl.class);
        List<Video> videos = videoService.queryAllVideo();
        for (Video video : videos) {
            System.out.println(video);
        }
    }
    @org.junit.Test
    public void test1(){
        ResultSet rs=null;
        Statement stmt=null;
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//使用驱动连接数据库
            String url="jdbc:mysql://localhost:3306/videodata?useSSL=false&useUnicode=true&characterEncoding=utf-8";
            String user="root";
            String password="root";
            con = DriverManager.getConnection(url,user,password);//建立连接
            stmt = con.createStatement();
            String sql="select * from videodata.video";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
