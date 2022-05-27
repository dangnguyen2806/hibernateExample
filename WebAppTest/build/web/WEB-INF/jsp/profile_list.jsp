<%-- 
    Document   : profile_list
    Created on : May 24, 2022, 4:05:28 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile List</title>

        <!-- css -->
        <link href="<c:url value="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"/>" rel='stylesheet' type='text/css'/>

        <!--js-->
        <script src="<c:url value="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="//code.jquery.com/jquery-1.11.1.min.js" />"></script>
        <script src="<c:url value="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" />"></script>
        <script src="<c:url value="http://getbootstrap.com/dist/js/bootstrap.min.js" />"></script>

    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col col-xs-6">
                    <h4>Profile List</h4>
                    <a href="${pageContext.request.contextPath}/profile/create.html">Create New</a>
                </div>
                <div class="col col-xs-6 text-right">
                    <ul class="pagination pull-right">
                        <li><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
                        <c:forEach var="i" begin="0" end="${totalItem}">
                            <li>
                                <a href="${pageContext.request.contextPath}/profile/list/${i+1}.html"><c:out value="${i+1}"/></a>
                            </li>
                        </c:forEach>
                        <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
                    </ul>
                </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
                <div class="col-md-12"><br />
                    <div class="table-responsive">
                        <table id="mytable" class="table table-bordred table-striped">
                            <thead>
                                <th>Image</th>
                                <th>Name</th>
                                <th>Date of Birth</th>
                                <th>Position</th>
                                <th>Current Club</th>
                                <th style="width: 50px;">Edit</th>
                                <th style="width: 50px;">Delete</th>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${listProfile}">
                                    <tr>
                                        <td><image width="100px" src="${item.profileImage}"/></td>
                                        <td>${item.profileName}</td>
                                        <td>${item.profileDateofBirth}</td>
                                        <td>${item.profilePosition}</td>
                                        <td>${item.profileCurrentClub}</td>
                                        <td><a class="btn btn-default" href="${pageContext.request.contextPath}/profile/edit/${item.profileId}.html"><span class="glyphicon glyphicon-pencil"></span></a></td> 
                                        <td><a class="btn btn-default" href="${pageContext.request.contextPath}/profile/delete/${item.profileId}.html"><span class="glyphicon glyphicon-trash"></span></i></a></td> 
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
