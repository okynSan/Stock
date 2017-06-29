<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css"
              href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
        <script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
    </head>


    <body>


        <div id="base_form" align = "left" >
            <div class="payment_table">
                <table border="1" >
                    <tr>
                        <th>ID</th>>
                        <th>Month</th>
                        <th>Name of payment</th>
                        <th>Sum</th>
                        <th>Payer</th>
                    </tr>
                    <c:forEach items="${paymentList}" var="payment">
                        <tr>
                            <td>${payment.id}</td>
                            <td>${payment.month}</td>
                            <td>${payment.nameOfPayment}</td>
                            <td>${payment.sum}</td>
                            <td>${payment.payer}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>

            <div class="payment_form">
                <!--<div id="payment_insert_form" align="left">-->
                <form:form method="POST" action="getHello" modelAttribute="payment">
                    <table>
                        <tr>
                            <td>
                        <form:label path="id">ID:</form:label>
                        </td>
                        <td>
                            <form> 
                                <input  path="id" value="${payment.id}"/>
                            </form>
                        </td>
                        </tr>
                        <tr>
                            <td>
                        <form:label path="id">Month:</form:label>
                        </td>
                        <td>
                            <form>
                                <input type="text" value="${payment.month}"/>
                            </form>
                        </td>
                        </tr>
                    </table> 
                </form:form>
            </div>
            <!--</div>-->

        </div>

        <script type="text/javascript"
        src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
