$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Busqueda de Productos",
  "description": "Esta caracteristica permite a los clientes realizar busquedas de\r\nproductos que desean comprar en la tienda virtual\r\nSe presenta informacion como precio, stock, colores.",
  "id": "busqueda-de-productos",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4784858800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Busqueda exitosa de producto",
  "description": "Este escenario consiste en realizar una busqueda\r\nque retorne al menos un producto como resultado.",
  "id": "busqueda-de-productos;busqueda-exitosa-de-producto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "El cliente se encuentra en la pagina de busqueda",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "realice la busqueda de productos con el termino \"blouse\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "cambia la visualizacion de resultados a modo lista",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "se muestra el producto con el precio \"$27.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchProductSteps.elClienteSeEncuentraEnLaPaginaDeBusqueda()"
});
formatter.result({
  "duration": 4437483300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "blouse",
      "offset": 49
    }
  ],
  "location": "SearchProductSteps.realiceLaBusquedaDeProductosConElTermino(String)"
});
formatter.result({
  "duration": 2951174700,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductSteps.cambiaLaVisualizacionDeResultadosAModoLista()"
});
formatter.result({
  "duration": 99975600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$27.00",
      "offset": 38
    }
  ],
  "location": "SearchProductSteps.seMuestraElProductoConElPrecio(String)"
});
formatter.result({
  "duration": 53665400,
  "status": "passed"
});
formatter.after({
  "duration": 1071979500,
  "status": "passed"
});
});