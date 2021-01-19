Feature: Busqueda de Productos
  Esta caracteristica permite a los clientes realizar busquedas de
  productos que desean comprar en la tienda virtual
  Se presenta informacion como precio, stock, colores.

  Scenario: Busqueda exitosa de producto
    Este escenario consiste en realizar una busqueda
    que retorne al menos un producto como resultado.

    Given El cliente se encuentra en la pagina de busqueda
    When  realice la busqueda de productos con el termino "blouse"
    And   cambia la visualizacion de resultados a modo lista
    Then  se muestra el producto con el precio "$27.00"


