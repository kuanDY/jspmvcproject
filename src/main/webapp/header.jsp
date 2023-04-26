<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
    <nav>
        <ul class="dropdown-item" >
            <li>Home</li>
            <li>About</li>
            <li>Board</li>

            <c:choose>
                <c:when test="${sessionScope.username != null}">
                    <li><<a href="logout" class="dropdown-item">로그아웃</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="login.jsp class="dropdown-item">로그인</a></li>
                    <li><a href="register.jsp class="dropdown-item">회원가입</a></li>
                </c:otherwise>
            </c:choose>


        </ul>
    </nav>


</header>