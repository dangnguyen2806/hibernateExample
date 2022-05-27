<%-- 
    Document   : profile_form
    Created on : May 24, 2022, 4:05:43 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Form</title>

        <!-- css -->
        <link href="<c:url value="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"/>" rel='stylesheet' type='text/css'/>

        <!--js-->
        <script src="<c:url value="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js" />"></script>
        <script src="<c:url value="//code.jquery.com/jquery-1.11.1.min.js" />"></script>

    </head>
    <body>

        <div class="container">
            <br/>
            <div class="row">
                <div class="col col-xs-6">
                    <a href="${pageContext.request.contextPath}/profile/list.html">Profile List</a>
                </div>
                <div class="col col-xs-6 text-right">
                </div>
            </div>
            <div class="clearfix"></div>
            <fieldset>
                <form:form method="POST" modelAttribute="profile" 
                           action="${pageContext.request.contextPath}/profile/save.html" class="form-horizontal">
                    <legend>Profile</legend>
                    <div class="form-group">
                        <label class="col-sm-3 control-label" for="card-holder-name">Name:</label>
                        <div class="col-sm-9">
                            <form:input path="profileName" class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label" for="card-number">Image URL:</label>
                        <div class="col-sm-9">
                            <form:input path="profileImage" class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label" for="cvv">Date of Birth:</label>
                        <div class="col-sm-3">
                            <form:input path="profileDateofBirth" class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label" for="expiry-month">Position & Current Club:</label>
                        <div class="col-sm-9">
                            <div class="row">
                                <div class="col-xs-3">
                                    <form:select path="profilePosition" class="form-control col-sm-2">
                                        <form:option value="NONE" label="--- Position ---"/>
                                        <form:options items="${listPostion}" />
                                    </form:select>
                                </div>
                                <div class="col-xs-3">
                                    <form:select path="profileCurrentClub" class="form-control col-sm-2">
                                        <form:option value="NONE" label="--- Current Club ---"/>
                                        <form:options items="${listClub}" />
                                    </form:select>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <input type="submit" value="Submit" class="btn btn-success"/>
                        </div>
                    </div>
                </form:form>
            </fieldset>
        </div>

    </body>
</html>
