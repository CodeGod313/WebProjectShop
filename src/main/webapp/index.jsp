<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="by.vita02.webprojectshop.parser.ShopParserSax" %>
<%@ page import="by.vita02.webprojectshop.parser.ShopParserDOM" %>
<%@ page import="by.vita02.webprojectshop.entity.Shop" %>
<%@ page import="java.util.List" %>
<%@ page import="by.vita02.webprojectshop.entity.Clothes" %>
<%@ page import="java.io.IOException" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>SHOP</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
            integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
            crossorigin="anonymous"></script>
</head>

<body>
<h1 style="text-align: center">
    Товары, представленные в магазине
</h1>
<table class="table table-sm">
    <thead>
    <tr>
        <th>
            Тип
        </th>
        <th>
            Модель
        </th>
        <th>
            Цена
        </th>
    </tr>
    </thead>
    <%
        ShopParserDOM parserDOM = new ShopParserDOM();
        Shop shop = parserDOM.parse();
    %>
    <tbody>
    <%
        List<Clothes> clothesList = shop.getClothes();
        for (int i = 0; i < clothesList.size(); i++) {
            out.println("<tr>");
            out.println("<td>" + clothesList.get(i).getType() + "</td>");
            out.println("<td>" + clothesList.get(i).getModel() + "</td>");
            out.println("<td>" + clothesList.get(i).getPrice() + "</td>");
            out.println("</tr>");
        }
    %>
    </tbody>
</table>
</body>

</html>