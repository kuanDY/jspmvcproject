package com.playdata.util;

import javax.servlet.ServletContext;
import java.sql.Connection;

public interface DBUtil {
    //여기서는 추상화 된 애들만 만들어야함
    Connection getConnection(ServletContext servletContext);


}
